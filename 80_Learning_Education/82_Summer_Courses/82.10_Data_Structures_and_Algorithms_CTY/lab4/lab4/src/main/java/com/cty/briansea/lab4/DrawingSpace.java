package com.cty.briansea.lab4;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.lang.reflect.InvocationTargetException;
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
    private List<Drawlet> allDrawlets;
    private List<Drawlet> selectedDrawlets;
    private Tool activeTool;

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

    public JsonNode toJSON(){
        ObjectMapper mapper = new ObjectMapper();

        ObjectNode root = mapper.createObjectNode();
        root.put("type", this.getClass().getName());
        root.put("name", getName());

        ArrayNode drawlets = mapper.createArrayNode();
        for( Drawlet d : this.allDrawlets ){
            drawlets.add(d.toJSON());
        }
        root.put("drawlets", drawlets);
        return root;
    }

    public DrawingSpace fromJSON(JsonNode tree) {
        name = tree.get("name").textValue();
        for(JsonNode let: tree.get("drawlets")){
            try {
                Class c1 = Class.forName(let.get("type").textValue());
                Drawlet dl = (Drawlet) c1.getConstructor(null).newInstance();
                dl = dl.fromJSON(let);
                allDrawlets.add(dl);
                getChildren().add(dl);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        return this;
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

                // Not selecting a edu.ncssm.edu.briansea.pset5.Drawlet... use our active tool!
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
