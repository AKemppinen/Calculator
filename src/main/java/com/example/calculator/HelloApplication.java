package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Create the calculator
        CalcController calcController = new CalcController();
        BorderPane borderPane = new BorderPane();
        Button resetButton = new Button("Reset");
        Button addButton = new Button("Add");
        TextField textField = new TextField();
        Label sumLabel = new Label("Sum: " + calcController.getValue());

        //Add the reset button functionality
        resetButton.setOnAction(e -> {
            calcController.reset();
            sumLabel.setText("Sum: " + calcController.getValue());
        });

        //Add the add button functionality
        addButton.setOnAction(e -> {
            calcController.add(Float.parseFloat(textField.getText()));
            sumLabel.setText("Sum: " + calcController.getValue());
        });

        //Draw the scene
        borderPane.setBottom(sumLabel);
        borderPane.setTop(textField);
        borderPane.setLeft(resetButton);
        borderPane.setRight(addButton);
        Scene scene = new Scene(borderPane, 200, 200);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}