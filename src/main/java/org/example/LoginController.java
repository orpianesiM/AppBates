package org.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoginController {
    @FXML private ImageView btnExit;
    @FXML private TextField txtUser;
    @FXML private TextField txtPass;
    @FXML private Button btnSubmitLogin;

    public void onSubmitBtnClicked(ActionEvent actionEvent){
        if(txtUser.getText().isEmpty() || txtPass.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setContentText("Debe ingresar usuario y contraseña");
            alert.showAndWait();
        }
       /* User user = ControllerLogin.isValidUser(txtUser.getText(), txtPass.getText());
        if(user != null){
            if(user instanceof Admin){
                App.setRoot("admin");
            }else if(user instanceof Employee){
                App.setRoot("employee");
            }else if(user instanceof Passenger){
                App.setRoot("passenger");
            }
        }*/
    }


    public void onExitBtnClicked(MouseEvent mouseEvent){
        Platform.exit();
        System.exit(0);
    }

}
