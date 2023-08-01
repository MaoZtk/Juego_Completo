  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Movers
{
    /**
     * Act - do whatever the Players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        SecondLevel();
    }
    public void YouWin()
    {
        if(isTouching(YouWinPlatform.class))
        {
            getWorld().addObject(new YouWinScreen(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            ((MyWorld) getWorld()).detenerMusica();
            
        }
    }
    public void SecondLevel()
    {
        Actor secretDoor = getOneIntersectingObject(secretDoor.class);
        if (secretDoor!=null)
        {
            Greenfoot.setWorld(new MazeWorld());
        }
    }
}
