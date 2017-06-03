package Foker.Game.Controllers;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
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

    }
}
