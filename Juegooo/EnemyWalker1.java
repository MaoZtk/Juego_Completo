import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyWalker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyWalker1 extends Enemies
{
    boolean upDown;
    int speed= 2;
    public EnemyWalker1(boolean upAndDown)
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
           if (upDown)
            {
                setLocation(getX(), getY() + speed);
            }
            else
            {
                setLocation(getX() + speed, getY());
            }
       }
    }
    private void moveAround()
    {
        if (upDown)
        {
            setLocation(getX(), getY() + speed);
        }
        else
        {
            setLocation(getX() + speed, getY());
        }
        
    }
}
