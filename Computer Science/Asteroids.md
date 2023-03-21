### AsteroidsGame.java
```java

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

        super(windowWidth, windowHeight);

        addVertex(-3, 0);

        addVertex(-10, 10);

        addVertex(10, 0);

        addVertex(-10, -10);

        rotate(90);

        recenter();

    }



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