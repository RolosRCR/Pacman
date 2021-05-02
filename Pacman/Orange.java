import greenfoot.*;

public class Orange extends Fruit
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
            points+=30;
        }
    }
}
