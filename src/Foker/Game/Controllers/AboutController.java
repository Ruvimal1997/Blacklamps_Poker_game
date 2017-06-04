package Foker.Game.Controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created Ruvimal Senanayake on 03/06/2017.
 */
public class AboutController implements Initializable {

    @FXML
    private Pane Pane;

    @FXML
    private Button Btn_Back;

    @FXML
    private Button Btn_Exit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    void About_Back(ActionEvent event)  throws IOException{
        Stage stageback = new Stage();
        Parent root5 = FXMLLoader.load(getClass().getResource("/Resources/MainMenu.fxml"));
        Scene scene = new Scene(root5);
        scene.getStylesheets().add("/Resources/CSS.css");
        stageback.setResizable(false);
        stageback.initStyle(StageStyle.UNDECORATED);
        stageback.setScene(scene);
        stageback.show();
        stageback = (Stage) Btn_Back.getScene().getWindow();
        stageback.close();
    }
    @FXML
    void About_Exit(ActionEvent event) {
            Stage stage = (Stage) Btn_Exit.getScene().getWindow();
            stage.close();
            System.exit(0);
    }

}
