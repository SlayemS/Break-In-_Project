import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie1 extends Actor
{
    /**
     * Act - do whatever the Zombie1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-3);
        changeDirection();
    }
    public void changeDirection()
    {
        if (isAtEdge()) {
            turn(90);
            setImage("Zombie1_flipped.png");
        }
    }
}
