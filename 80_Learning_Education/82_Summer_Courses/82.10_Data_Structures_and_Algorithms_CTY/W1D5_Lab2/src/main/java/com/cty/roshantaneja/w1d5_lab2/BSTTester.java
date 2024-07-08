package com.cty.roshantaneja.w1d5_lab2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**
 * Driver 2 to make work with PSet 3
 * @since PSet 3
 */
public class BSTTester extends Application {

    public static void main( String[] args ) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BSTree<Integer> tree = new BSTree<Integer>();
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Text doc (*.txt)", "*.txt");
        fc.setSelectedExtensionFilter(filter);
        fc.setTitle("Adding Numbers");

        File file = fc.showOpenDialog(primaryStage);
        if( file != null ) {

            Scanner sc = null;
            try {
                sc = new Scanner(file);
                while( sc.hasNextInt() ) {
                    tree.add(sc.nextInt());
                }
                sc.close();
            }
            catch( FileNotFoundException e ) {
            }
            finally{
                if( sc != null  ){
                    sc.close();
                }
            }

            fc.setTitle("Numbers to Remove");
            file = fc.showOpenDialog(primaryStage);
            if( file != null ) {
                try{
                    sc = new Scanner( file );
                    while( sc.hasNextInt() ){
                        tree.removeAll(sc.nextInt());
                    }
                }
                catch( FileNotFoundException e ) {
                }
                finally{
                    if( sc != null ) {
                        sc.close();
                    }
                }
            }

            fc.setTitle("Save Traversals");
            file = fc.showSaveDialog(primaryStage);
            PrintWriter pw = null;
            if( file != null ) {
                try {
                    pw = new PrintWriter( file );
                    List<Integer> list = tree.preOrder();
                    pw.print("PreOrder: ");
                    for( Integer num : list ){
                        pw.print(num + " " );
                    }
                    pw.println();

                    list = tree.inOrder();
                    pw.print("InOrder: ");
                    for( Integer num : list ){
                        pw.print(num + " " );
                    }
                    pw.println();

                    list = tree.postOrder();
                    pw.print("PostOrder: ");
                    for( Integer num : list ){
                        pw.print(num + " " );
                    }
                    pw.println();
                }
                catch( Exception e ){

                }
                finally {
                    if( pw != null ){
                        pw.close();
                    }
                }
            }

        }
        Platform.exit();
    }
}

