package org.example;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PassengerController implements Initializable {
    /*********************************Passenger***************************************************/
    @FXML private ImageView btnExit;
    @FXML private ImageView btnMyBooking;
    @FXML private ImageView btnRoom;
    @FXML private ImageView btnRoomService;
    @FXML private ImageView btnBooking;
    @FXML private AnchorPane panelBooking;
    @FXML private AnchorPane panelRoom;
    @FXML private AnchorPane panelMyBooking;
    @FXML private AnchorPane panelRoomService;
    @FXML private ImageView arrowBooking;
    @FXML private ImageView arrowRoom;
    @FXML private ImageView arrowMyBooking;
    @FXML private ImageView arrowRoomService;
    /*********************************Booking***************************************************/
    @FXML private DatePicker dateCheckIn;
    @FXML private DatePicker dateCheckOut;
    @FXML private TextField txtDni;
    @FXML private Button btnSubmitBooking;
    @FXML private ComboBox<String> comboBoxType;
    /*********************************Room Service******************************************************/
    @FXML private RadioButton radioBtnChampagne;
    @FXML private RadioButton radioBtnPizza;
    @FXML private RadioButton radioBtnSoda;
    @FXML private RadioButton radioBtnMassage;
    @FXML private Button btnSubmitRoomService;
    /*************************************Room******************************************************/
    @FXML private ImageView imgBates, imgSingle, imgTwin, imgMatrimonial, imgTriple, imgQuad;
    @FXML private Button btnTwin, btnMatrimonial, btnTriple, btnQuad, btnSingle ;
    /*********************************My Booking******************************************************/
  //  @FXML private ListView<Passenger> listViewBooking;
    @FXML private TextField txtDniMyBooking;
    @FXML private Button btnSubmitMyBooking;
    /*********************************End passenger***************************************************/

    /***************************Method to control App tabs********************************************/
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
        imgBates.setVisible(true);
        imgQuad.setVisible(false);
        imgSingle.setVisible(false);
        imgTwin.setVisible(false);
        imgTriple.setVisible(false);
        imgMatrimonial.setVisible(false);
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
    /*************************End*Method to control App tabs*****************************************/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtDni.addEventFilter(KeyEvent.ANY, handlerNumbers);
        comboBoxType.setItems(comboBoxTypeContent); //Asigno elementos al combo box para inicializar
        txtDniMyBooking.addEventFilter(KeyEvent.ANY, handlerNumbers);
    }

    /****************************************On Booking************************************************/
    ObservableList<String> comboBoxTypeContent =
            FXCollections.observableArrayList(
                    "Single",
                    "Twin",
                    "Matrimonial",
                    "Triple",
                    "Quad"
            );

    public void BtnSubmitBooking(MouseEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Reserva");
        if(txtDni.getText().isEmpty() || dateCheckIn.getValue()==null || dateCheckOut.getValue()==null){
            alert.setContentText("No debe haber campos vacíos");
        }else{
            alert.setContentText("Reserva enviada con éxito");
        }
        alert.showAndWait();
    }
    /****************************************On Rooms************************************************/
    public void displayImageSingle(){
       imgSingle.setVisible(true);

       imgBates.setVisible(false);
       imgTwin.setVisible(false);
       imgMatrimonial.setVisible(false);
       imgTriple.setVisible(false);
       imgQuad.setVisible(false);
    }
    public void displayImageTwin(){
        imgTwin.setVisible(true);

        imgSingle.setVisible(false);
        imgBates.setVisible(false);
        imgMatrimonial.setVisible(false);
        imgTriple.setVisible(false);
        imgQuad.setVisible(false);
    }
    public void displayImageMatrimonial(){
        imgMatrimonial.setVisible(true);

        imgSingle.setVisible(false);
        imgBates.setVisible(false);
        imgTwin.setVisible(false);
        imgTriple.setVisible(false);
        imgQuad.setVisible(false);
    }
    public void displayImageTriple(){
        imgTriple.setVisible(true);

        imgSingle.setVisible(false);
        imgBates.setVisible(false);
        imgTwin.setVisible(false);
        imgMatrimonial.setVisible(false);
        imgQuad.setVisible(false);
    }
    public void displayImageQuad(){
        imgQuad.setVisible(true);

        imgSingle.setVisible(false);
        imgBates.setVisible(false);
        imgTwin.setVisible(false);
        imgTriple.setVisible(false);
        imgMatrimonial.setVisible(false);
    }

    /****************************************On My Booking************************************************/
    public void BtnSubmitMyBooking(MouseEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mi Reserva");
        if(txtDniMyBooking.getText().isEmpty()){
            alert.setContentText("Debe ingresar el dni para continuar");
        }
        //traer el user segun dni y mostrar: lbl.setText(userFromJson.get().ToString());

    }

    /****************************************On Room Service************************************************/
    public void BtnSubmitRoomService(MouseEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Room Service");
        alert.setContentText("Pedido realizado con éxito");
        alert.showAndWait();
    }


    /***************************************VALIDATORS***********************************************/
    /**
     *validates that only letters are entered, uppercase or lowercase
     */
    EventHandler<KeyEvent> handlerLetters = new EventHandler<KeyEvent>() {
        private boolean willConsume=false;
        @Override
        public void handle(KeyEvent keyEvent) {
            if(willConsume) keyEvent.consume();

            if(!keyEvent.getCode().toString().matches("[a-zA-Z]")
                    && keyEvent.getCode()!= KeyCode.BACK_SPACE
                    && keyEvent.getCode()!= KeyCode.SHIFT){
                if(keyEvent.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume=true;
                }else if(keyEvent.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume=false;
                }
            }
        }
    };

    /**
     * validate that only numbers are entered with backslash and backspace
     */
    EventHandler<KeyEvent> handlerNumbers = new EventHandler<KeyEvent>() {
        private boolean willConsume=false;
        @Override
        public void handle(KeyEvent keyEvent) {
            if(willConsume) keyEvent.consume();

            if(!keyEvent.getText().matches("[0-9]")
                    && keyEvent.getCode()!= KeyCode.BACK_SPACE){
                if(keyEvent.getEventType() == KeyEvent.KEY_PRESSED){
                    willConsume=true;
                }else if(keyEvent.getEventType() == KeyEvent.KEY_RELEASED){
                    willConsume=false;
                }
            }
        }
    };
    /**************************************END VALIDATORS***********************************************/
}
