package com.example.launcherfx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ResourceBundle generalResource = ResourceBundle.getBundle("general", Locale.getDefault());

        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main.fxml"));
        fxmlLoader.setResources(generalResource);

        Scene scene = new Scene(fxmlLoader.load(), 700, 350);

        stage.setResizable(false);
        stage.initStyle(StageStyle.UNIFIED);
//        stage.setTitle("Launcher");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}