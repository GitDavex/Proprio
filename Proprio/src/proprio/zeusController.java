package proprio;

import java.util.Optional;
import java.util.ResourceBundle;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class zeusController implements Initializable{

    @FXML
    private Button addHomeGestion;

    @FXML
    private AnchorPane addHomeSet_form;

    @FXML
    private Button addHome_form;

    @FXML
    private Button addLocationG;

    @FXML
    private Pane pane;

    @FXML
    private AnchorPane addLocationSet_form;

    @FXML
    private Button addLocation_form;

    @FXML
    private Button addPersonGestion_form;

    @FXML
    private AnchorPane addPersonSet_form;

    @FXML
    private Button addPerson_form;

    @FXML
    private TextField administrateurDelHome;

    @FXML
    private TextField administrateurInfoHome;

    @FXML
    private TextField adresseAddHome;

    @FXML
    private TextField adresseDelHome;

    @FXML
    private TextField adresseInfoHome;

    @FXML
    private TextField adresseUpHome;

    @FXML
    private ImageView backAddHome;

    @FXML
    private ImageView backAddLocationSet;

    @FXML
    private ImageView backAddPersonSet;

    @FXML
    private ImageView backDelHome;

    @FXML
    private ImageView backDelLocation;

    @FXML
    private ImageView backDelPersonSet;

    @FXML
    private ImageView backInfoHome;

    @FXML
    private ImageView backInfoPersonSet;

    @FXML
    private ImageView backLocationInfo;

    @FXML
    private ImageView backUpHome;

    @FXML
    private ImageView backUpLocationSet;

    @FXML
    private ImageView backUpPersonSet;

    @FXML
    private Button bureauBtn_panel;

    @FXML
    private AnchorPane bureauForm;

    @FXML
    private TextField cniFieldAddLocationSet;

    @FXML
    private TextField cniFieldAddPersonSet;

    @FXML
    private TextField cniFieldDelLocation;

    @FXML
    private TextField cniFieldDelPersonSet;

    @FXML
    private TextField cniFieldInfoLocation;

    @FXML
    private TextField cniFieldInfoPersonSet;

    @FXML
    private TextField cniFieldUpLocation;

    @FXML
    private TextField cniFieldUpPersonSet;

    @FXML
    private ComboBox<String> comboAdministrateurAddHome;

    @FXML
    private ComboBox<String> comboAdministrateurUpHome;

    @FXML
    private ComboBox<String> comboCommuneAddHome;

    @FXML
    private ComboBox<String> comboCommuneUpHome;

    @FXML
    private ChoiceBox<String> comboDelHome;

    @FXML
    private ChoiceBox<String> comboDelLocation;

    @FXML
    private ComboBox<String> comboEtatAddHome;

    @FXML
    private ComboBox<String> comboEtatUpHome;

    @FXML
    private ComboBox<String> comboHomeFieldAddLocationSet;

    @FXML
    private ComboBox<String> comboHomeFieldDelLocationSet;

    @FXML
    private ComboBox<String> comboHomeFieldInfoLocationSet;

    @FXML
    private ComboBox<String> comboHomeFieldUpLocationSet;

    @FXML
    private ChoiceBox<String> comboInfoHome;

    @FXML
    private ChoiceBox<String> comboLocationInfo;

    @FXML
    private ComboBox<String> comboPersonFieldAddLocationSet;

    @FXML
    private ComboBox<String> comboPersonFieldDelLocationSet;

    @FXML
    private ComboBox<String> comboPersonFieldInfoLocationSet;

    @FXML
    private ComboBox<String> comboPersonFieldUpLocationSet;

    @FXML
    private ComboBox<String> comboQuartierAddHome;

    @FXML
    private ComboBox<String> comboQuartierUpHome;

    @FXML
    private ChoiceBox<String> comboSelectorDelPersonSet;

    @FXML
    private ChoiceBox<String> comboSelectorInfoPersonSet;

    @FXML
    private ChoiceBox<String> comboSelectorUpLocationSet;

    @FXML
    private ChoiceBox<String> comboSelectorUpPersonSet;

    @FXML
    private ChoiceBox<String> comeUpHome;

    @FXML
    private TextField communeDelHome;

    @FXML
    private TextField communeInfoHome;

    @FXML
    private DatePicker dateEndFieldAddLocationSet;

    @FXML
    private DatePicker dateEndFieldDelLocationSet;

    @FXML
    private DatePicker dateEndFieldInfoLocationSet;

    @FXML
    private DatePicker dateEndFieldUpLocationSet;

    @FXML
    private DatePicker dateStartFieldAddLocationSet;

    @FXML
    private DatePicker dateStartFieldDelLocationSet;

    @FXML
    private DatePicker dateStartFieldInfoLocationSet;

    @FXML
    private DatePicker dateStartFieldUpLocationSet;

    @FXML
    private TableColumn<?, ?> date_deb_col_Home;

    @FXML
    private TableColumn<?, ?> date_fin_col_Home;

    @FXML
    private Button delHomeGestion;

    @FXML
    private AnchorPane delHomeSet_form;

    @FXML
    private Button delHome_form;

    @FXML
    private Button delLocationG;

    @FXML
    private AnchorPane delLocationSet_form;

    @FXML
    private Button delLocation_form;

    @FXML
    private Button delPersonGestion_form;

    @FXML
    private AnchorPane delPersonSet_form;

    @FXML
    private Button delPerson_form;

    @FXML
    private TextArea descriptionAddHome;

    @FXML
    private TextArea descriptionDelHome;

    @FXML
    private TextArea descriptionInfoHome;

    @FXML
    private TextArea descriptionUpHome;

    @FXML
    public TextField designationAddHome;
    

    @FXML
    private TextField designationDelHome;

    @FXML
    private TextField designationInfoHome;

    @FXML
    private TextField designationUpHome;

    @FXML
    private TableColumn<?, ?> designation_col;

    @FXML
    private TextField etatDelHome;

    @FXML
    private TextField etatInfoHome;

    @FXML
    private Label freeHome;

    @FXML
    private Button homeBtn_panel;

    @FXML
    private AnchorPane homeManagment;

    @FXML
    private TableColumn<homeClass, String> id_adresse_col;

    @FXML
    private TableColumn<homeClass, String> id_bien_col;

    @FXML
    private TableColumn<homeClass, String> id_location_col_Home;

    @FXML
    private TableColumn<homeClass, String> id_logement_col;

    @FXML
    private TableColumn<homeClass, String> id_logement_col_Home;

    @FXML
    private TableColumn<homeClass, String> id_type_col;

    @FXML
    private Button infoHomeGestion;

    @FXML
    private AnchorPane infoHomeSet_form;

    @FXML
    private Button infoLocationG;

    @FXML
    private AnchorPane infoLocationSet_form;

    @FXML
    private Button infoPersonGestion_form;

    @FXML
    private AnchorPane infoPersonSet_form;

    @FXML
    private Button locationBtn_panel;

    @FXML
    private AnchorPane locationManagment;

    @FXML
    private ImageView logout;

    @FXML
    private TextField loyerAddHome;

    @FXML
    private TextField loyerDelHome;

    @FXML
    private TextField loyerInfoHome;

    @FXML
    private TextField loyerUpHome;

    @FXML
    private TextField debFieldLocationInfo;

    @FXML
    private TextField endFieldLocationInfo;

    @FXML
    private TextField personFieldLocationInfo;

    @FXML
    private TextField homeFieldLocationInfo;

    @FXML
    private TextField debFieldLocationDel;

    @FXML
    private TextField endFieldLocationDel;

    @FXML
    private TextField personFieldLocationDel;

    @FXML
    private TextField homeFieldLocationDel;

    @FXML
    private TableColumn<homeClass, String> loyer_col;

    @FXML
    private Button modifierUpHome;

    @FXML
    private Button modifierUpLocationSet;

    @FXML
    private Button modifierUpPersonSet;

    @FXML
    private TableColumn<homeClass, String> nb_pieces_col;

    @FXML
    private TextField nomFieldAddPersonSet;

    @FXML
    private TextField nomFieldDelPersonSet;

    @FXML
    private TextField nomFieldInfoPersonSet;

    @FXML
    private TextField nomFieldUpPersonSet;

    @FXML
    private TableColumn<personClass, String> nom_col_info;

    @FXML
    private TableColumn<homeClass, String> num_piece_col_Home;

    @FXML
    private TableColumn<personClass, String> num_piece_col_Info;

    @FXML
    private Button personBtn_panel;

    @FXML
    private AnchorPane personManagment;

    @FXML
    private Label personNumber;

    @FXML
    private TextField pieceAddHome;

    @FXML
    private TextField pieceDelHome;

    @FXML
    private TextField pieceInfoHome;

    @FXML
    private TextField pieceUpHome;

    @FXML
    private TextField prenomFieldAddPersonSet;

    @FXML
    private TextField prenomFieldDelPersonSet;

    @FXML
    private TextField prenomFieldInfoPersonSet;

    @FXML
    private TextField prenomFieldUpPersonSet;

    @FXML
    private TableColumn<personClass, String> prenom_col_info;

    @FXML
    private TextField quartierDelHome;

    @FXML
    private TextField quartierInfoHome;

    @FXML
    private TextField searchDelHome;

    @FXML
    private TextField searchFieldDelLocation;

    @FXML
    private TextField searchFieldDelPersonSet;

    @FXML
    private TextField searchFieldInfoPersonSet;

    @FXML
    private TextField searchFieldLocationInfo;

    @FXML
    private TextField searchFieldUpLocationSet;

    @FXML
    private TextField searchFieldUpPersonSet;

    @FXML
    private TextField searchInfoHome;

    @FXML
    private TextField searchUpHome;

    @FXML
    private TextField superficieAddHome;

    @FXML
    private TextField superficieDelHome;

    @FXML
    private TextField superficieInfoHome;

    @FXML
    private TextField superficieUpHome;

    @FXML
    private TableColumn<homeClass, String> superficie_col;

    @FXML
    private Button supprimerDelHome;

    @FXML
    private Button supprimerDelPersonSet;

    @FXML
    private Button supprimerLocation;

    @FXML
    private TableView<homeClass> tableViewAddInfoHome;

    @FXML
    private TableView<locationClass> tableViewInfoHomeSet;

    @FXML
    private TableView<personClass> tableViewInfoPersonSet;

    @FXML
    private TextField telephoneFieldAddPersonSet;

    @FXML
    private TextField telephoneFieldDelPersonSet;

    @FXML
    private TextField telephoneFieldInfoPersonSet;

    @FXML
    private TextField telephoneFieldUpPersonSet;

    @FXML
    private TableColumn<personClass, String> telephone_col_info;

    @FXML
    private Button upHomeGestion;

    @FXML
    private AnchorPane upHomeSet_form;

    @FXML
    private Button upHome_form;

    @FXML
    private AnchorPane upLocationSet_form;

    @FXML
    private Button upLocation_form;

    @FXML
    private Button upPersonGestion_form;

    @FXML
    private AnchorPane upPersonSet_form;

    @FXML
    private Button upPerson_form;

    @FXML
    private Label usedHome;

    @FXML
    private Button validateDelHome;

    @FXML
    private Button validateDelPersonSet;

    @FXML
    private ComboBox<String> comboAdresseAddHome;

    @FXML
    private ComboBox<String> comboDescriptionAddHome;

    @FXML
    private Button validateFieldDelLocation;

    @FXML
    private Button validateInfoPersonSet;

    @FXML
    private Button validateLocationInfo;

    @FXML
    private Button validateUpHome;

    @FXML
    private Button validateUpLocationSet;

    @FXML
    private Button validateUpPersonSet;

    @FXML
    private Button validerAddHome;

    @FXML
    private Button validerAddLocationSet;

    @FXML
    private Button validerAddPerson;

    @FXML
    private ComboBox<String> comboAdresseUpHome;

    @FXML
    private ComboBox<String> comboDescriptionUpHome;

    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;
    
    public void addPersonReset() {
        cniFieldAddPersonSet.setText("");
        nomFieldAddPersonSet.setText("");
        prenomFieldAddPersonSet.setText("");
        telephoneFieldAddPersonSet.setText("");
    }

    public void delPersonReset() {
        cniFieldDelPersonSet.setText("");
        nomFieldDelPersonSet.setText("");
        prenomFieldDelPersonSet.setText("");
        telephoneFieldDelPersonSet.setText("");
    }

    public void upPersonReset() {
        cniFieldUpPersonSet.setText("");
        nomFieldUpPersonSet.setText("");
        prenomFieldUpPersonSet.setText("");
        telephoneFieldUpPersonSet.setText("");
    }


    @FXML
    void addHomeFormBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(true);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void addHomeGestionBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(true);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void addLocationFormBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(true);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void addLocationGBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(true);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void addPersonFormBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(true);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void addPersonGestionBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(true);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backAddHomeBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(true);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backAddLocationSetBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(true);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backAddPersonSetBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(true);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backDelHomeBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(true);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backDelLocationBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(true);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backDelPersonSetBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(true);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backInfoHomeBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(true);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backInfoPersonSetBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(true);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backLocationInfoBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(true);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backUpHome(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(true);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backUpPersonSetBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(true);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void backUpLocationSetBtn(MouseEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(true);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void bureauPanelBtn(ActionEvent event) {
        homeBtn_panel.setStyle("-fx-background-color: #2087d5");
        locationBtn_panel.setStyle("-fx-background-color: #2087d5");
        personBtn_panel.setStyle("-fx-background-color: #2087d5");
        bureauBtn_panel.setStyle("-fx-background-color: #1aa94c");
        bureauForm.setVisible(true);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void delHomeFormBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(true);
    }

    @FXML
    void upLocationGBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(true);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void delHomeGestionBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(true);
    }

    @FXML
    void delLocationFormBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(true);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void delLocationGBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(true);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void delPersonFormBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(true);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void delPersonGestionBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(true);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void homePanelBtn(ActionEvent event) {
        homeBtn_panel.setStyle("-fx-background-color: #1aa94c");
        locationBtn_panel.setStyle("-fx-background-color: #2087d5");
        personBtn_panel.setStyle("-fx-background-color: #2087d5");
        bureauBtn_panel.setStyle("-fx-background-color: #2087d5");
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(true);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void infoHomeGestionBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(true);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void infoLocationGBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(true);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void infoPersonGestionBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(true);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void locationPanelBtn(ActionEvent event) {
        homeBtn_panel.setStyle("-fx-background-color: #2087d5");
        locationBtn_panel.setStyle("-fx-background-color: #1aa94c");
        personBtn_panel.setStyle("-fx-background-color: #2087d5");
        bureauBtn_panel.setStyle("-fx-background-color: #2087d5");
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(true);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void logoutBtn(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("connexion.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Proprio - Connexion");
        logout.getScene().getWindow().hide();
        stage.show();
    }

    @FXML
    void modifierUpHomeBtn(ActionEvent event) {
        String sql = "UPDATE logement SET loyer = '"
        + loyerUpHome.getText() + "', superficie = '"
        + superficieUpHome.getText() + "', nb_pieces = '"
        + pieceUpHome.getText() + "', designation = '"
        + designationUpHome.getText() + "', id_bien = (SELECT id_bien FROM bien WHERE id_bien = '"
        + pseudo.getIdBien() + "'), id_type = (SELECT id_type FROM type_logement WHERE id_type ='"
        + pseudo.getIdType() + "'), id_adresse = (SELECT id_adresse FROM adresse WHERE id_adresse= '"
        + pseudo.getIdAdresse() + "') WHERE logement.id_logement = '"
        + searchUpHome.getText() + "'";

           

        connect = dbconnector.connectDb();

        try {
            Alert alert;
            if (loyerUpHome.getText().isEmpty()
                    || superficieUpHome.getText().isEmpty()
                    || pieceUpHome.getText().isEmpty()
                    || designationUpHome.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Erreur de validation");
                alert.setHeaderText(null);
                alert.setContentText("Veuillez remplir tous les champs.");
                alert.showAndWait();
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation");
                alert.setHeaderText(null);
                alert.setContentText("Voulez vous modifier les informations du logement avec l'ID " + searchUpHome.getText() + " ?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    try {
                        statement = connect.createStatement();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    try {
                        statement.executeUpdate(sql);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
    

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information");
                    alert.setHeaderText(null);
                    alert.setContentText("Les informations ont bien été mises à jour.");
                    alert.showAndWait();
                    searchHomeAll();
                    personNumber.setText(personNumber().toString());
                    usedHome.setText(homeUsedNumber().toString());
                    freeHome.setText(beforeHomeCalculate.toString());
                    //upPersonReset();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void modifierUpLocationSetBtn(ActionEvent event) {
        String sql = "UPDATE location SET date_deb = '"
        + dateStartFieldUpLocationSet.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "', date_fin = '"
        + dateStartFieldUpLocationSet.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "', num_piece = '"
        + comboPersonFieldUpLocationSet.getValue() + "', id_logement = (SELECT id_logement FROM logement WHERE id_logement = " + test.getIdLogement() +") WHERE num_piece = '"+ searchFieldUpLocationSet.getText().toUpperCase() +"'";

           

        connect = dbconnector.connectDb();

        try {
            Alert alert;
            if (dateStartFieldUpLocationSet == null
                    || dateStartFieldUpLocationSet ==null
                    || comboPersonFieldUpLocationSet.getValue().isEmpty()
                    || comboHomeFieldUpLocationSet.getValue().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Erreur de validation");
                alert.setHeaderText(null);
                alert.setContentText("Veuillez remplir tous les champs.");
                alert.showAndWait();
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation");
                alert.setHeaderText(null);
                alert.setContentText("Voulez vous modifier les informations de location de " + searchFieldUpLocationSet.getText() + " ?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    try {
                        statement = connect.createStatement();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    try {
                        statement.executeUpdate(sql);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
    

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information");
                    alert.setHeaderText(null);
                    alert.setContentText("Les informations ont bien été mises à jour.");
                    alert.showAndWait();
                    findLocationAll();
                    personNumber.setText(personNumber().toString());
                    usedHome.setText(homeUsedNumber().toString());
                    freeHome.setText(beforeHomeCalculate.toString());
                    //upPersonReset();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public locationClass test = null;
    public homeClass pseudo = null;

    @FXML
    void modifierUpPersonSetBtn(ActionEvent event) {
        String sql = "UPDATE locataire SET num_piece = '"
                + cniFieldUpPersonSet.getText().toUpperCase() + "', nom = '"
                + nomFieldUpPersonSet.getText().toUpperCase() + "', prenom = '"
                + prenomFieldUpPersonSet.getText().toUpperCase() + "', telephone = '"
                + telephoneFieldUpPersonSet.getText().toUpperCase() + "' WHERE num_piece ='"
                + searchFieldUpPersonSet.getText() + "'";

        connect = dbconnector.connectDb();

        try {
            Alert alert;
            if (cniFieldUpPersonSet.getText().isEmpty()
                    || nomFieldUpPersonSet.getText().isEmpty()
                    || prenomFieldUpPersonSet.getText().isEmpty()
                    || telephoneFieldUpPersonSet.getText().isEmpty()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Erreur de validation");
                alert.setHeaderText(null);
                alert.setContentText("Veuillez remplir tous les champs.");
                alert.showAndWait();
            } else {
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation");
                alert.setHeaderText(null);
                alert.setContentText("Voulez vous modifier les informations de " + searchFieldUpPersonSet.getText() + " ?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    try {
                        statement = connect.createStatement();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    try {
                        statement.executeUpdate(sql);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
    

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information");
                    alert.setHeaderText(null);
                    alert.setContentText("Les informations ont bien été mises à jour.");
                    alert.showAndWait();
                    findUserAll();
                    upPersonReset();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void personPanelBtn(ActionEvent event) {
        homeBtn_panel.setStyle("-fx-background-color: #2087d5");
        locationBtn_panel.setStyle("-fx-background-color: #2087d5");
        personBtn_panel.setStyle("-fx-background-color: #1aa94c");
        bureauBtn_panel.setStyle("-fx-background-color: #2087d5");
        bureauForm.setVisible(false);
        personManagment.setVisible(true);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void supprimerDelHome(ActionEvent event) {
        if(loyerDelHome.getText().equals("")){

        } else {
            String sql = "DELETE FROM logement WHERE id_logement = '" + searchDelHome.getText() + "'";
            connect = dbconnector.connectDb();
            Alert alert;

            alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText(null);
            alert.setContentText("Voulez vous supprimer le logement avec pour ID: " + searchDelHome.getText() + " ?");
            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
                try {
                    statement = connect.createStatement();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    statement.executeUpdate(sql);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("Ce logement a bien été supprimée.");
                alert.showAndWait();
                searchHomeAll();
                personNumber.setText(personNumber().toString());
                usedHome.setText(homeUsedNumber().toString());
                freeHome.setText(beforeHomeCalculate.toString());
                //delPersonReset();
            }
        }
    }

    @FXML
    void supprimerDelPersonSetBtn(ActionEvent event) {
        if(cniFieldDelPersonSet.getText().equals("")){

        } else {
            String sql = "DELETE FROM locataire WHERE num_piece = '" + cniFieldDelPersonSet.getText() + "'";
            connect = dbconnector.connectDb();
            Alert alert;

            alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText(null);
            alert.setContentText("Voulez vous supprimer le locataire avec pour numéro de pièce: " + cniFieldDelPersonSet.getText() + " ?");
            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
                try {
                    statement = connect.createStatement();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    statement.executeUpdate(sql);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("Ce locataire a bien été supprimé.");
                alert.showAndWait();
                findUserAll();
                personNumber.setText(personNumber().toString());
                usedHome.setText(homeUsedNumber().toString());
                freeHome.setText(beforeHomeCalculate.toString());
                delPersonReset();
            }
        }
    }

    @FXML
    void supprimerLocationBtn(ActionEvent event) {
        if(debFieldLocationDel == null){

        } else {
            String sql = "DELETE FROM location WHERE num_piece = '" + searchFieldDelLocation.getText() + "'";
            connect = dbconnector.connectDb();
            Alert alert;

            alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText(null);
            alert.setContentText("Voulez vous supprimer la location avec le numéro de pièce: " + searchFieldDelLocation.getText() + " ?");
            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
                try {
                    statement = connect.createStatement();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    statement.executeUpdate(sql);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("Cette location a bien été supprimée.");
                alert.showAndWait();
                findLocationAll();
                personNumber.setText(personNumber().toString());
                usedHome.setText(homeUsedNumber().toString());
                freeHome.setText(beforeHomeCalculate.toString());
                //delPersonReset();
            }
        }
    }

    @FXML
    void tableViewAddInfoHomeBtn(MouseEvent event) {
        if (event.getClickCount() == 1) { // Vérifie un seul clic
            // Récupérer la ligne sélectionnée
            homeClass selectedItem = tableViewAddInfoHome.getSelectionModel().getSelectedItem();
    
            // Vérifier si une ligne est sélectionnée
            if (selectedItem != null) {
                // Récupérer les données relatives à la ligne sélectionnée
                String loyer = selectedItem.getLoyer();  
                String superficie = selectedItem.getSuperficie();  
                String pieces = selectedItem.getPieces();  
                String designation = selectedItem.getDesignation();  
                String etat = selectedItem.getEtat();  
                String admin = selectedItem.getAdministrateur();  
                String description = selectedItem.getDescription();  
                String adresse = selectedItem.getAdresse();  
                String quartier = selectedItem.getQuartier();  
                String commune = selectedItem.getLoyer();  
    
                // Remplir les champs de texte avec les données récupérées
                loyerInfoHome.setText(loyer);
                superficieInfoHome.setText(superficie);
                pieceInfoHome.setText(pieces);
                designationInfoHome.setText(designation);
                etatInfoHome.setText(etat);
                administrateurInfoHome.setText(admin);
                descriptionInfoHome.setText(description);
                adresseInfoHome.setText(adresse);
                quartierInfoHome.setText(quartier);
                communeInfoHome.setText(commune);
            }
        }
    }

    @FXML
    void tableViewInfoHomeSetBtn(MouseEvent event) {
        if (event.getClickCount() == 1) { // Vérifie un seul clic
            // Récupérer la ligne sélectionnée
            locationClass selectedItem = tableViewInfoHomeSet.getSelectionModel().getSelectedItem();
    
            // Vérifier si une ligne est sélectionnée
            if (selectedItem != null) {
                // Récupérer les données relatives à la ligne sélectionnée
                String deb = selectedItem.getDateDebut(); 
                String end = selectedItem.getDateFin(); 
                String proprietaire = selectedItem.getProprietaire(); 
                String logement = selectedItem.getLogement(); 
    
                // Remplir les champs de texte avec les données récupérées
                debFieldLocationInfo.setText(deb);
                endFieldLocationInfo.setText(end);
                personFieldLocationInfo.setText(proprietaire);
                homeFieldLocationInfo.setText(logement);

            }
        }
    }

    @FXML
    void tableViewInfoPersonSetBtn(MouseEvent event) {
        if (event.getClickCount() == 1) { // Vérifie un seul clic
            // Récupérer la ligne sélectionnée
            personClass selectedItem = tableViewInfoPersonSet.getSelectionModel().getSelectedItem();
    
            // Vérifier si une ligne est sélectionnée
            if (selectedItem != null) {
                // Récupérer les données relatives à la ligne sélectionnée
                String num_piece = selectedItem.getNum_piece(); 
                String nom = selectedItem.getNom(); 
                String prenom = selectedItem.getPrenom(); 
                String telephone = selectedItem.getTelephone(); 
    
                // Remplir les champs de texte avec les données récupérées
                cniFieldInfoPersonSet.setText(num_piece);
                nomFieldInfoPersonSet.setText(nom);
                prenomFieldInfoPersonSet.setText(prenom);
                telephoneFieldInfoPersonSet.setText(telephone);

            }
        }
    }

    @FXML
    void upHomeFormBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(true);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void upHomeGestionBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(true);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void upLocationFormBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(false);
        upLocationSet_form.setVisible(true);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void upPersonFormBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(true);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void upPersonGestionBtn(ActionEvent event) {
        bureauForm.setVisible(false);
        personManagment.setVisible(false);
        locationManagment.setVisible(false);
        homeManagment.setVisible(false);
        addPersonSet_form.setVisible(false);
        addLocationSet_form.setVisible(false);
        addHomeSet_form.setVisible(false);
        infoPersonSet_form.setVisible(false);
        infoLocationSet_form.setVisible(false);
        infoHomeSet_form.setVisible(false);
        upPersonSet_form.setVisible(true);
        upLocationSet_form.setVisible(false);
        upHomeSet_form.setVisible(false);
        delPersonSet_form.setVisible(false);
        delLocationSet_form.setVisible(false);
        delHomeSet_form.setVisible(false);
    }

    @FXML
    void validateDelHome(ActionEvent event) {
        connect = dbconnector.connectDb();
        Integer search = Integer.parseInt(searchDelHome.getText());
        homeDriver homeH = new homeDriver();
        homeClass homeC = homeH.findHomeById(search);
        if (homeC == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Logement non trouvé");
            alert.setHeaderText(null);
            alert.setContentText("Ce logement n'existe pas");
            alert.showAndWait();
        } else {
            loyerDelHome.setText(homeC.getLoyer());
            superficieDelHome.setText(homeC.getSuperficie());
            pieceDelHome.setText(homeC.getPieces());
            designationDelHome.setText(homeC.getDesignation());
            etatDelHome.setText(homeC.getEtat());
            administrateurDelHome.setText(homeC.getAdministrateur());
            descriptionDelHome.setText(homeC.getDescription());
            adresseDelHome.setText(homeC.getAdresse());
            quartierDelHome.setText(homeC.getQuartier());
            communeDelHome.setText(homeC.getCommune());

        }
    }

    @FXML
    void validateDelPersonSetBtn(ActionEvent event) {
        connect = dbconnector.connectDb();
        String search = searchFieldDelPersonSet.getText().toUpperCase();
        personDriver personDel = new personDriver();
        personClass user = personDel.findUserByCNI(search);
        if (user == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Utilisateur non trouvé");
            alert.setHeaderText(null);
            alert.setContentText("L'utilisateur n'existe pas");
            alert.showAndWait();
        } else {
            cniFieldDelPersonSet.setText(user.getNum_piece());
            nomFieldDelPersonSet.setText(user.getNom());
            prenomFieldDelPersonSet.setText(user.getPrenom());
            telephoneFieldDelPersonSet.setText(user.getTelephone());
        }
    }

    public void comboSelectorInfoPersonSetList() {
        comboSelectorInfoPersonSet.setItems(FXCollections.observableArrayList("nom", "prénom", "téléphone"));
        comboSelectorInfoPersonSet.setValue("nom");
    }

    public void comboSelectorDelPersonSetList() {
        comboSelectorDelPersonSet.setItems(FXCollections.observableArrayList("CNI"));
        comboSelectorDelPersonSet.setValue("CNI");
    }

    public void comboLocationInfoList() {
        comboLocationInfo.setItems(FXCollections.observableArrayList("CNI"));
        comboLocationInfo.setValue("CNI");
    }

    public void comeUpHomeList() {
        comeUpHome.setItems(FXCollections.observableArrayList("ID logement"));
        comeUpHome.setValue("ID logement");
    }

    public void comboSelectorUpPersonSetList() {
        comboSelectorUpPersonSet.setItems(FXCollections.observableArrayList("CNI"));
        comboSelectorUpPersonSet.setValue("CNI");
    }

    public void comboSelectorUpLocationSetList() {
        comboSelectorUpLocationSet.setItems(FXCollections.observableArrayList("CNI"));
        comboSelectorUpLocationSet.setValue("CNI");
    }

    public void comboDelLocationList() {
        comboDelLocation.setItems(FXCollections.observableArrayList("CNI"));
        comboDelLocation.setValue("CNI");
    }

    public void comboDelHomeList() {
        comboDelHome.setItems(FXCollections.observableArrayList("ID logement"));
        comboDelHome.setValue("ID logement");
    }

    public void comboInfoHomeList() {
        comboInfoHome.setItems(FXCollections.observableArrayList("Loyer", "Superficie", "Nombre de pièces", "Désignation"));
        comboInfoHome.setValue("Loyer");
    }

    public void comboPersonFieldAddLocationSetList() {
        locationDriver List = new locationDriver();
        comboPersonFieldAddLocationSet.setItems(List.fillComboNumPieceAddLocation());
        comboPersonFieldAddLocationSet.setValue(List.fillComboNumPieceAddLocation().get(0));
    }

    public void comboHomeFieldAddLocationSetList() {
        locationDriver List = new locationDriver();
        comboHomeFieldAddLocationSet.setItems(List.fillComboLogementAddLocation());
        comboHomeFieldAddLocationSet.setValue(List.fillComboLogementAddLocation().get(0));
    }

    public void comboEtatAddHomeList() {
        homeDriver List = new homeDriver();
        comboEtatAddHome.setItems(List.fillComboEtatAddHome());
        comboEtatAddHome.setValue(List.fillComboEtatAddHome().get(0));
    }

    public void comboAdministrateurAddHomeList() {
        homeDriver List = new homeDriver();
        comboAdministrateurAddHome.setItems(List.fillComboAdministrateurAddHome());
        comboAdministrateurAddHome.setValue(List.fillComboAdministrateurAddHome().get(0));
    }

    public void comboQuartierAddHomeList() {
        homeDriver List = new homeDriver();
        comboQuartierAddHome.setItems(List.fillComboQuartierAddHome());
        comboQuartierAddHome.setValue(List.fillComboQuartierAddHome().get(0));
    }

    public void comboCommuneAddHomeList() {
        homeDriver List = new homeDriver();
        comboCommuneAddHome.setItems(List.fillComboCommuneAddHome());
        comboCommuneAddHome.setValue(List.fillComboCommuneAddHome().get(0));
    }

    public void comboAdresseAddHomeList() {
        homeDriver List = new homeDriver();
        comboAdresseAddHome.setItems(List.fillComboAdresseAddHome());
        comboAdresseAddHome.setValue(List.fillComboAdresseAddHome().get(0));
    }

    public void comboDescriptionAddHomeList() {
        homeDriver List = new homeDriver();
        comboDescriptionAddHome.setItems(List.fillComboDescriptionAddHome());
        comboDescriptionAddHome.setValue(List.fillComboDescriptionAddHome().get(0));
    }

    private void searchHome(){
        Integer searchName = Integer.parseInt(searchInfoHome.getText()) ;
        homeDriver homeD = new homeDriver();
        String option = comboInfoHome.getValue();
        ObservableList<homeClass> userList = null;

        if (option.equals("Loyer")){
            userList = homeD.findHomeByLoyer(searchName);
        } else if (option.equals("Superficie")){
            Double searchNameDouble = Double.parseDouble(searchInfoHome.getText());
            userList = homeD.findHomeBySuperficie(searchNameDouble);
        } else if (option.equals("Nombre de pièces")){
            userList = homeD.findHomeByNbPieces(searchName);
        } else if (option.equals("Désignation")){
            userList = homeD.findHomeByDesignation(searchName);
        } 

        if (userList != null) {
            // Mettre à jour la TableView avec les données de l'utilisateur
            id_logement_col.setCellValueFactory(new PropertyValueFactory<>("IdLogement"));
            loyer_col.setCellValueFactory(new PropertyValueFactory<>("Loyer"));
            superficie_col.setCellValueFactory(new PropertyValueFactory<>("Superficie"));
            nb_pieces_col.setCellValueFactory(new PropertyValueFactory<>("Pieces"));
            designation_col.setCellValueFactory(new PropertyValueFactory<>("Designation"));
            id_bien_col.setCellValueFactory(new PropertyValueFactory<>("IdBien"));
            id_type_col.setCellValueFactory(new PropertyValueFactory<>("IdType"));
            id_adresse_col.setCellValueFactory(new PropertyValueFactory<>("IdAdresse"));
            tableViewAddInfoHome.setItems(userList);
        }    
        else {
            // Afficher une fenêtre d'alerte indiquant que l'utilisateur n'existe pas
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Location non trouvée");
            alert.setHeaderText("Indentifiant inconnu");
            alert.setContentText("L'identifiant entré n'est pas celui d'un de vos locataires.");
            alert.showAndWait();
        }
    }

    private void searchHomeAll(){
        ObservableList<homeClass> homes = FXCollections.observableArrayList();
        connect = dbconnector.connectDb();
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT logement.loyer, logement.superficie, logement.nb_pieces, logement.designation, bien.libellé, proprietaire.login, type_logement.description, adresse.libellé, quartier.nom, commune.nom, logement.id_logement, logement.id_bien, logement.id_type, logement.id_adresse FROM logement, bien, proprietaire, type_logement, adresse, quartier, commune WHERE logement.id_bien = bien.id_bien AND bien.id_proprio = proprietaire.id_proprio AND logement.id_type = type_logement.id_type AND logement.id_adresse = adresse.id_adresse AND adresse.id_quartier = quartier.id_quartier AND quartier.id_commune = commune.id_commune";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery(query);
            

            while (resultSet.next()) {
                homeClass home = new homeClass(resultSet.getString(1), resultSet.getString(2), 
                resultSet.getString(3), resultSet.getString(4),resultSet.getString(5),
                resultSet.getString(6),resultSet.getString(7),resultSet.getString(8), 
                resultSet.getString(9), resultSet.getString(10), resultSet.getInt(11), 
                resultSet.getInt(12), resultSet.getInt(13), resultSet.getInt(14));
                homes.add(home);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

            // Mettre à jour la TableView avec les données de l'utilisateur
            id_logement_col.setCellValueFactory(new PropertyValueFactory<>("IdLogement"));
            loyer_col.setCellValueFactory(new PropertyValueFactory<>("Loyer"));
            superficie_col.setCellValueFactory(new PropertyValueFactory<>("Superficie"));
            nb_pieces_col.setCellValueFactory(new PropertyValueFactory<>("Pieces"));
            designation_col.setCellValueFactory(new PropertyValueFactory<>("Designation"));
            id_bien_col.setCellValueFactory(new PropertyValueFactory<>("IdBien"));
            id_type_col.setCellValueFactory(new PropertyValueFactory<>("IdType"));
            id_adresse_col.setCellValueFactory(new PropertyValueFactory<>("IdAdresse"));
            tableViewAddInfoHome.setItems(homes);
    }

    private void searchLocation(){
        String searchName = searchFieldLocationInfo.getText().toUpperCase();
        locationDriver locationD = new locationDriver();
        ObservableList<locationClass> userList = locationD.findLocationByNumPiece(searchName);

        if (userList != null) {
            // Mettre à jour la TableView avec les données de l'utilisateur
            id_location_col_Home.setCellValueFactory(new PropertyValueFactory<>("idLocation"));
            date_deb_col_Home.setCellValueFactory(new PropertyValueFactory<>("dateDebut"));
            date_fin_col_Home.setCellValueFactory(new PropertyValueFactory<>("dateFin"));
            num_piece_col_Home.setCellValueFactory(new PropertyValueFactory<>("proprietaire"));
            id_logement_col_Home.setCellValueFactory(new PropertyValueFactory<>("idLogement"));
            tableViewInfoHomeSet.setItems(userList);

        }    
        else {
            // Afficher une fenêtre d'alerte indiquant que l'utilisateur n'existe pas
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Utilisateur non trouvé");
            alert.setHeaderText(null);
            alert.setContentText("L'utilisateur n'existe pas");
            alert.showAndWait();
        }
    }

    private void searchUser() {
        String searchName = searchFieldInfoPersonSet.getText().toUpperCase();
        personDriver personD = new personDriver();
        String option = comboSelectorInfoPersonSet.getValue();
        ObservableList<personClass> userList = null;

        if (option.equals("nom")){
            userList = personD.findUserByName(searchName);
        } else if (option.equals("prénom")){
            userList = personD.findUserByPrenom(searchName);
        } else if (option.equals("téléphone")){
            userList = personD.findUserByTelephone(searchName);
        } 

        if (userList != null) {
            // Mettre à jour la TableView avec les données de l'utilisateur
            

            num_piece_col_Info.setCellValueFactory(new PropertyValueFactory<>("num_piece"));
            nom_col_info.setCellValueFactory(new PropertyValueFactory<>("nom"));
            prenom_col_info.setCellValueFactory(new PropertyValueFactory<>("prenom"));
            telephone_col_info.setCellValueFactory(new PropertyValueFactory<>("telephone"));
            tableViewInfoPersonSet.setItems(userList);

        }    
        else {
            // Afficher une fenêtre d'alerte indiquant que l'utilisateur n'existe pas
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Location non trouvée");
            alert.setHeaderText("Indentifiant inconnu");
            alert.setContentText("L'identifiant entré n'est pas celui d'un de vos locataires.");
            alert.showAndWait();
        }
    }
    
    public void findLocationAll(){
        ObservableList<locationClass> locations = FXCollections.observableArrayList();
        connect = dbconnector.connectDb();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT id_location, date_deb, date_fin, num_piece, location.id_logement, type_logement.description FROM location, type_logement WHERE id_type = (SELECT id_type FROM logement WHERE logement.id_logement = location.id_logement)";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                locationClass location = new locationClass(resultSet.getString("date_deb"), 
                resultSet.getString("date_fin"), resultSet.getString("num_piece"),
                resultSet.getString("description"), resultSet.getInt("id_location"),
                resultSet.getInt("id_logement"));
                locations.add(location);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
            // Mettre à jour la TableView avec les données de l'utilisateur
            id_location_col_Home.setCellValueFactory(new PropertyValueFactory<>("idLocation"));
            date_deb_col_Home.setCellValueFactory(new PropertyValueFactory<>("dateDebut"));
            date_fin_col_Home.setCellValueFactory(new PropertyValueFactory<>("dateFin"));
            num_piece_col_Home.setCellValueFactory(new PropertyValueFactory<>("proprietaire"));
            id_logement_col_Home.setCellValueFactory(new PropertyValueFactory<>("idLogement"));
            tableViewInfoHomeSet.setItems(locations);
    }

    // Méthode de recherche d'utilisateur 
    public void findUserAll() {
        ObservableList<personClass> users = FXCollections.observableArrayList();
        connect = dbconnector.connectDb();
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM locataire";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery(query);
            

            while (resultSet.next()) {
                personClass user = new personClass(resultSet.getString("num_piece"), resultSet.getString("nom"),
                resultSet.getString("prenom"), resultSet.getString("telephone"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        num_piece_col_Info.setCellValueFactory(new PropertyValueFactory<>("num_piece"));
        nom_col_info.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenom_col_info.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        telephone_col_info.setCellValueFactory(new PropertyValueFactory<>("telephone"));

        tableViewInfoPersonSet.setItems(users);
    }

    @FXML
    void validateFieldDelLocationBtn(ActionEvent event) {
        connect = dbconnector.connectDb();
        String search = searchFieldDelLocation.getText().toUpperCase();
        locationDriver personDel = new locationDriver();
        locationClass location = personDel.findLocationByNumPieceObject(search);
        if (location == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Utilisateur non trouvé");
            alert.setHeaderText(null);
            alert.setContentText("L'utilisateur n'existe pas");
            alert.showAndWait();
        } else {
            debFieldLocationDel.setText(location.getDateDebut());
            endFieldLocationDel.setText(location.getDateFin());
            personFieldLocationDel.setText(location.getProprietaire());
            homeFieldLocationDel.setText(location.getLogement());
        }
    }

    @FXML
    void validateInfoPersonSetBtn(ActionEvent event) {
        if (searchFieldInfoPersonSet.getText().equals("")){
            findUserAll();
        } else {
            searchUser();
        }
    }

    @FXML
    void validateLocationInfoBtn(ActionEvent event) {
        if(searchFieldLocationInfo.getText().equals("")){
            findLocationAll();
        } else {
            searchLocation();
        }
    }

    @FXML
    void validateInfoHomeBtn(ActionEvent event) {
        if(searchInfoHome.getText().equals("")){
            searchHomeAll();
        } else {
            searchHome();
        }
    }

    @FXML
    void validateUpHomeBtn(ActionEvent event) {
        connect = dbconnector.connectDb();
        Integer search = Integer.parseInt(searchUpHome.getText());
        homeDriver homeD = new homeDriver();
        homeClass homeH = homeD.findHomeById(search);
        if (homeH == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Logement non trouvé");
            alert.setHeaderText(null);
            alert.setContentText("Ce logement n'existe pas.");
            alert.showAndWait();
        } else {
            loyerUpHome.setText(homeH.getLoyer());
            superficieUpHome.setText(homeH.getSuperficie());
            pieceUpHome.setText(homeH.getPieces());
            designationUpHome.setText(homeH.getDesignation());
            homeDriver etatC = new homeDriver();
            comboEtatUpHome.setItems(etatC.fillComboEtatAddHome());
            comboEtatUpHome.setValue(homeH.getEtat());
            homeDriver adminC = new homeDriver();
            comboAdministrateurUpHome.setItems(adminC.fillComboAdministrateurAddHome());
            comboAdministrateurUpHome.setValue(homeH.getAdministrateur());  
            homeDriver adresseC = new homeDriver();
            comboAdresseUpHome.setItems(adresseC.fillComboAdresseAddHome());
            comboAdresseUpHome.setValue(homeH.getAdresse());
            homeDriver quartierC = new homeDriver();
            comboQuartierUpHome.setItems(quartierC.fillComboQuartierAddHome());
            comboQuartierUpHome.setValue(homeH.getQuartier());     
            homeDriver communeC = new homeDriver();
            comboCommuneUpHome.setItems(communeC.fillComboCommuneAddHome());
            comboCommuneUpHome.setValue(homeH.getCommune());
            homeDriver descriptionC = new homeDriver();
            comboDescriptionUpHome.setItems(descriptionC.fillComboDescriptionAddHome());
            comboDescriptionUpHome.setValue(homeH.getDescription());        
        }
        pseudo = homeH;
    }

    @FXML
    void validateUpLocationSetBtn(ActionEvent event) {
        connect = dbconnector.connectDb();
        String search = searchFieldUpLocationSet.getText().toUpperCase();
        locationDriver personDel = new locationDriver();
        locationClass location = personDel.findLocationByNumPieceObject(search);
        if (location == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Utilisateur non trouvé");
            alert.setHeaderText(null);
            alert.setContentText("L'utilisateur n'existe pas");
            alert.showAndWait();
        } else {
            dateStartFieldUpLocationSet.setValue(LocalDate.parse(location.getDateDebut().toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            dateEndFieldUpLocationSet.setValue(LocalDate.parse(location.getDateFin().toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            locationDriver List = new locationDriver();
            comboHomeFieldUpLocationSet.setItems(List.fillComboLogementAddLocation());
            comboHomeFieldUpLocationSet.setValue(location.getLogement());
            locationDriver List2 = new locationDriver();
            comboPersonFieldUpLocationSet.setItems(List2.fillComboNumPieceAddLocation());
            comboPersonFieldUpLocationSet.setValue(location.getProprietaire());             
            test = location;
        }
    }

    @FXML
    void validateUpPersonSetBtn(ActionEvent event) {
        connect = dbconnector.connectDb();
        String search = searchFieldUpPersonSet.getText().toUpperCase();
        personDriver personDel = new personDriver();
        personClass user = personDel.findUserByCNI(search);
        if (user == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Utilisateur non trouvé");
            alert.setHeaderText(null);
            alert.setContentText("L'utilisateur n'existe pas");
            alert.showAndWait();
        } else {
            cniFieldUpPersonSet.setText(user.getNum_piece());
            nomFieldUpPersonSet.setText(user.getNom());
            prenomFieldUpPersonSet.setText(user.getPrenom());
            telephoneFieldUpPersonSet.setText(user.getTelephone());
        }
    }

    @FXML
    void validerAddHomeBtn(ActionEvent event) throws SQLException {
        Integer etatId = null; 
        Integer typeId = null; 
        Integer adresseId = null; 


        //requête 1
        String preSql1 = "SELECT id_bien FROM bien WHERE id_proprio = " 
        + "(SELECT id_proprio FROM proprietaire WHERE login = '"+ comboAdministrateurAddHome.getValue() +"')";
        statement = connect.createStatement();
        result = statement.executeQuery(preSql1);
        if (result.next()){
            etatId = result.getInt("id_bien");
        }

        //requête 2
        String preSql2 = "SELECT id_type FROM type_logement WHERE description = '" 
        + comboDescriptionAddHome.getValue() +"'";
        statement = connect.createStatement();
        result = statement.executeQuery(preSql2);
        if (result.next()){
            typeId = result.getInt("id_type");
        }

        //requête 3
        String preSql3 = "SELECT id_adresse FROM adresse where libellé = '" 
        + comboAdresseAddHome.getValue() + "' AND id_quartier = (SELECT id_quartier FROM quartier WHERE nom = '"
        + comboQuartierAddHome.getValue()
        +"')";
        statement = connect.createStatement();
        result = statement.executeQuery(preSql3);
        if (result.next()){
            adresseId = result.getInt("id_adresse");
        }       

        //requête principale
        String sql = "INSERT INTO logement "
                + "(loyer, superficie, nb_pieces, designation, id_bien, id_type, id_adresse)"
                + "VALUES(?,?,?,?,?,?,?)";

        connect = dbconnector.connectDb();

        try {
            Alert alert;
            if (loyerAddHome.getText().isEmpty()
                    || superficieAddHome.getText().isEmpty()
                    || pieceAddHome.getText().isEmpty()
                    || comboAdresseAddHome.getValue().isEmpty()
                    || designationAddHome.getText().isEmpty()
                    || comboEtatAddHome.getValue().isEmpty()
                    || comboQuartierAddHome.getValue().isEmpty()
                    || comboCommuneAddHome.getValue().isEmpty()
                    || comboAdministrateurAddHome.getValue().isEmpty()
                    || comboDescriptionAddHome.getValue().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Erreur de validation");
                alert.setHeaderText(null);
                alert.setContentText("Veuillez remplir tous les champs.");
                alert.showAndWait();
            } else {

                String check = "SELECT loyer, superficie, nb_pieces, designation, id_bien, id_type, id_adresse FROM logement WHERE loyer = '"
                        + loyerAddHome.getText() + "' AND superficie = '"
                        + superficieAddHome.getText()+ "' AND nb_pieces = '"
                        + pieceAddHome.getText() + "' AND designation = '"
                        + designationAddHome.getText() + "' AND id_bien = '"
                        + etatId + "' AND id_type = '"
                        + typeId + "' AND id_adresse = '"
                        + adresseId +"'";

                statement = connect.createStatement();
                result = statement.executeQuery(check);

                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Message d'erreur");
                    alert.setHeaderText("Ce logement existe");
                    alert.setContentText("Les caractérisques attribuées au logement existent déja.");
                    alert.showAndWait();
                } else {
                    prepare = connect.prepareStatement(sql);
                    prepare.setString(1, loyerAddHome.getText());
                    prepare.setString(2, superficieAddHome.getText());
                    prepare.setString(3, pieceAddHome.getText());
                    prepare.setString(4, designationAddHome.getText());
                    prepare.setInt(5, etatId);
                    prepare.setInt(6, typeId);
                    prepare.setInt(7, adresseId);
                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Validé");
                    alert.setHeaderText(null);
                    alert.setContentText("Ce logement a bien été ajouté.");
                    alert.showAndWait();
                    searchHomeAll();
                    personNumber.setText(personNumber().toString());
                    usedHome.setText(homeUsedNumber().toString());
                    freeHome.setText(beforeHomeCalculate.toString());
                    //addPersonReset();
                }
            }

            searchHomeAll();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void validerAddLocationSetBtn(ActionEvent event) throws SQLException {
        Integer logementID = null; 
        String preSql = "SELECT id_logement FROM logement where id_type = " 
        + "(SELECT id_type FROM type_logement WHERE description = '"+ comboHomeFieldAddLocationSet.getValue() +"')";
        statement = connect.createStatement();
        result = statement.executeQuery(preSql);
        if (result.next()){
            logementID = result.getInt("id_logement");
        }

        String sql = "INSERT INTO location "
                + "(date_deb,date_fin,num_piece, id_logement)"
                + "VALUES(?,?,?,?)";

        connect = dbconnector.connectDb();

        try {
            Alert alert;
            if (cniFieldAddLocationSet.getText().isEmpty()
                    || dateStartFieldAddLocationSet.getValue() == null
                    || dateEndFieldAddLocationSet.getValue() == null
                    || comboPersonFieldAddLocationSet.getValue().isEmpty()
                    || comboHomeFieldAddLocationSet.getValue().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Erreur de validation");
                alert.setHeaderText(null);
                alert.setContentText("Veuillez remplir tous les champs.");
                alert.showAndWait();
            } else {

                String check = "SELECT num_piece, date_deb, date_fin FROM location WHERE num_piece = '"
                        + cniFieldAddLocationSet.getText() + "' AND date_deb = '"
                        + dateStartFieldAddLocationSet.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                        + "' AND date_fin = '"
                        + dateEndFieldAddLocationSet.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                        +"'";

                statement = connect.createStatement();
                result = statement.executeQuery(check);

                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Message d'erreur");
                    alert.setHeaderText(null);
                    alert.setContentText("Cette location existe déja.");
                    alert.showAndWait();
                } else {
                    prepare = connect.prepareStatement(sql);
                    prepare.setString(1, dateStartFieldAddLocationSet.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    prepare.setString(2, dateEndFieldAddLocationSet.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    prepare.setString(3, comboPersonFieldAddLocationSet.getValue());
                    prepare.setInt(4, logementID);
                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Validé");
                    alert.setHeaderText(null);
                    alert.setContentText("Cette location a bien été ajoutée.");
                    alert.showAndWait();
                    findLocationAll();
                    personNumber.setText(personNumber().toString());
                    usedHome.setText(homeUsedNumber().toString());
                    freeHome.setText(beforeHomeCalculate.toString());
                    //addPersonReset();
                }
            }

            findLocationAll();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void validerAddPersonBtn(ActionEvent event) {
        String sql = "INSERT INTO locataire "
                + "(num_piece,nom,prenom,telephone) "
                + "VALUES(?,?,?,?)";

        connect = dbconnector.connectDb();

        try {
            Alert alert;
            if (cniFieldAddPersonSet.getText().isEmpty()
                    || nomFieldAddPersonSet.getText().isEmpty()
                    || prenomFieldAddPersonSet.getText().isEmpty()
                    || telephoneFieldAddPersonSet.getText().isEmpty()){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Erreur de validation");
                alert.setHeaderText(null);
                alert.setContentText("Veuillez remplir tous les champs.");
                alert.showAndWait();
            } else {

                String check = "SELECT num_piece FROM locataire WHERE num_piece = '"
                        + cniFieldAddPersonSet.getText() + "'";

                statement = connect.createStatement();
                result = statement.executeQuery(check);

                if (result.next()) {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Ce numéro de pièce: " + cniFieldAddPersonSet.getText() + "existe déja.");
                    alert.showAndWait();
                } else {

                    prepare = connect.prepareStatement(sql);
                    prepare.setString(1, cniFieldAddPersonSet.getText().toUpperCase());
                    prepare.setString(2, nomFieldAddPersonSet.getText().toUpperCase());
                    prepare.setString(3, prenomFieldAddPersonSet.getText().toUpperCase());
                    prepare.setString(4, telephoneFieldAddPersonSet.getText().toUpperCase());

                    prepare.executeUpdate();
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Validé");
                    alert.setHeaderText(null);
                    alert.setContentText("Ce locataire a bien été ajouté.");
                    alert.showAndWait();
                    findUserAll();
                    personNumber.setText(personNumber().toString());
                    usedHome.setText(homeUsedNumber().toString());
                    freeHome.setText(beforeHomeCalculate.toString());
                    addPersonReset();
                }
            }

            findUserAll();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void designationAddHome(ActionEvent event) {
       
    }

    @FXML
    void regexFieldAddHome() {
        if(comboInfoHome.getValue().equals("Superficie")){
            searchInfoHome.textProperty().addListener((observable, oldValue, newValue) -> {
                if (!newValue.matches("-?\\d*(\\.\\d*)?")) {
                    searchInfoHome.setText(oldValue);
                }
            });
        } else {
            searchInfoHome.textProperty().addListener((observable, oldValue, newValue) -> {
                if (!newValue.matches("\\d*")) {
                    searchInfoHome.setText(oldValue);
                }
            });
        }

        searchUpHome.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                searchUpHome.setText(oldValue);
            }
        });

        searchDelHome.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                searchDelHome.setText(oldValue);
            }
        });

        designationAddHome.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                designationAddHome.setText(oldValue);
            }
        });

        pieceAddHome.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                pieceAddHome.setText(oldValue);
            }
        });

        loyerAddHome.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                loyerAddHome.setText(oldValue);
            }
        });

        superficieAddHome.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("-?\\d*(\\.\\d*)?")) {
                superficieAddHome.setText(oldValue);
            }
        });
    
    }

    public Integer personNumber(){
        Integer count = null;
        connect = dbconnector.connectDb();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT COUNT(*) AS id FROM locataire";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                count = resultSet.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return count;
    }

    public Integer homeUsedNumber(){
        Integer count = null;
        connect = dbconnector.connectDb();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT COUNT(*) AS nombre_logements_en_location FROM logement WHERE id_logement IN (SELECT id_logement FROM location)";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                count = resultSet.getInt("nombre_logements_en_location");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return count;
    }

    public Integer homeNumber(){
        Integer count = null;
        connect = dbconnector.connectDb();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT COUNT(*) AS nombre_de_locations FROM location";
            statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                count = resultSet.getInt("nombre_de_locations");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return count;
    }

    Integer beforeHomeCalculate = homeNumber()-homeUsedNumber();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboSelectorInfoPersonSetList();   
        comboSelectorDelPersonSetList();
        comboSelectorUpPersonSetList();
        comboPersonFieldAddLocationSetList();
        comboHomeFieldAddLocationSetList();
        comboSelectorUpLocationSetList();
        comboLocationInfoList();
        comboDelLocationList();
        comboEtatAddHomeList();
        comboAdministrateurAddHomeList();
        comboQuartierAddHomeList();
        comboCommuneAddHomeList();
        comboAdresseAddHomeList();
        comboDescriptionAddHomeList();
        comboInfoHomeList();
        comeUpHomeList();
        comboDelHomeList();
        regexFieldAddHome();
        findLocationAll();
        findUserAll();
        searchHomeAll();
        personNumber.setText(personNumber().toString());
        usedHome.setText(homeUsedNumber().toString());
        freeHome.setText(beforeHomeCalculate.toString()); 
    }
}
