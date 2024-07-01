package com.cty.roshantaneja.w2d2_lab3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The main Drawing Application
 * @author Brian Sea
 * @version 0.0.1
 * @since PSet 2
 */
public class DrawerApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new WorkSpace(), 500, 500);
        stage.setTitle("Drawer!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}