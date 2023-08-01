import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeRunner1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner1 extends Players
{
    /**
     * Act - do whatever the MazeRunner1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int MazeRunner1Lives;
    public MazeRunner1(int lives)
    {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
        MazeRunner1Lives = lives;
    }
    public void act()
    {
        slideAround();
        collectBoost();
        maxSpeed();
        loseLife();
        hitEnemy();
        mazeRunnerHit1();
        SecondLevel();
        youLose();
        if (isTouching(SpeedBoost.class)) 
        {
            puntos++;
            removeTouching(SpeedBoost.class);
        }
        getWorld().showText("Puntos: " + puntos, 50, 25);
    }
    public void mazeRunnerHit1()
    {
        if(hitEnemy())
        {
            setLocation(300, 10);
        }
    }
    public void loseLife()
    {
        if (hitEnemy())
        {
            MazeRunner1Lives--;
        }
    }
    public void youLose()
    {
        if(MazeRunner1Lives == 0)
        {
            getWorld().addObject(new YouLose(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
