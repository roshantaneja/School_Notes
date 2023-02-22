## Shark.java

```java
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class Shark extends Critter
{
    // constants
    private static final int MUSTEAT = 8;
    // private instance variables
    private int turnsSinceEaten;
    
    public Shark()
    {
        super();
        setColor(Color.black);
        turnsSinceEaten = 0;
    }
    
    @Override
    public void act(){
        if (getGrid() == null){ // if shark "dies" mid-process, this prevents it from acting while "dead"
            return;
        }
        super.act();
    }
    
    @Override
    public void processActors(ArrayList<Actor> actors){
        if (actors.size() == 0){ // if there are no actors nearby
            turnsSinceEaten++; //increment turns eaten
        } else {
            ArrayList<Fish> fishList = new ArrayList<Fish>(); // create an arraylist of Fish objects
            for (Actor a : actors){
                if (a instanceof Fish && !(a instanceof Shark)){ // if a is a fish and not a shark
                    fishList.add((Fish)(a)); //add to list of edible fish
                }
            }
            
            if (fishList.size() > 0){ // if theres at least 1 fish nearby
                int index = (int)(Math.random() * fishList.size()); // pick a random fish from fishList
                Fish eatenFish = fishList.get(index);
                eatenFish.removeSelfFromGrid(); // remove eaten fish
                turnsSinceEaten = 0; // reset counter
            } else { //if theres no fish in fishList
                turnsSinceEaten ++;
            }
        }
        if (turnsSinceEaten >= MUSTEAT){
            removeSelfFromGrid();
        } 
    }
    
    @Override
    public ArrayList<Location> getMoveLocations(){
        ArrayList<Location> result = new ArrayList<Location>();
        Grid<Actor> gr = getGrid();
        Location current = getLocation();
        int dir = getDirection();
        
        Location halfRight = current.getAdjacentLocation(dir + Location.HALF_RIGHT);
        if (gr.isValid(halfRight) && gr.get(halfRight) == null){
            result.add(halfRight);
        }
        
        Location halfLeft = current.getAdjacentLocation(dir + Location.HALF_LEFT);
        if (gr.isValid(halfLeft) && gr.get(halfLeft) == null){
            result.add(halfLeft);
        }
        
        Location ahead = current.getAdjacentLocation(dir + Location.AHEAD);
        if (gr.isValid(ahead) && gr.get(ahead) == null){
            result.add(ahead);
        }
        
        return result;
        
    }
    
    @Override
    public void makeMove(Location loc){
        Location current = getLocation();
        int dir = current.getDirectionToward(loc);
        setDirection(dir);
        
        if (current.equals(loc)){ // [if im not going anywhere]
            int myDir = getDirection();
            if (Math.random() > 0.5){
                setDirection(myDir + Location.HALF_RIGHT); //rotate 45 right
            } else {
                setDirection(myDir + Location.HALF_LEFT); //rotate 45 left
            }
        } else {
            super.makeMove(loc);
        }
    }

}
```

---
<div style="page-break-after: always;"></div>

## Fish.java

```java
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.awt.Color;
import java.util.ArrayList;

public class Fish extends Critter
{
    // constants (note that these are "protected", so they are
    // available in subclasses of Fish)
    protected final static int BREEDAGE = 5;
    protected final static int OLDAGE = 15;
    protected final static double PROBOFDYING = 0.20;

    // private instance variables
    private int age;
        
    public Fish()
    {
       age=0;
    }
    
    public int getAge(){
        return age;
    }
    
    @Override
    public void act(){
        super.act();
        age++;
        if (age >= OLDAGE){
            if (Math.random() <= PROBOFDYING){
                removeSelfFromGrid();
            }
        }
    }
    
    @Override
    public void processActors(ArrayList<Actor> actors){
	    
    }
}
```

---
<div style="page-break-after: always;"></div>

## FemaleFish.java

```java
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import info.gridworld.world.*;

public class FemaleFish extends Fish
{
    // constants
    private final static int GESTATIONPERIOD = 5;
    
    // private instance variables
    private int turnsPregnant;
    
    public FemaleFish()
    {
        super();  // needed to call Fish constructor, which initializes age
        setColor(Color.PINK);
        turnsPregnant = 0;
    }
    
    @Override
    public void processActors(ArrayList<Actor> actors){
        if (turnsPregnant > 0) {
            return; // leaves before getting pregnant again
            //doesnt process anymore actors
        }
        for (Actor a : actors){
            if (a instanceof MaleFish){
                MaleFish f = (MaleFish)(a);
                if (f.getAge() >= BREEDAGE && getAge() >= BREEDAGE && turnsPregnant == 0){
                    turnsPregnant = 1;
                    setColor(Color.RED);
                }
            }
        }
    }
    
    @Override
    public void act(){
        if (getGrid() == null){
            return;
        }
        
        if (turnsPregnant > 0){
            turnsPregnant += 1;
        }
        if (turnsPregnant >= 5){
            giveBirth();
        }
        super.act();
    }
    
    public void giveBirth(){
        Location current = getLocation();
        Grid<Actor> gr = getGrid();
        
        ArrayList<Location> emptyLocations = gr.getEmptyAdjacentLocations(current);
        
        if (emptyLocations.size() > 0){
            int gender = (int) (Math.random()* 2);
            Location birthPlace = emptyLocations.get((int)(Math.random() * emptyLocations.size()));
            
            Fish fish;
            if (gender == 0){
                fish = new MaleFish();
            } else {
                fish = new FemaleFish();
            }
            fish.putSelfInGrid(gr, birthPlace);
            turnsPregnant = 0;
        }
    }
}
```