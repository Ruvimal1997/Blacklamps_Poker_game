package Foker.Game.Controllers;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.ComboBox;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
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
    private ComboBox<?> Cmb_SelectPlayer;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        //Cmb_SelectPlayer.getItems().removeAll(Cmb_SelectPlayer.getItems());
       // Cmb_SelectPlayer.getItems().addAll("Option A", "Option B", "Option C");
        //Cmb_SelectPlayer.getSelectionModel().select("Option B");

    }
}


