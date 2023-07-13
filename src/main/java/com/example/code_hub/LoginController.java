package com.example.code_hub;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField username_txt;

    @FXML
    private TextField password_txt;

    @FXML
    private Button login_btn;

    @FXML
    private Button signUp_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        login_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                String username=username_txt.getText();
                String password=password_txt.getText();

                if(!username.trim().isEmpty() && !password.trim().isEmpty()){
                    DB_Utils.logInUser(actionEvent,username,password);
                }else {
                    System.out.println("Please fill all the info");
                    Alert alert= new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill all the text fields!");
                    alert.show();
                }

            }
        });

        signUp_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"SignupView.fxml","Sign Up",null);
            }
        });
    }
}















