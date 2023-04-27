module com.example.keyboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.keyboard to javafx.fxml;
    exports com.example.keyboard;
}