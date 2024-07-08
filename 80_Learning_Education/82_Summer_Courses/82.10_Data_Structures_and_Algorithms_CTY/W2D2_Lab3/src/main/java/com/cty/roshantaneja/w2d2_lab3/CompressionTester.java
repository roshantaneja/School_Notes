package com.cty.roshantaneja.w2d2_lab3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.Optional;

/**
 * Driver 2 to test with PSet 4
 * @since PSet 4
 */
public class CompressionTester extends Application {

    public static void main( String[] args ) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Alert compressChoice = new Alert(Alert.AlertType.CONFIRMATION);
        compressChoice.setTitle("Compress?");
        compressChoice.setHeaderText("Which operation would you like to do?");
        ButtonType compressButton = new ButtonType("Compress");
        ButtonType decompressButton = new ButtonType("Decompress");
        ButtonType cancel = new ButtonType("Cancel");
        compressChoice.getButtonTypes().setAll( compressButton, decompressButton, cancel);

        boolean compress = false;
        Optional<ButtonType> result = compressChoice.showAndWait();
        if( result.get() == compressButton ){
            compress = true;
        }
        else if( result.get() == cancel){
            Platform.exit();
            System.exit(0);
        }

        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter textFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        FileChooser.ExtensionFilter compressFilter = new FileChooser.ExtensionFilter("Compressed files (*.dat)", "*.dat");
        fc.getExtensionFilters().addAll(textFilter, compressFilter);

        File file = fc.showOpenDialog(null);
        if( file != null ){
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();

            Compressor compressor = new Compressor();

            byte[] str = null;
            if( compress) {
                str = compressor.compress(new String(data));
            }
            else{
                str = compressor.decompress(data).getBytes();
            }

            File output = fc.showSaveDialog(null);
            if( output != null ){
                DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(output));
                dataOut.write(str);
                dataOut.close();
            }
            else {
                System.out.println(new String(str));
            }
        }
        Platform.exit();
    }
}

