package com.example.code_hub;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {

    @FXML
    private TextField fName_txt;
    @FXML
    private TextField lName_txt;
    @FXML
    private TextField username_txt;
    @FXML
    private PasswordField password_txt;
    @FXML
    private PasswordField passwordConfirm_txt;
    @FXML
    private Button signUp_btn;
    @FXML
    private Button login_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        signUp_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String fName=fName_txt.getText();
                String lName=lName_txt.getText();
                String username=username_txt.getText();
                String password=password_txt.getText();
                String passwordConfirm=passwordConfirm_txt.getText();

                if(!password.equals(passwordConfirm)){
                    Alert alert=new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Passwords doesn't match");
                    alert.show();
                }else if(!fName.trim().isEmpty() && !lName.trim().isEmpty() && !username.trim().isEmpty() && !password.trim().isEmpty()){
                    DB_Utils.signUserUp(actionEvent,username,password,fName,lName);
//                    System.out.println(fName+","+lName+","+username+","+password);
                }else{
                    Alert alert=new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill all the data");
                    alert.show();
                }


            }
        });

        login_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DB_Utils.changeScene(actionEvent,"LoginView.fxml","Login",null);
            }
        });

    }
}
