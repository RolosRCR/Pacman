import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Pacman extends Actor
{
    private static final int OFFSET = 5; 
    private int currentImage;
    private int counter;
    private int direction;

    public Pacman()
    {
        this.setImage("1.PNG");
    }

    public void act() 
    {
        //showPoints();
        movePacman();
        handleDirection();
        getWorld().showText("Punctuation: "+PointChanger.points, 600, 25);
    } 

    public void handleDirection()
    {
        int x = getX();
        int y = getY();

        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(x + OFFSET, y);
            if(isTouching(Wall.class))
                setLocation(x - OFFSET, y);
            if(isAtEdge())
                setLocation(0, y);
            direction=0;
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(x - OFFSET, y);
            if(isTouching(Wall.class))
                setLocation(x + OFFSET, y);
            if(isAtEdge())
                setLocation(750, y);
            direction=2;
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y + OFFSET);
            if(isTouching(Wall.class))
                setLocation(x, y - OFFSET);
            direction=1;
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y - OFFSET);
            if(isTouching(Wall.class))
                setLocation(x, y + OFFSET);
            direction=3;
        }
    }

    public void movePacman()
    {
        if(!isTouching(Wall.class)){
            if (counter==0){
                if (currentImage==0){
                    this.setImage((1+2*direction)+".PNG");
                }
                else if(currentImage==1){
                    this.setImage((2+2*direction)+".PNG");
                }
                currentImage=(currentImage+1)%2;
            }
            counter=(counter+1)%10;
        }
    }
}
