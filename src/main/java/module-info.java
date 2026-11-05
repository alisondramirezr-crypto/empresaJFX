module empresajfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.empresajfx to javafx.fxml;
    exports co.edu.uniquindio.poo.empresajfx;

    opens viewController to javafx.fxml;
    exports viewController;

    opens model to javafx.fxml, javafx.base;
    exports model;

    exports controller;
}