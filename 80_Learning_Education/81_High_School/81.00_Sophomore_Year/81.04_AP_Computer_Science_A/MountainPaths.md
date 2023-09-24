---
tags:
  - software
  - CS
  - homework
  - final
  - APCSA
---

# TopographicMap.java

```java
//RT
import acm.graphics.*;
import java.awt.Color;
import java.util.*;
import acm.program.*;


public class TopographicMap
{
    // private instance variables
    private double[][] mapData;
    private boolean valid;

    public TopographicMap(String fileName, int rows, int cols)
    {
        // you'll do this in task #1
        
        double[] data = FileHelper.readDataFromFile(fileName, rows * cols);
        if (data.length == 0){
            valid = false;
        } else {
            //use data to fill mapdata
            mapData = new double[rows][cols];
            int index = 0;
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < cols; j++){
                    mapData[i][j] = data[index];
                    index++;
                }
            }
            valid = true;
        }
    }

    public boolean isValid() {return valid;}
    
    private double findMinimum()
    {
        double min = mapData[0][0];
        for (int i = 0; i < mapData.length; i++){
            for (int j = 0; j < mapData[i].length; j++){
                if (mapData[i][j] < min){
                    min = mapData[i][j];
                }
            }
        }
        return min; // just to get it to compile
    }

    private double findMaximum()
    {
        double max = mapData[0][0];
        for (int i = 0; i < mapData.length; i++){
            for (int j = 0; j < mapData[i].length; j++){
                if (mapData[i][j] > max){
                    max = mapData[i][j];
                }
            }
        }
        return max;
    }

    public void drawMap(GraphicsProgram graphics)
    {
        double min = this.findMinimum();
        double max = this.findMaximum();
        System.out.println(min + " " + max);
        for (int i = 0; i < mapData.length; i++){
            for (int j = 0; j < mapData[i].length; j++){
                double value = mapData[i][j];
                int gray = (int)((value - min) / (max - min) * 255);
                GRect rect = new GRect(j, i, 1, 1);
                rect.setColor(new Color(gray, gray, gray));
                rect.setFilled(true);
                graphics.add(rect);
            }
        }
    }

    public double drawLowestElevPath(GraphicsProgram graphics, int startRow, Color drawColor){
        double sum = 0;
        int currentRow = startRow;
        for (int c = 0; c < mapData[0].length - 1; c++){
            double[] choices = new double[3];
            if (currentRow == 0){ // change up
                choices[0] = Integer.MAX_VALUE;
            } else {
                choices[0] = Math.abs(mapData[currentRow][c] - mapData[currentRow - 1][c+1]);
            }
            choices[1] = Math.abs(mapData[currentRow][c] - mapData[currentRow][c + 1]); // change forward
            if (currentRow == mapData.length - 1){ // change down
                choices[2] = Integer.MAX_VALUE;
            } else {
                choices[2] = Math.abs(mapData[currentRow][c] - mapData[currentRow + 1][c+1]);
            }

            int choice;
            if (choices[1] <= choices[0] && choices[1] <= choices[2]){ // if right is good option
                choice = 1;
            } else if (choices[0] < choices[2]){ // if up is good option
                choice = 0;
            } else if (choices[2] < choices[1]){
                choice = 2;
            } else {
                if (Math.random() < 0.5){
                    choice = 0;
                } else {
                    choice = 2;
                }
            }

            if (choice == 0){
                currentRow--;
            } else if (choice == 2){
                currentRow++;
            }

            sum += choices[choice];

            GRect pixel = new GRect(c, currentRow, 1, 1);
            pixel.setColor(drawColor);
            pixel.setFilled(true);
            graphics.add(pixel);
        }
        return sum;
    }

    // use djikstras algorithm to find the shortest path from startRow point on the left to any point on the right heuristic is overall altitude change
    // return the value of the path based on the cumulative value of altitude change
    // I would like to identify the issue that may arise: This is a particulary gruesome piece of code as i have not implemented a visited list. as a result, on larger maps the runtime in insane, the whole map gets filled with the same color, and it doesnt give the perfect path when done, just runs it in a different color. I have only run this 4 times, it timed out 3 times on my laptop and worked once on my personal desktop after running for about 2-3 minutes. If you can get this to work, godspeed. - RT25
    public double drawLowestDownhillPath(GraphicsProgram graphics, int startRow, Color drawColor){
        double sum = 0;
        int currentRow = startRow;
        for (int c = 0; c < mapData[0].length - 1; c++){
            double[] choices = new double[3];
            if (currentRow == 0){ // change up
                choices[0] = Integer.MAX_VALUE;
            } else {
                choices[0] = mapData[currentRow][c] - mapData[currentRow - 1][c+1];
            }
            choices[1] = mapData[currentRow][c] - mapData[currentRow][c + 1]; // change forward
            if (currentRow == mapData.length - 1){ // change down
                choices[2] = Integer.MAX_VALUE;
            } else {
                choices[2] = mapData[currentRow][c] - mapData[currentRow + 1][c+1];
            }

            int choice;
            if (choices[1] <= choices[0] && choices[1] <= choices[2]){ // if right is good option
                choice = 1;
            } else if (choices[0] < choices[2]){ // if up is good option
                choice = 0;
            } else if (choices[2] < choices[1]){
                choice = 2;
            } else {
                if (Math.random() < 0.5){
                    choice = 0;
                } else {
                    choice = 2;
                }
            }

            if (choice == 0){
                currentRow--;
            } else if (choice == 2){
                currentRow++;
            }

            sum += choices[choice];

            GRect pixel = new GRect(c, currentRow, 1, 1);
            pixel.setColor(drawColor);
            pixel.setFilled(true);
            graphics.add(pixel);
        }
        return sum;
    }
    
    public double drawLowestDjikstras(GraphicsProgram graphics, int startRow, Color drawColor){
        Node source = new Node(0, startRow, 0);
        Queue<Node> queue = new PriorityQueue<Node>();

        int numOfRows = mapData.length;
        int numOfCols = mapData[0].length;

        queue.add(source);

        while (!queue.isEmpty()){

            Node popped = queue.poll();

            if (popped.x == numOfCols - 1){
                return popped.distanceFromSource;
            } else {
                ArrayList<Node> neighbors = new ArrayList<Node>();
                neighbors = getNeighbors(popped, numOfRows, numOfCols);

                for (Node neighbor : neighbors){
                    queue.add(neighbor);
                }
            }

            GRect pixel = new GRect(popped.x, popped.y, 1, 1);
            pixel.setColor(drawColor);
            pixel.setFilled(true);
            graphics.add(pixel);
        }
        return Integer.MAX_VALUE;
    }

    public ArrayList<Node> getNeighbors(Node popped, final int numOfRows, final int numOfCols){
        ArrayList<Node> neighbors = new ArrayList<Node>();
        if (popped.y != 0){
            neighbors.add(new Node(popped.x + 1, popped.y - 1, popped.distanceFromSource + Math.abs(mapData[popped.y][popped.x] - mapData[popped.y - 1][popped.x + 1]))); // add bottom
        }
        if (popped.y != numOfRows - 1){
            neighbors.add(new Node(popped.x + 1, popped.y + 1, popped.distanceFromSource + Math.abs(mapData[popped.y][popped.x] - mapData[popped.y + 1][popped.x + 1]))); // add bottom
        }
        neighbors.add(new Node(popped.x + 1, popped.y, popped.distanceFromSource + Math.abs(mapData[popped.y][popped.x] - mapData[popped.y][popped.x + 1]))); // add middle
        return neighbors;
    }
    
    public int getIndexOfLowestElevPath(GraphicsProgram graphics){
        int bestLineIndex = 0;
        double bestLineLength = 0;
        for (int i = 1; i < mapData.length; i++){
            double currentLineLength = drawLowestElevPath(graphics, i, Color.red);
            if (bestLineLength > currentLineLength){
                bestLineIndex = i;
                bestLineLength = currentLineLength;
            }
        }
        return bestLineIndex;
    }
    
    public int getIndexOfLowestDownhillPath(GraphicsProgram graphics){
        int bestLineIndex = 0;
        double bestLineLength = 0;
        for (int i = 1; i < mapData.length; i++){
            double currentLineLength = drawLowestDownhillPath(graphics, i, Color.orange);
            if (bestLineLength > currentLineLength){
                bestLineIndex = i;
                bestLineLength = currentLineLength;
            }
        }
        return bestLineIndex;
    }

    public int getIndexOfLowestDjikstrasPath(GraphicsProgram graphics){
        int bestLineIndex = 0;
        double bestLineLength = 0;
        for (int i = 1; i < mapData.length; i++){
            double currentLineLength = drawLowestDownhillPath(graphics, i, Color.yellow);
            if (bestLineLength > currentLineLength){
                bestLineIndex = i;
                bestLineLength = currentLineLength;
            }
        }
        return bestLineIndex;
    }

    class Node {
        int x;
        int y;
        double distanceFromSource;

        Node(int x, int y, double dis) {
            this.x = x;
            this.y = y;
            this.distanceFromSource = dis;
        }
    }
    
}

```

# MountainPathFinder.java

```java
//RT
import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MountainPathFinder extends GraphicsProgram
{
    private TopographicMap mountainMap;

    private JButton loadButton;
    private JButton drawButton;
    private JButton findPathButton, downhillPathButton, djikstrasPathButton;
    private JTextField fileNameField;
    private JTextField rowsField, colsField;

    public void init()
    {
        setSize(960, 560);
        setTitle("Mountain Path Finder");
        initGUI();
    }

    public void run()
    {
        addActionListeners();
    }

    private void initGUI()
    {
        // you'll do this in task #0
        JLabel fileNameLabel = new JLabel("File Name:");
        add(fileNameLabel, NORTH);
        fileNameField = new JTextField("Colorado_480x480.txt", 18);
        add(fileNameField, NORTH);
        JLabel sizeLabel = new JLabel("Map Size:");
        add(sizeLabel, NORTH);
        
        rowsField = new JTextField("480", 3);
        add(rowsField, NORTH);
        
        JLabel xLabel = new JLabel("x");
        add(xLabel, NORTH);
        
        colsField = new JTextField("480", 3);
        add(colsField, NORTH);
        
        loadButton = new JButton("Load File");
        add(loadButton, NORTH);
        
        drawButton = new JButton("Draw Map");
        drawButton.setEnabled(false);
        add(drawButton, NORTH);
        
        findPathButton = new JButton("Find Path");
        findPathButton.setEnabled(false);
        add(findPathButton, NORTH);
        
        downhillPathButton = new JButton("Find Downhill Path");
        downhillPathButton.setEnabled(false);
        add(downhillPathButton, NORTH);
        
        djikstrasPathButton = new JButton("Find Djikstra's Path");
        djikstrasPathButton.setEnabled(false);
        add(djikstrasPathButton, NORTH);
    }

    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == loadButton)
            handleLoadButton();
        if (event.getSource() == drawButton)
            handleDrawButton();
        if (event.getSource() == findPathButton)
            handleFindPathButton();
        if (event.getSource() == downhillPathButton)
            handleDownhillPathButton();
        // more to do here eventually
    }

    private void handleLoadButton()
    {
        removeAll();
        String fileName = fileNameField.getText();
        int rows = Integer.parseInt(rowsField.getText());
        int cols = Integer.parseInt(colsField.getText());
        mountainMap = new TopographicMap(fileName, rows, cols);
        
        if (mountainMap.isValid()){
            JOptionPane.showMessageDialog(this, "Map Loaded Successfully!");
            drawButton.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "No bueno");
        }
        findPathButton.setEnabled(false);
        downhillPathButton.setEnabled(false);
        djikstrasPathButton.setEnabled(false);
    }

    private void handleDrawButton(){
        removeAll();
        mountainMap.drawMap(this);
        drawButton.setEnabled(false);
        findPathButton.setEnabled(true);
        downhillPathButton.setEnabled(true);
        djikstrasPathButton.setEnabled(true);
    }
    
    private void handleFindPathButton(){
        int bestIndex = mountainMap.getIndexOfLowestElevPath(this);
        mountainMap.drawLowestElevPath(this, bestIndex, Color.green);
    }
    
    private void handleDownhillPathButton(){
        int bestIndex = mountainMap.getIndexOfLowestDownhillPath(this);
        mountainMap.drawLowestDownhillPath(this, bestIndex, Color.blue);
    }
    
    private void handleDjikstrasPathButton(){
        int bestIndex = mountainMap.getIndexOfLowestDownhillPath(this);
        mountainMap.drawLowestDownhillPath(this, bestIndex, Color.magenta);
    }

}
```