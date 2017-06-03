package Foker.Game.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by Ruvimal Senanayake on 03/06/2017.
 */
public class MainMenuController implements Initializable {

    @FXML
    private Pane Pane;

    @FXML
    private Button Btn_JoinGame;

    @FXML
    private Button Btn_Setting;

    @FXML
    private Button Btn_About;

    @FXML
    private Button Btn_Help;

    @FXML
    private Label userNameLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    void HelpScreenAction(ActionEvent event)throws IOException {
        Stage stagehelp = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("/Resources/About.fxml"));
        Scene scene = new Scene(root1);
        scene.getStylesheets().add("/Resources/CSS.css");
        stagehelp.setResizable(false);
        stagehelp.initStyle(StageStyle.UNDECORATED);
        stagehelp.setScene(scene);
        stagehelp.show();
        stagehelp = (Stage) Btn_Help.getScene().getWindow();
        stagehelp.close();
    }
    @FXML
    void AboutScreenAction(ActionEvent event)throws IOException {
        Stage stageabout = new Stage();
        Parent root2 = FXMLLoader.load(getClass().getResource("/Resources/About.fxml"));
        Scene scene = new Scene(root2);
        scene.getStylesheets().add("/Resources/CSS.css");
        stageabout.setResizable(false);
        stageabout.initStyle(StageStyle.UNDECORATED);
        stageabout.setScene(scene);
        stageabout.show();
        stageabout = (Stage) Btn_About.getScene().getWindow();
        stageabout.close();
    }
    @FXML
    void SettingScreenAction(ActionEvent event) throws IOException{
        Stage stagesettings = new Stage();
        Parent root3 = FXMLLoader.load(getClass().getResource("/Resources/About.fxml"));
        Scene scene = new Scene(root3);
        scene.getStylesheets().add("/Resources/CSS.css");
        stagesettings.setResizable(false);
        stagesettings.initStyle(StageStyle.UNDECORATED);
        stagesettings.setScene(scene);
        stagesettings.show();
        stagesettings = (Stage) Btn_About.getScene().getWindow();
        stagesettings.close();
    }
}
