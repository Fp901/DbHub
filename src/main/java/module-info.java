module org.database.demo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.database.demo3 to javafx.fxml;
    exports org.database.demo3;
}