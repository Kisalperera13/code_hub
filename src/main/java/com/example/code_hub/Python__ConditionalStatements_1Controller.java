package com.example.code_hub;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Python__ConditionalStatements_1Controller implements Initializable {

    @FXML
    private Button back_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        back_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__ContentView.fxml","Python Course Content",null);
            }
        });
    }
}
