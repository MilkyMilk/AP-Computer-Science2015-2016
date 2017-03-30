import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeP2 extends AnimalP2
{
    // a List of Tail objects that make up the tail
    private List<TailP2> tailListP2;  
    private int score;
    private Counter counter;
    private int timer;
    private Food foodToAdd;

    public SnakeP2(Counter counter)
    {
        score = 0;
        this.counter = counter;
        tailListP2 = new ArrayList<TailP2>();
        timer = -1;

        // Initialize all of the instance variables appropriately.            
    }
    
     /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    public void act() 
    {
        checkKeyPress();
        
        if (!canMove()) {
            Greenfoot.stop();
        }
        
        if (tailListP2.size() > 0) {
            addTailBehindHead();
            eraseEndOfTail();
        }
        move(1);
        
        if (isTouching(Food.class) || getWorld().getObjects(Food.class).size() == 0) {
            if (isTouching(SuperFood.class)) {
                counter.add(2);
                addTailBehindHead();
                addTailBehindHead();
            } else if (isTouching(BadFood.class)){
                counter.add(-3);
                if (tailListP2.size() >= 0)
                    eraseEndOfTail();
                if (tailListP2.size() > 0)
                    eraseEndOfTail();
            }
            removeTouching(Food.class);
            newFood();
            counter.add(1);
            addTailBehindHead();
        }
        
        if (timer == 0) {
            timer = -1;
            getWorld().removeObject(foodToAdd);
            newFood();
        }
        timer--;
        
    }   
    
    /** 
     * checks to see if the Snake can move!
     */
    public boolean canMove()
    {
        if (atWorldEdge() || tailAhead())
          return false; 
        else
          return true;
    }
    
    /**
     * This method adds a new Food object on a random empty cell
     * Be careful not to place food on an occupied cell
     */
    public void newFood()
    {
       int rand = Greenfoot.getRandomNumber(100);
       if (rand < 80) {
          foodToAdd = new Food();
       } else if (rand >= 80 && rand < 90) {
           foodToAdd = new SuperFood();
       } else {
           foodToAdd = new BadFood();
           timer = 23;
        }
       
       int keepGoing = 0;
       while (keepGoing == 0) {
           int x = Greenfoot.getRandomNumber(getWorld().getWidth()); 
           int y = Greenfoot.getRandomNumber(getWorld().getHeight());
           //System.out.print(keepGoing);
           if (getWorld().getObjectsAt(x, y, Actor.class).size() == 0) {
               getWorld().addObject(foodToAdd, x, y);
               keepGoing = 1;
                  }
              }
       
       //if (!isTouching(Tail.class) || isTouching(Snake.class)) {
           
    }
    
    /**
     * Returns true if there is food directly in front
     * of the head of the snake, false otherwise
     */
    private boolean foodAhead()
    {
        int rotation = getRotation();
        int dx = 0, dy = 0;
        if (rotation == 0) 
            dx++;
        else if (rotation == 90) 
            dy++;
        else if (rotation == 180) 
            dx--;
        else if (rotation == 270) 
            dy--;
        
        Actor actor = getOneObjectAtOffset(dx,dy, Actor.class);
        if ( actor instanceof Food)
           return true;
        else 
           return false;
    }
    
    /**
     * Returns true if there is a tail directly in front
     * of the head of the snake, false otherwise
     */
    private boolean tailAhead()
    {
        int rotation = getRotation();
        int dx = 0, dy = 0;
        if (rotation == 0) 
            dx++;
        else if (rotation == 90) 
            dy++;
        else if (rotation == 180) 
            dx--;
        else if (rotation == 270) 
            dy--;
        
        
        Actor actor = getOneObjectAtOffset(dx,dy, Actor.class);
        if ( actor instanceof Tail)
           return true;
        else 
           return false;
    }
    
    /**
     * This method adds a Tail object at the end of the tail
     * and updates tailListP2 accordingly
     */
    public void addTailBehindHead()
    {
       TailP2 toAdd = new TailP2();
       getWorld().addObject(toAdd,getX(),getY());
       tailListP2.add(toAdd);
    }
    
    /**
     * This method removes the end of the tail from the world
     * and updates tailListP2 accordingly
     */
    public void eraseEndOfTail()
    {
       getWorld().removeObject(tailListP2.get(0)); 
       tailListP2.remove(0);
    }
    
     /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("a")) 
        {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("d")) 
        {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("s")) 
        {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("w")) 
        {
            setRotation(270);
        }
    }
    
    /**
     * Test if we are close to one of the edges of the world. Return true if we are.
     */
    @Override
    public boolean atWorldEdge()
    {
        int rotation = getRotation();
        if (rotation == 0 && getX() + 1 == getWorld().getWidth()  ||
            rotation == 180 && getX() == 0    ||
            rotation == 90 && getY() + 1 == getWorld().getHeight()  ||
            rotation == 270 && getY() == 0  ) 
            return true;
        else
            return false;
    }
    
    
}
