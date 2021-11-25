import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alexei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alexei extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    public Alexei() {
        velocity = 0;
    }
    public void act()
    {
        Move();
        fall();
        if (Greenfoot.isKeyDown("up")) jump();
    }
    public void Move()
    {
        if (Greenfoot.isKeyDown("right")) move(20);
        if (Greenfoot.isKeyDown("left")) move(-20);
    }
    public void fall() {
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 100) velocity = 0;
        else velocity += GRAVITY;
    }
    public void jump(){
        velocity = -20;
    }
}
    

