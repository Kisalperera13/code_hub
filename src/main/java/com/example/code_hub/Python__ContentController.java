package com.example.code_hub;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Python__ContentController implements Initializable {

    @FXML
    private Button back_btn;

    @FXML
    private Button intro_btn;

    @FXML
    private Button variables_btn;

    @FXML
    private Button userIn_btn;

    @FXML
    private Button sysOut_btn;

    @FXML
    private Button conditional_btn;

    @FXML
    private Button loops_btn;

    @FXML
    private Button loops_2_btn;

    @FXML
    private Button functions_btn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        back_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"CoursesView.fxml","Courses",null);
            }
        });

        intro_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__IntroductionView.fxml","Python Introduction",null);
            }
        });

        variables_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__VariablesView.fxml","Python Variables",null);
            }
        });

        userIn_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__UserInputsView.fxml","Python User Inputs",null);
            }
        });

        sysOut_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__ConditionalSTatements_1View.fxml","Python Conditional Statements I",null);
            }
        });

        conditional_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__ConditionalStatements_2View.fxml","Python Conditional Statements II",null);
            }
        });

        loops_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__Loops_1View.fxml","Python Loops I",null);
            }
        });

        loops_2_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__Loops_2View.fxml","Python Loops II",null);
            }
        });

        functions_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"python__FunctionsView.fxml","Python Functions",null);
            }
        });
    }
}
