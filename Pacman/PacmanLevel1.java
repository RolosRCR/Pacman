import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PacmanLevel1 extends World
{
    public PacmanLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750,550,1); 
        createStage();
        putCharacters();
        putDots();
        PointChanger.points=0;
        showText("Punctuation: "+PointChanger.points, 600, 25);
    }

    public void putDots()
    {
        for (int i=1;i<14;i++)
        {
            this.addObject(new BlueDot(),i*50+25,75);
            this.addObject(new BlueDot(),i*50+25,475);
        }

        this.addObject(new Dot(),75,275);
        this.addObject(new Dot(),675,275);

    }

    public void putCharacters()
    {
        this.addObject(new Pacman(),75,125);
        // this.addObject(new Phantom(), 425, 75);
        this.addObject(new Fruit(), 375, 275);
        this.addObject(new Orange(), 375, 425);
    }

    public void createStage()
    {
        //EN X
        for (int i=0;i<15;i++)
        {
            this.addObject(new Wall(),i*50+25,25);
            this.addObject(new Wall(),i*50+25,525);
        }
        for (int i=3;i<6;i++)
        {
            this.addObject(new Wall(),i*50+25,175);
        }
        for (int i=9;i<12;i++)
        {
            this.addObject(new Wall(),i*50+25,175);
        }
        for (int i=3;i<12;i++)
        {
            this.addObject(new Wall(),i*50+25, 375);
        }
        //EN Y
        for (int i=0;i<3;i++)
        {
            this.addObject(new Wall(),25,i*50+75);
            this.addObject(new Wall(),725,i*50+75);
        }
        for (int i=6;i<9;i++)
        {
            this.addObject(new Wall(),25,i*50+75);
            this.addObject(new Wall(),725,i*50+75);
        }
        for (int i=3;i<6;i++)
        {
            this.addObject(new Wall(),175,i*50+75);
            this.addObject(new Wall(),575,i*50+75);
        }

    }
}
