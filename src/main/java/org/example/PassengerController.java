package org.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class PassengerController implements Initializable {
    @FXML private ImageView btnExit;
    @FXML private ImageView btnMyBooking;
    @FXML private ImageView btnRoom;
    @FXML private ImageView btnRoomService;
    @FXML private ImageView btnBooking;
    @FXML private TextField txtCheckOut;
    @FXML private TextField txtCheckIn;
    @FXML private TextField txtDni;
    @FXML private Button btnSubmitBooking;
    @FXML private ComboBox<String> comboBoxType;
    @FXML private AnchorPane panelBooking;
    @FXML private AnchorPane panelRoom;
    @FXML private AnchorPane panelMyBooking;
    @FXML private AnchorPane panelRoomService;
    @FXML private ImageView arrowBooking;
    @FXML private ImageView arrowRoom;
    @FXML private ImageView arrowMyBooking;
    @FXML private ImageView arrowRoomService;


    /**Method to control App tabs**/
    public void onBookingBtnClicked(MouseEvent mouseEvent){
        if(panelBooking.isVisible()){
            panelBooking.setVisible(false);
            arrowBooking.setVisible(false);
            return;
        }
        panelBooking.setVisible(true);
        arrowBooking.setVisible(true);

        panelMyBooking.setVisible(false);
        arrowMyBooking.setVisible(false);
        panelRoomService.setVisible(false);
        arrowRoomService.setVisible(false);
        panelRoom.setVisible(false);
        arrowRoom.setVisible(false);
    }

    public void onRoomBtnClicked(MouseEvent mouseEvent){
        if(panelRoom.isVisible()){
            panelRoom.setVisible(false);
            arrowRoom.setVisible(false);
            return;
        }
        panelRoom.setVisible(true);
        arrowRoom.setVisible(true);

        panelMyBooking.setVisible(false);
        arrowMyBooking.setVisible(false);
        panelRoomService.setVisible(false);
        arrowRoomService.setVisible(false);
        panelBooking.setVisible(false);
        arrowBooking.setVisible(false);
    }

    public void onMyBookingBtnClicked(MouseEvent mouseEvent){
        if(panelMyBooking.isVisible()){
            panelMyBooking.setVisible(false);
            arrowMyBooking.setVisible(false);
            return;
        }
        panelMyBooking.setVisible(true);
        arrowMyBooking.setVisible(true);

        panelBooking.setVisible(false);
        arrowBooking.setVisible(false);
        panelRoomService.setVisible(false);
        arrowRoomService.setVisible(false);
        panelRoom.setVisible(false);
        arrowRoom.setVisible(false);
    }

    public void onRoomServiceBtnClicked(MouseEvent mouseEvent){
        if(panelRoomService.isVisible()){
            panelRoomService.setVisible(false);
            arrowRoomService.setVisible(false);
            return;
        }
        panelRoomService.setVisible(true);
        arrowRoomService.setVisible(true);

        panelRoom.setVisible(false);
        arrowRoom.setVisible(false);
        panelBooking.setVisible(false);
        arrowBooking.setVisible(false);
        panelMyBooking.setVisible(false);
        arrowMyBooking.setVisible(false);
    }

    public void onExitBtnClicked(MouseEvent mouseEvent){
        Platform.exit();
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
