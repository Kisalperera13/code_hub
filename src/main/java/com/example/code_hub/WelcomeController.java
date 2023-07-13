package com.example.code_hub;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {
    @FXML
    private Button start_btn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // when user click on this btn he is redirected to the LOGIN page
        start_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"LoginView.fxml","Login",null);
            }
        });
    }
}