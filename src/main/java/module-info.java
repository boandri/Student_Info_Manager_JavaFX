module com.example.comp228_lab4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp228_lab4 to javafx.fxml;
    exports com.example.comp228_lab4;
}