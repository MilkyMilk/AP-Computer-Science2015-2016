import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the Snake World
 * 
 * @Joe Polacco
 * @November 21, 2014
 */
public class SnakeWorld extends World
{

    /**
     * Constructor for objects of class SnakeWorld.
     * 
     */
    public SnakeWorld()
    {    
        // Create a new world with 14x14 cells with a cell size of 40x40 pixels.
        super(14, 14, 40); //calls the superclass (i.e. World) constructor
        Counter counter = new Counter();
        addObject(new Snake(counter), 5, 5);
        addObject(new SnakeP2(counter), 6, 6);
        addObject(new Food(), (int) (Math.random() * getWidth()), 
            (int) (Math.random() * getHeight()) );
        addObject(counter, getWidth()-2, 0); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //AnimalP2 animalp2 = new AnimalP2();
        //addObject(animalp2,5,8);
    }
}
