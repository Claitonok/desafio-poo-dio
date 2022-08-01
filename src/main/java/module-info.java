module com.example.desafiopoodio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafiopoodio to javafx.fxml;
    exports com.example.desafiopoodio;
}