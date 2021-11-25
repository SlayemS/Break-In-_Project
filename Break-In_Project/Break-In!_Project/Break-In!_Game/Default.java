import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Default here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Default extends World
{

    /**
     * Constructor for objects of class Default.
     * 
     */
    public Default()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alexei alexei = new Alexei();
        addObject(alexei,1029,704);
        Zombie1 zombie1 = new Zombie1();
        addObject(zombie1,362,436);
        zombie1.setLocation(572,369);
        zombie1.setLocation(573,412);
        zombie1.setLocation(538,437);
        removeObject(zombie1);
        Zombie1 zombie12 = new Zombie1();
        addObject(zombie12,428,745);
        zombie12.setLocation(142,782);
        zombie12.setLocation(43,732);
    }
}
