package Foker.Game.Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Resources/Login.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/Resources/CSS.css");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Foker Game");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }



}
