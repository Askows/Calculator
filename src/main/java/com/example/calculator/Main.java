package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("Калькулятор");
        stage.setScene(new Scene(root,235,300));
        stage.show();
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 235, 300);
//        stage.setTitle("Калькулятор");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}