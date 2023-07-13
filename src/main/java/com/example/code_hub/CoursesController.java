package com.example.code_hub;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class CoursesController implements Initializable {

    @FXML
    private Button html_btn;
    @FXML
    private Button css_btn;
    @FXML
    private Button c_btn;
    @FXML
    private Button python_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        python_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__ContentView.fxml","Python Course Content",null);
            }
        });

        css_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__ContentView.fxml","Python Course Content",null);
            }
        });

        html_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"html__ContentView.fxml","HTML Course Content",null);
            }
        });
    }
}













