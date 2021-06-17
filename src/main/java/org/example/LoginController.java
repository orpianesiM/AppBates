package org.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import org.example.entities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginController {
    @FXML private ImageView btnExit;
    @FXML private TextField txtUser;
    @FXML private TextField txtPass;
    @FXML private Button btnSubmitLogin;

    public void onSubmitBtnClicked(ActionEvent actionEvent, Hotel hotel) throws IOException {
        if (txtUser.getText().isEmpty() || txtPass.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setContentText("Debe ingresar usuario y contraseña");
            alert.showAndWait();
        }
    }
      /*  User user = LoginController.isValidUser(txtUser.getText(), txtPass.getText(), hotel);
        if (user != null) {
            if (user instanceof Admin) {
                App.setRoot("admin");
            } else if (user instanceof Employee) {
                App.setRoot("employee");
            } else if (user instanceof Passenger) {
                App.setRoot("passenger");
            }
        }
    }*/

 /*   public static ArrayList<User> listOfAllUsers(Hotel hotel){
        ArrayList<User> users = new ArrayList<>();

        users.addAll(hotel.getPassengerList());
        users.addAll(hotel.getAdminList());
        users.addAll(hotel.getEmployeeList());
        return users;
    }

    public static User isValidUser(String username, String pass, Hotel hotel) {
        User userFound = null;
        List<User> users = listOfAllUsers(hotel);
        if (!users.isEmpty()) {
            for (User u : users) {
                if (u.getUser().equals(username)) {
                    if (u.getPassword().equals(pass)) {
                        userFound = u;
                    }
                }
            }
        }
        return userFound;
    }*/


    public void onExitBtnClicked(MouseEvent mouseEvent){
        Platform.exit();
        System.exit(0);
    }

}
