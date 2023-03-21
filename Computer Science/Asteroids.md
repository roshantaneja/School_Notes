### AsteroidsGame.java
```java

import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import java.applet.AudioClip;
import acm.util.MediaTools;

public class AsteroidsGame extends GraphicsProgram
{
    // uncomment out the line below in version 0.4.1
    private ArrayList<Asteroid> asteroids;
    
    private boolean playing, respawned;
    
    private GLabel notificationLabel, scoreLabel, livesLabel;
    
    // uncomment out the line below in version 0.4.1
    private Ship ship;
    
    // uncomment out the line below in version 0.5.2
    // (and don't forget to write bullets = new ArrayList<Bullet>() in the initializeVariables method!)
    private ArrayList<Bullet> bullets; 
    
    private int level, numLivesRemaining, score;
    private AudioClip thrustClip, fireClip, bigBangClip, mediumBangClip, smallBangClip;

    //
    //
    // Runtime Methods

    public void run() {
        // code for version 0.1.1 goes here
        initVars();
        setBackground(Color.black);

        while (playing) {
            animationLoop();
        }

    }

    public void animationLoop() {
        updatePositions();
        if (checkForCollisions(ship) != null) {
            shipCollided();
        }
        
        checkForBulletCollisions();
        if(asteroids.size() == 0){
            level++;
            remove(ship);
            initShip();
            initAsteroids();
        }
        
        scoreLabel.setText("Score: "+score);
        livesLabel.setText("Lives: " + numLivesRemaining);

        pause(5);
    }

    private void updatePositions(){
        for(Asteroid a : asteroids){
            a.updatePosition();
        }
        for(int i = 0; i<bullets.size(); i++){
            if(bullets.get(i).stillMoving()){
                bullets.get(i).updatePosition();
            } else {
                remove(bullets.remove(i));
            }
        }
        ship.updatePosition();
    }

    private void checkForBulletCollisions(){
        for(int i=0; i<bullets.size(); i++){
            Asteroid collidedAsteroid = checkForCollisions(bullets.get(i));
            //hit asteroid
            if(collidedAsteroid != null){
                remove(bullets.remove(i));
                remove(asteroids.remove(asteroids.indexOf(collidedAsteroid)));

                if(!(collidedAsteroid instanceof SmallAsteroid)){ //regular or medium asteroid (need to make another)
                    if(collidedAsteroid instanceof MediumAsteroid){ //medium asteroid
                        score += 50;
                        mediumBangClip.play();
                    } 
                    else { //regular asteroid
                        score += 20;
                        bigBangClip.play();
                    }
                    shotAsteroid(collidedAsteroid);
                } else  {//hit small asteroid
                    score += 100;
                    smallBangClip.play();
                }
            }
        }
    }
    
    //
    //
    // Init Methods

    public void initVars() {
        thrustClip = MediaTools.loadAudioClip("thrust.wav");   
        fireClip = MediaTools.loadAudioClip("fire.wav");   
        bigBangClip = MediaTools.loadAudioClip("bangLarge.wav");   
        mediumBangClip = MediaTools.loadAudioClip("bangMedium.wav");   
        smallBangClip = MediaTools.loadAudioClip("bangSmall.wav");   

        level = 0;
        numLivesRemaining = 3;
        score = 0;

        notificationLabel = new GLabel("(up) = thrust, (left) = rotate left, (right) = rotate right, (space) = fire, (H) = Hyperspace Click mouse to continue");
        notificationLabel.setColor(Color.WHITE);
        notificationLabel.setFont("Courier-Plain-12");
        notificationLabel.setLocation((getWidth()-notificationLabel.getWidth())/2, getHeight()/2-40);
        add(notificationLabel);

        scoreLabel = new GLabel("Score:"+score);
        scoreLabel.setColor(Color.WHITE);
        scoreLabel.setFont("Courier-Plain-10");
        scoreLabel.setLocation(16, 16);
        add(scoreLabel);
        
        livesLabel = new GLabel("Lives: " + numLivesRemaining);
        livesLabel.setColor(Color.WHITE);
        livesLabel.setFont("Courier-Plain-10");
        livesLabel.setLocation(16, 25);
        add(livesLabel);
        
        // uncomment out the line below in version 0.3
        initShip();
        
        asteroids = new ArrayList<Asteroid>();
        initAsteroids();
        
        bullets = new ArrayList<Bullet>();
        
        playing = true;
        respawned = false;
    }

    private void initAsteroids() {
        // code for version 0.3.1 goes here
        for (int i = 0; i < level+3; i ++){
            Asteroid a = new Asteroid(getWidth(), getHeight());
            a.setLocation(Math.random() * getWidth(), Math.random()*getHeight());
            a.rotate(Math.random()*180 - 90);
            asteroids.add(a);
        }
        for (Asteroid a : asteroids){
            a.increaseVelocity(1);
            add(a);
        }
    }

    private void initShip(){
        ship = new Ship(getWidth(), getHeight());
        ship.setLocation(getWidth()/2, getHeight()/2);
        respawned = true;
        add(ship);
    }

    
    //
    //
    // Event Methods
    
    private void shotAsteroid(Asteroid asteroid){
        double angle = Math.random() * 360;
        
        for (int i = 0; i < 3; i++){
            Asteroid a = asteroid instanceof MediumAsteroid ? new SmallAsteroid(getWidth(), getHeight()): new MediumAsteroid(getWidth(), getHeight());
            a.setLocation(asteroid.getX(), asteroid.getY());
            a.rotate(angle + 120*i);
            if(a instanceof MediumAsteroid){
                a.increaseVelocity(1.5);
            } else{
                a.increaseVelocity(2);
            }
            asteroids.add(a);
            add(a);
        }
        asteroids.remove(asteroid); 
        remove(asteroid);
        
    }
    
    public void mouseClicked(MouseEvent e){
        remove(notificationLabel);
    }

    private void shipCollided(){
        if (!respawned){
            numLivesRemaining--; // for now so i can debug
        }
        if (numLivesRemaining == 0) {
            playing = false;
            gameOver();
        } else {
            remove(ship);
            initShip();
        }
    }

    public void keyPressed(KeyEvent e){
        if (e.getKeyCode()==KeyEvent.VK_RIGHT)
            ship.rotate(-15); // rotate a bit clockwise
        if (e.getKeyCode()==KeyEvent.VK_LEFT)
            ship.rotate(15);
        if (e.getKeyCode()==KeyEvent.VK_UP){
            if (respawned) respawned = false; //as soon as you move you lose immunity
            ship.increaseVelocity(0.3);
        }
        if (e.getKeyCode()==KeyEvent.VK_SPACE){
            Bullet b = ship.makeBullet(getWidth(), getHeight());
            b.increaseVelocity(3);
            add(b);
            bullets.add(b);
        }
        if (e.getKeyCode()==KeyEvent.VK_H){
            ship.setLocation(Math.random() * getWidth(), Math.random()*getHeight());
        }
    }
    
    private Asteroid checkForCollisions(GVectorPolygon obj)
    {
        for (Asteroid a:asteroids)
            if (a.getBounds().intersects(obj.getBounds()))
            {
                return a;
            }
        return null;       
    }
    
    public void gameOver(){
        removeAll();
        asteroids.clear();
        bullets.clear();
        
        GLabel gameOverLabel = new GLabel("Game Over!");
        gameOverLabel.setFont("Helvetica-Plain-64");
        gameOverLabel.setColor(Color.WHITE);
        gameOverLabel.setLocation(getWidth()/2 - gameOverLabel.getWidth()/2, 100);
        add(gameOverLabel);

        GLabel stats = new GLabel("You made it to level " + level + " with a score of " + score + ".");
        stats.setFont("Helvetica-Plain-22");
        stats.setColor(Color.WHITE);
        stats.setLocation(getWidth()/2 - stats.getWidth()/2, getHeight()/2-stats.getHeight()/2);
        add(stats);
    }

}
```
### Asteroid.java
```java
import acm.graphics.*;
import java.awt.Color;
import java.util.*;

public class Asteroid extends GVectorPolygon
{
    private double rotation;

    public Asteroid(int windowWidth, int windowHeight)
    {
       super(windowWidth, windowHeight);
       rotation = Math.random();
       addVertex(25, -45);
       addVertex(-25, -45);
       addVertex(-50, 0);
       addVertex(-25, 45);
       addVertex(25, 45);
       addVertex(50, 0);
       recenter();
    }
    
    @Override
    public void updatePosition(){
        rotate(rotation);
        super.updatePosition();
    }
}
```
### Ship.java
```java
import java.awt.Color;

public class Ship extends GVectorPolygon
{

    public Ship(int windowWidth, int windowHeight)
    {
        // write this in version 0.4
        super(windowWidth, windowHeight);
        addVertex(-3, 0);
        addVertex(-10, 10);
        addVertex(10, 0);
        addVertex(-10, -10);
        rotate(90);
        recenter();
    }

    // you'll add a method here in version 0.5.1
    
    public Bullet makeBullet(int windowWidth, int windowHeight){
        Bullet b = new Bullet(windowWidth, windowHeight);
        b.rotate(getTheta());
        b.setLocation(getX(), getY());
        return b;
    }

}
```
### Bullet.java
```java
import java.awt.Color;

public class Bullet extends GVectorPolygon {
    private int numTurns;
    private static final int MAXTURNS=150;

    public Bullet(int windowWidth, int windowHeight) {
       super(windowWidth, windowHeight);
       numTurns = 0;
       addVertex(-1, 1);
       addVertex(1, 1);
       addVertex(1, -1);
       addVertex(-1, -1);
       recenter();
       setFilled(true);
    }
    // complete this in version 0.
    
    public boolean stillMoving() {
        return numTurns < MAXTURNS;
    }
    
    @Override
    public void updatePosition(){
        numTurns ++;
        super.updatePosition();
    }
}
```