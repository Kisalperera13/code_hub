module com.example.code_hub {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.code_hub to javafx.fxml;
    exports com.example.code_hub;
}