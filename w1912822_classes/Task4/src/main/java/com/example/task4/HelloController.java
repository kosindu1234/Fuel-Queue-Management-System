package com.example.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private TextField fillName;
    @FXML
    private Label enteredText;
    @FXML
    private Label enteredText1;
    @FXML
    private Label enteredText2;
    @FXML
    private Label enteredText3;
    @FXML
    private Label enteredText4;
    @FXML
    private Button closeButton;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToQueue (ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("fuel.fxml"))));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSearch (ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("find.fxml"))));
        stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onFindButtonClick(){
        String username = fillName.getText();
        enteredText.setText("First Name                : "+username);
        enteredText1.setText("Last Name                 : ");
        enteredText2.setText("Vehicle No                 : ");
        enteredText3.setText("No Of Fuel Liters      : ");
        enteredText4.setText(username+ " is in Queue No : ");
    }
    @FXML
    public void handleCloseButtonAction(ActionEvent event){
        Stage stage= (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}