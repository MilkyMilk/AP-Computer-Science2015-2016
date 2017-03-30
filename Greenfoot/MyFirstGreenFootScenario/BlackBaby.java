import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackBaby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackBaby extends Actor
{
    private int width;
    private int height;
    private GreenfootImage image;
    
    BlackBaby() {
        image = getImage();
        width = image.getWidth() - 20;
        height = image.getHeight() - 20;
     
        image.scale(width, height);
        setImage(image);
        }
      
    public void act() 
    {
        move(5);
        turn(2);   
        if (Greenfoot.isKeyDown("d")) 
            setRotation(0);
            
        if (Greenfoot.isKeyDown("s")) 
            setRotation(90);
   
        if (Greenfoot.isKeyDown("a")) 
            setRotation(180);
            
        if (Greenfoot.isKeyDown("w")) 
            setRotation(270);    
            
        if (isTouching(Apple.class)) {
            width += 5;
            height += 5;
            image.scale(width,height);
            setImage(image);
            }
            
            
    }    
}
