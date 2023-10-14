module com.example.launcherfx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.logging;

    opens com.example.launcherfx2 to javafx.fxml;
    exports com.example.launcherfx2;
    exports com.example.launcherfx2.utils;
    opens com.example.launcherfx2.utils to javafx.fxml;
}