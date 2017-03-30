import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MineWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MineWorld extends World
{
    public static boolean[][] bombLocations;
    public int[][] cellNumbers;
     /**
     * Constructor for objects of class MineWorld.
     * 
     */
    public MineWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(10, 10, 40);
        bombLocations = new boolean[12][12];
        cellNumbers = new int[10][10];
        placeBombs();
        numberSquares();
        setBackground("sandstone.jpg");
        getBackground().setColor(Color.BLACK);
        drawGrid();
        addCells();
        debug();
        
        
    }
    
    public void debug()
    {
       System.out.println("Bomb locations: ");
       for (int i = 0; i < bombLocations.length; i++)
       {
         for (int j = 0; j < bombLocations[i].length; j++)
         {
             if ( bombLocations[i][j])
                System.out.print("*" + " ");
             else
                System.out.print("." + " ");
                
         }
         System.out.println();
       }
       
       System.out.println("Cell numbers: ");
       for (int i = 0; i < cellNumbers.length; i++)
       {
         for (int j = 0; j < cellNumbers[i].length; j++)
         {
             System.out.print(cellNumbers[i][j] + " ");
         }
         System.out.println();
       }
    }
         
    private void drawGrid()
    {
        for (int i = 1; i < getWidth(); i++)
            getBackground().drawLine(i*getCellSize(),0,i*getCellSize(),getCellSize()*getHeight());
        for (int i = 1; i < getHeight(); i++)
            getBackground().drawLine(0,i*getCellSize(),getCellSize()*getWidth(),i*getCellSize());
    }
    
    
    private void addCells()
    {
        for (int r = 0; r < getHeight(); r++)
            for (int c = 0 ; c < getWidth(); c++)
                addObject(new Cell(), r,c);
    }
    
    private void placeBombs()
    {
        for (int r = 1; r < 11; r++) {
            for (int c = 1 ; c < 11; c++) {
               if (Math.random()  < 0.1) {
                   bombLocations[r][c] = true;
                }   
            }
        }
    }
  
  
    //assign each cell a number based on neighboring mines
    //cellNumbers[10][10] <-- number these things
    private void numberSquares() {
        for (int r = 0; r < cellNumbers.length; r++) {
            for (int c = 0 ; c < cellNumbers[r].length; c++) {
                int count = 0;
                for(int i = r+2; i >= r; i--) {
                    for (int j = c+2; j >= c; j--) {
                        if(bombLocations[i][j]){
                            count++;
                        }
                    }
                }
                cellNumbers[r][c] = count;
        }
      }
    }
}
