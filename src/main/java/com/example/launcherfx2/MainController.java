package com.example.launcherfx2;

import com.example.launcherfx2.utils.enums.Languages;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private Languages languages;

    @FXML
    private ComboBox<Languages> languagesCombobox;

    @FXML
    private ProgressBar progressBar;

    /**
     * Chooses a language when an item is chosen in the languagesCombobox.
     *
     * @param event {@link ActionEvent}
     * @throws IOException
     *
     * @author Pedro Henrique Alves Cruz (phac@cin.ufpe.br - pedro.ha.cruz2022@gmail.com)
     */
    @FXML
    void chooseLanguage(ActionEvent event) throws IOException {
        Locale selectedLocale = languagesCombobox.getValue().getLocale();
        Locale.setDefault(selectedLocale);
        reloadStage();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Languages> languages = new SortedList<>(FXCollections.observableArrayList(Languages.values()));
        languagesCombobox.setItems(languages);
        Optional<Languages> language = Languages.getLanguageByLocale(Locale.getDefault());
        language.ifPresent(value -> languagesCombobox.getSelectionModel().select(value));
    }

    /**
     * Reloads the Stage.
     *
     * @throws IOException
     *
     * @author Pedro Henrique Alves Cruz (phac@cin.ufpe.br - pedro.ha.cruz2022@gmail.com)
     */
    public void reloadStage() throws IOException {
        ResourceBundle resource = ResourceBundle.getBundle("general");
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main.fxml"));
        fxmlLoader.setResources(resource);

        Scene scene = new Scene(fxmlLoader.load(), 700, 350);
        Stage stage = (Stage) languagesCombobox.getScene().getWindow();
        stage.setScene(scene);
    }
}