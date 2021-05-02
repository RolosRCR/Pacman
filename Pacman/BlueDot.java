import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BlueDot extends Dot
{
    public void act() 
    {
        isTouched();    
    }

    public void isTouched()
    {
        if(isTouching(Pacman.class))
        {
            getWorld().removeObject(this);
            points+=10;
        }
    }   
}
