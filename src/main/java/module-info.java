module hsb.main.app.hsb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens hsb.main.app.hsb to javafx.fxml;
    exports hsb.main.app.hsb;
}