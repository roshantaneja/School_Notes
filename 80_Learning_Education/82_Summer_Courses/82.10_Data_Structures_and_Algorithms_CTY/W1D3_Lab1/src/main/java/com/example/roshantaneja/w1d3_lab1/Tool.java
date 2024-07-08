package com.example.roshantaneja.w1d3_lab1;

import javafx.scene.Parent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public interface Tool {
    /**
     * Each tool has a name; need not be unique
     * @return the name of the tool
     */
    String getName();

    /**
     * A description of the tool
     * @return the description of the tool
     */
    String getDescription();

    /**
     * Handle all accepted mouse events.
     * Possible events: pressed, released, click, drag, move, entered, exited
     * @param m the mouse event caused by the user; includes keyboard modiiers
     * @return a new graphic caused by the event or null if nothing new was creqted
     * @see <a href="https://openjfx.io/javadoc/19/javafx.graphics/javafx/scene/input/MouseEvent.html">JavaFX MouseEvent</a>
     */
    Drawlet handleMouseEvent(MouseEvent m);

    /**
     * Handle all accept keyboard events.
     * Possible events: pressed, released, typed
     * @param k the keyboard event caused by the user; include modifiers
     * @return      * @return a new graphic caused by the event or null if nothing new was creqted
     * @see <a href="https://openjfx.io/javadoc/19/javafx.graphics/javafx/scene/input/KeyEvent.html">JavaFX KeyEvent</a>
     */
    Drawlet handleKeyEvent(KeyEvent k);

    /**
     * Creates a tool specific palette so the user can pick options
     * @return a new interactable graphical element or null if there are no options
     */
    Parent getPalette();
}
