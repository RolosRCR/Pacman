import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phantom extends Actor
{
    private int OFFSET = 5;
    /**
     * Act - do whatever the Phantom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movePhantom();
    }

    public void movePhantom()
    {
        int x=getX();
        int y=getY();
        setLocation(x, y += OFFSET);
        if(isTouching(Wall.class))
            if (OFFSET>0)
                OFFSET=-5;
            else OFFSET=+5;
    }
}
