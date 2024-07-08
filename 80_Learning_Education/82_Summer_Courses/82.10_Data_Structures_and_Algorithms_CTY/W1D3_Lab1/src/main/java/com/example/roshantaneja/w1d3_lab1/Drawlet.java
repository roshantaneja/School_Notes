package com.example.roshantaneja.w1d3_lab1;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;

public abstract class Drawlet extends Region implements Tool {
    private boolean isSelected;

    /**
     * Change the selection of this object
     * @param selectItem whether to select this object
     * @return true is selection is allowed, false otherwise
     */
    public boolean select(boolean selectItem){
        isSelected = selectItem;
        return selectItem;
    }

    /**
     * Detects if the object thinks it's selected
     * @return true if selected, false otherwise
     */
    public boolean isSelected(){
        return this.isSelected;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public Drawlet handleMouseEvent(MouseEvent m) {
        return null;
    }

    @Override
    public Drawlet handleKeyEvent(KeyEvent k) {
        return null;
    }

    /**
     * Creates an instance specific interactable element so a user can
     * modify an already created Drawlet
     *
     * @return a new graphical element so that user can modify the Drawlet or null if there are no options
     */
    @Override
    public abstract Region getPalette();

    /**
     * Requests that the render happen immediately
     */
    public abstract void render();
}
