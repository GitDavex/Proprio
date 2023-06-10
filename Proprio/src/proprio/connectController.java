package proprio;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*; 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class connectController implements Initializable {

    @FXML
    private Button gate;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private StackPane stackpane;

    PreparedStatement prepare = null;
    ResultSet result = null;

    @FXML
    void gateBtn(ActionEvent event) throws SQLException, IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("zeus.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Proprio - Managment");
        Connection connect = dbconnector.connectDb();
        String sql = "SELECT * FROM proprietaire WHERE login = ? AND mot_de_passe = ?";

        try{
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, usernameField.getText());
            prepare.setString(2, passwordField.getText());
            result = prepare.executeQuery();
            Alert alert;
            
            if(usernameField.getText().isEmpty() || passwordField.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Erreur de saisie");
                alert.setHeaderText(null);
                alert.setContentText("Veuillez remplir tous les champs.");
                alert.showAndWait();
            }else{
                if(result.next()){
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Succès");
                    alert.setHeaderText(null);
                    alert.setContentText("Vous êtes connecté.");
                    alert.showAndWait();
                    
                    gate.getScene().getWindow().hide();
                    stage.setResizable(false);
                    stage.show();                    
                }else{
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Erreur de connexion");
                    alert.setHeaderText(null);
                    alert.setContentText("Nom d'utilisateur ou mot de passe incorrect.");
                    alert.showAndWait();
                    usernameField.setText("");
                    passwordField.setText("");
                }
            }
            
        }catch(Exception e){e.printStackTrace();}
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }



}

