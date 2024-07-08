package com.example.roshantaneja.w1d3_lab1;

import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class LineTool implements Tool{
    @Override
    public String getName() {
        return "Line Tool";
    }

    @Override
    public String getDescription() {
        return "Allows for multi-segment line";
    }

    @Override
    /**
     * Events supported: release
     */
    public Drawlet handleMouseEvent(MouseEvent m) {

        if( m.getEventType() == MouseEvent.MOUSE_RELEASED ){
            Point2D p = new Point2D(m.getX(), m.getY());
            LineDrawlet lt = new LineDrawlet(p);
            return lt;
        }
        return null;
    }

    @Override
    /**
     * Events supported: none
     */
    public Drawlet handleKeyEvent(KeyEvent k) {
        return null;
    }

    @Override
    /**
     * There is no tool option palette yet
     */
    public Parent getPalette() {
        return null;
    }


    public Tool fromJSON(String s){
        return null;
    }

}
