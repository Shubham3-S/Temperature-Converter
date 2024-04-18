module com.example.javaassignment3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.javaassignment3 to javafx.fxml;
    exports com.example.javaassignment3;
}