package Foker.Game.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

/**
 * Created Ruvimal Senanayake on 01/06/2017.
 */
public class LoginController implements Initializable
{
    @FXML
    private AnchorPane startPane;

    @FXML
    private Pane Pane;

    @FXML
    private Button Btn_login;

    @FXML
    private TextField Txt_username;

    @FXML
    private PasswordField Txt_password;

    @FXML
    private Hyperlink signUpLink;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }
    @FXML
    private void handleLogin(ActionEvent event) throws IOException
    {
        //Login code should be written
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Resources/MainMenu.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/Resources/CSS.css");
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
        stage = (Stage) Btn_login.getScene().getWindow();
        stage.close();
    }
    @FXML
    public void handleSignUpAction(ActionEvent event) throws IOException
    {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Resources/SignUp.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/Resources/CSS.css");
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
        stage = (Stage) signUpLink.getScene().getWindow();
        stage.close();
    }
}
