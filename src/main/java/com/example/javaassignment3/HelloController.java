package com.example.javaassignment3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Label output;

    @FXML
    private TextField input;


    @FXML
    protected  void  CtoF(){
        String userInput = input.getText();
        double fahrenheitValue= tempConversion.convertCtoF(Double.parseDouble(userInput));
        String fahrenheitStringValue= String.valueOf(fahrenheitValue);
        output.setText("The Temperature value in Fahrenheit: "+fahrenheitStringValue);

    }

    @FXML
    protected  void  FtoC(){

        String userInput = input.getText();
        double celsiusValue= tempConversion.convertFtoC(Double.parseDouble(userInput));
        String celsiusStringValue= String.valueOf(celsiusValue);
        output.setText("The Temperature value in Celsius: "+celsiusStringValue);


    }


}