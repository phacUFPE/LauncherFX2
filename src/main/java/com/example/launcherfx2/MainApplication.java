package com.example.launcherfx2;

import com.example.launcherfx2.utils.LauncherLogger;
import com.example.launcherfx2.utils.constants.GeneralConstants;
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
        ResourceBundle generalResource = ResourceBundle.getBundle(GeneralConstants.GENERAL_RESOURCES, Locale.getDefault());

        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main.fxml"));
        fxmlLoader.setResources(generalResource);

        Scene scene = new Scene(fxmlLoader.load(), 700, 350);

        stage.setResizable(false);
        stage.initStyle(StageStyle.UNIFIED);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}