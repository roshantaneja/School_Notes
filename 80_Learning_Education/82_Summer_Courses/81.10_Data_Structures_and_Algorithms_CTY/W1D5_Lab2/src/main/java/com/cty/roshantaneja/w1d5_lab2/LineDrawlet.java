package com.cty.roshantaneja.w1d5_lab2;

import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.List;

/**
 * A graphical line element
 * @author Brian Sea
 * @version 0.0.1
 * @since PSet 2
 */
public class LineDrawlet extends Drawlet {
    // The points in the line
    // TODO: Refactor this if the line gets more complicated
    private final List<Point2D> points;

    /**
     * Graphical elements of the line
     * canvas -- the custom drawing surface
     * selectionBorder -- the outline displayed when we are selected
     * selectedPoint -- the current point being moved
     * isBuilt -- whether the line has been constructed
     */
    private static final int POINT_SIZE = 15;
    private final Canvas canvas;
    private final Border selectionBorder;
    private int selectedPoint;
    private boolean isBuilt;


    public LineDrawlet() {
        this(null);
    }

    /**
     * Create the graphical line element; All lines have at least one point
     * @param startingPoint the first point of the line (null means an empty line)
     */
    public LineDrawlet(Point2D startingPoint){

        isBuilt = false;
        selectedPoint = -1;

        points = new LList<>();
        if( startingPoint != null ) {
            points.add(startingPoint);
        }

        // The canvas shrinks and expands based on its parent
        canvas = new Canvas();
        canvas.widthProperty().bind(this.prefWidthProperty());
        canvas.heightProperty().bind(this.prefHeightProperty());

        // Setup the selection border for faster selection
        this.selectionBorder = new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));
        this.setPrefSize(POINT_SIZE, POINT_SIZE);

        this.getChildren().add(canvas);
    }

    @Override
    protected void layoutChildren(){
        super.layoutChildren();
        render();
    }
    @Override
    public String getName() {
        return "2DLine";
    }

    @Override
    public String getDescription() {
        return "A flexible 2D line";
    }

    @Override
    public Drawlet handleMouseEvent(MouseEvent m) {

        int nearPoint = 0;
        if( !isBuilt ){
            m.consume();
        }
        // Check to see which point we're intersecting (if any)
        // nearPoint will be equal the length if no intersection
        for( Point2D p : points ){
            if( p.distance(m.getX(), m.getY()) < POINT_SIZE){
                break;
            }
            nearPoint++;
        }

        if(m.getEventType() == MouseEvent.MOUSE_RELEASED){
            // Click on a point in the line; consume the event
            if( nearPoint < points.size()){
                m.consume();
            }

            if( m.getClickCount() == 2 ){
                // Detect double-click on the last point
                if( !isBuilt && nearPoint == points.size() - 1){
                    isBuilt = true;
                }
                // Double-click on point after being built, so we delete it
                else if( nearPoint < points.size() ){
                    points.remove(nearPoint);
                }
                render();
            }
            else if(!isBuilt && nearPoint != points.size() - 1){
                // Add a new point to the line
                // You're not allowed to place a point on top the last point
                // but you CAN overlap other points
                points.add(new Point2D(m.getX(), m.getY()));
                render();
            }

            selectedPoint = -1;
        }
        else if( m.getEventType() == MouseEvent.MOUSE_PRESSED){

            // If the user presses on a mid-point, then insert a new
            // point and allow them to drag it around
            Point2D prevPoint = null;
            int insertAt = 0;
            for( Point2D p : points ){
                if( prevPoint != null ){
                    Point2D midPoint = p.midpoint(prevPoint);
                    if(midPoint.distance(m.getX(), m.getY()) < POINT_SIZE){
                        points.add(insertAt, midPoint);
                        nearPoint = insertAt;
                        render();
                        break;
                    }
                }
                insertAt++;
                prevPoint = p;
            }

            selectedPoint = nearPoint;
        }
        else if( isBuilt && m.getEventType() == MouseEvent.MOUSE_DRAGGED ){
            // Move the points selected; Since Points2Ds are immutable,
            // we remove the point and replace it
            if( nearPoint < points.size() ) {
                points.remove(nearPoint);
                points.add(nearPoint, new Point2D(m.getX(), m.getY()));
                render();
            }
        }

        // For now, we don't have an options palette
        return null;
    }

    @Override
    public Drawlet handleKeyEvent(KeyEvent k) {
        return null;
    }

    @Override
    public Region getPalette() {
        return null;
    }

    @Override
    public boolean select(boolean isSelected){
        super.select(isSelected);
        if(isSelected){
            this.setBorder(selectionBorder);
        }
        else {
            this.setBorder(null);
        }

        return isSelected;
    }

    // Draws our line onto a cleared canvas
    public void render() {
        // Don't Draw an empty line
        if( points.size() == 0 ){
            return;
        }

        GraphicsContext gc = canvas.getGraphicsContext2D();
        Color paint = Color.BLACK;
        if( isSelected() ){
            paint = Color.BLUE;
        }

        // Figure out the bounding box of our line
        double[] mins = new double[]{Double.MAX_VALUE, Double.MAX_VALUE};
        double[] maxs = new double[]{Double.MIN_VALUE,Double.MIN_VALUE};
        for(Point2D p : points){
            mins[0] = Math.min( mins[0], p.getX());
            mins[1] = Math.min( mins[1], p.getY());
            maxs[0] = Math.max( maxs[0], p.getX());
            maxs[1] = Math.max( maxs[1], p.getY());
        }

        // Draw the line relative with (0,0) being the top-left of our Region
        gc.clearRect(0,0, canvas.getWidth(), canvas.getHeight());

        Point2D prevPoint = null;
        gc.setFill(paint);
        gc.beginPath();
        gc.moveTo(points.get(0).getX()-mins[0]+POINT_SIZE/2, points.get(0).getY() - mins[1]+POINT_SIZE/2);
        for( Point2D p : points){
            // point UI
            gc.fillOval(p.getX()-mins[0], p.getY()-mins[1], POINT_SIZE, POINT_SIZE);

            // graphical line between anchor points
            gc.lineTo(p.getX()-mins[0]+POINT_SIZE/2, p.getY()-mins[1]+POINT_SIZE/2);

            // Draw midpoints if selected and built
            if( isBuilt && isSelected() && prevPoint != null ){
                Color midPointColor = paint.deriveColor(0, 1, 1, 0.25);
                gc.setFill(midPointColor);

                Point2D midPoint = p.midpoint(prevPoint);
                gc.fillOval(midPoint.getX()-mins[0], midPoint.getY()-mins[1], POINT_SIZE, POINT_SIZE );
                gc.setFill(paint);
            }
            prevPoint = p;
        }
        gc.stroke();

        // Reset our bounding box and location (graphically)
        this.setLayoutX(mins[0]-POINT_SIZE/2);
        this.setLayoutY(mins[1]-POINT_SIZE/2);
        this.setPrefSize(maxs[0]-mins[0]+POINT_SIZE,maxs[1]-mins[1]+POINT_SIZE);
    }
}
