import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(7);
        if(isAtEdge())
            turn( (int) (Math.random() * 360));
        else    
            turn( (int) (Math.random() * 10));
        
        if(isTouching(BlackBaby.class))
            setLocation((int) (Math.random() * 500), (int) (Math.random() * 500));
            
            
    }    
}
