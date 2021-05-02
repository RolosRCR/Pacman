// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Dot extends PointChanger
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
            points+=50;
        }
    }     
}
