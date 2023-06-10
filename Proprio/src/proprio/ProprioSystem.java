package proprio;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProprioSystem extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("connexion.fxml"));
        Parent root = loader.load();
         // Passer la référence de la fenêtre principale au contrôleur de connexion
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Proprio - Connexion");
        
        //primaryStage.hide(); // Cacher la fenêtre principale au démarrage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
