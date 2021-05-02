import greenfoot.*;

public class Fruit extends PointChanger
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
            points+=40;
        }
    }
}
