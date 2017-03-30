import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;
/**
 * Write a description of class Cell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cell extends Actor
{
     private boolean revealed;
     private GreenfootImage image;
     private boolean flagged;
     
     
     public Cell()
     {
        image = new GreenfootImage("bathroom-tile.jpg");
        image.scale(38,38);
        setImage(image);
        revealed = false;
        flagged  = false;
        
        //(getWorld().getCellSize() - 2,getWorld().getCellSize() - 2);
     }
     /**
     * Act - do whatever the Cell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       int number;
       if (Greenfoot.mouseClicked(this) && !revealed && !flagged) //clicked on non-revealed cell
       {
           if  ( MineWorld.bombLocations[getY()+1][getX()+1] == true)
           // bomb at clicked cell
           {
               image = new GreenfootImage("bomb.png");
               image.scale(30,30);
               setImage(image);
           }
           else // no bomb at clicked cell
           {
              getImage().setTransparency(0);
              number = ((MineWorld)getWorld()).cellNumbers[getY()][getX()];
              if ( number != 0) // display number on cell
              {
                 image = new GreenfootImage("number" + number + ".png");
                 image.scale(30,30);
                 setImage(image);
                 
              }
              else // number = 0 (cell is clear of bombs or #'s
                   // -> run auto-reveal algorithm 
              {
                  
                  
              
              }
              
            }
            revealed = true;
       }
       
       
          
       
       
       
    }
    
    
        
    
    
   
    
    public String toString()
    {
        return "Cell @ (" + getX() + "," + getY() + ")";
    }
        
        
}
          
        //   reveal
        //((MineWorld)getWorld()).bombLocations[3][3] = true;

    



