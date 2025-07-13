module "Your last name goes here".firstscreen {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens controller to javafx.fxml;
    exports main;
    opens main to javafx.fxml;
    exports controller;
    opens model to javafx.base;
    exports model;
}
