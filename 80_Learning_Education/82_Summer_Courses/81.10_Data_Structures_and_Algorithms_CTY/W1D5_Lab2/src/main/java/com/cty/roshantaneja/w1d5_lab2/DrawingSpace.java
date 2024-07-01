package com.cty.roshantaneja.w1d5_lab2;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

/**
 * An area to allow drawing and use of tools
 * @author Brian Sea
 * @version 0.0.1
 * @since PSet 2
 */
public class DrawingSpace extends Pane {

    private String name;
    private final List<Drawlet> allDrawlets;
    private final List<Drawlet> selectedDrawlets;
    private final Tool activeTool;

    /**
     * Create a blank drawing space
     */
    public DrawingSpace(){
        name = "Untitled";
        allDrawlets = new ArrayList();
        selectedDrawlets = new ArrayList<>();

        // For now, the line tool is our only tool
        // TODO: Add a method of selecting between multiple tools
        activeTool = new LineTool();

        // Handle all the mouse events
        // TODO: We need to add handling of keyboard events
        MouseHandler mh = new MouseHandler();
        this.addEventFilter(MouseEvent.ANY, mh);
    }

    public String getName(){
        return name;
    }

    public boolean setName( String n ){
        boolean rtn = false;
        if( n != null && !n.isEmpty()){
            name = n;
            rtn = true;
        }
        return rtn;
    }

    private class MouseHandler implements EventHandler<MouseEvent>{
        public void handle(MouseEvent e ){
            // Send the event to any selected Drawlets
            if( selectedDrawlets.size() > 0 ){
                for( Drawlet d : selectedDrawlets){
                    d.handleMouseEvent(e);
                }

                // Nothing consumed the event so the click is a deselection
                if(!e.isConsumed() && e.getEventType() == MouseEvent.MOUSE_RELEASED){
                    for( Drawlet d : selectedDrawlets) {
                        d.select(false);
                    }
                    selectedDrawlets.clear();
                }
            }
            else {

                // Check to see if a shape was selected
                // We only send the event to elements "under" the pointer
                // TODO: Right now, the first to respond wins... change it?
                if( e.getEventType() == MouseEvent.MOUSE_RELEASED) {
                    for (Drawlet d : allDrawlets) {
                        if (d.getBoundsInParent().contains(e.getX(), e.getY())) {
                           d.handleMouseEvent(e);
                           if( e.isConsumed()){
                               selectedDrawlets.add(d);
                               d.select(true);
                               break;
                           }
                        }
                    }
                }

                // Not selecting a Drawlet... use our active tool!
                if( selectedDrawlets.size() == 0 ) {
                    Drawlet d = activeTool.handleMouseEvent(e);
                    if (d != null) {
                        DrawingSpace.this.getChildren().add(d);
                        d.select(true);
                        selectedDrawlets.add(d);
                        allDrawlets.add(d);
                    }
                }
            }
        }
    }
}
