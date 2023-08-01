import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyWalker extends Enemies
{
    boolean upDown;
    int speed= 2;
    public EnemyWalker(boolean upAndDown)
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
        upDown = upAndDown;
    }
    public void act()
    {
        moveAround();
        enemyHitWalls();
    }
    public void enemyHitWalls()
    {
       if (hitWalls() || isAtEdge())
       {
           speed = -speed;
       }
    }
    private void moveAround()
    {
        int x = getX();
        int y= getY();
        if (upDown)
        {
            setLocation(x,y + speed);
        }
        else if (!upDown)
        {
            setLocation(x + speed, y);
        }
        
    }
}
