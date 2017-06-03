package Foker.Game.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by Ruvimal Senanayake on 03/06/2017.
 */
public class JoinGameController implements Initializable
{
    @FXML
    private Pane Pane;

    @FXML
    private Button Btn_Play;

    @FXML
    private ComboBox<String> Cmb_SelectPlayer;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        Cmb_SelectPlayer.getItems().removeAll(Cmb_SelectPlayer.getItems());
        Cmb_SelectPlayer.getItems().addAll("2", "3","4","5","6");
        Cmb_SelectPlayer.getSelectionModel().select("Option B");

    }
    @FXML
    void JoinGameAction(ActionEvent event)throws IOException {
        Stage stagetable = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Resources/FokerTable.fxml"));
        Scene scene = new Scene(root);
       // scene.getStylesheets().add("/Resources/CSS.css");
        stagetable.setResizable(false);
       // stagetable.initStyle(StageStyle.UNDECORATED);
        stagetable.setScene(scene);
        stagetable.show();
        stagetable = (Stage) Btn_Play.getScene().getWindow();
        stagetable.close();
    }

}


