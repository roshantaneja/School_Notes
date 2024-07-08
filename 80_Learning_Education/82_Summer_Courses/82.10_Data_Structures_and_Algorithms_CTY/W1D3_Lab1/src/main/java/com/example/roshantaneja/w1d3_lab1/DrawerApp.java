package com.example.roshantaneja.w1d3_lab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class DrawerApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new DrawingSpace(), 500, 500);
        stage.setTitle("Drawer!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
