package com.cty.roshantaneja.w1d5_lab2;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Handles the interaction between graphical components
 * @author Brian Sea
 * @since PSet 3
 * @version 0.0.1
 */
public class WorkSpace extends BorderPane {

    /**
     * Graphical element which incorporates the other
     * graphical components
     */
    public WorkSpace(){

        Explorer explorer = new Explorer(this);
        explorer.prefWidthProperty().bind(this.widthProperty().multiply(.3f));

        setLeft(explorer);
    }

    /**
     * Changes the space in the center of the screen and updates the window title
     * @param s the space to switch to
     */
    public void setCenter(DrawingSpace s){
        super.setCenter(s);
        ((Stage)this.getScene().getWindow()).setTitle(s.getName());
    }
}
