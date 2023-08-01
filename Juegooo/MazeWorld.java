import greenfoot.*;  

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,6*50,5*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,8*50,3*50);
        mazeBlock2.setLocation(8*50,3*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,8*50,3*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,6*50,3*50);
        mazeBlock4.setLocation(6*50,3*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,4*50,5*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,0*50,11*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,0*50,10*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,0*50,9*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,1*50,9*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,2*50,9*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,3*50,9*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,4*50,9*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,2*50,11*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,6*50,11*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,6*50,10*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,6*50,9*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,6*50,8*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,6*50,7*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,6*50,6*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,2*50,7*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,2*50,6*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,5*50,7*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,7*50,7*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,10*50,7*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,9*50,7*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,10*50,6*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,10*50,5*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,10*50,4*50);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,9*50,2*50);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,8*50,2*50);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,8*50,1*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,9*50,1*50);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,7*50,0*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,10*50,3*50);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,0*50,0*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,9*50,11*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,9*50,10*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,1*50,2*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,1*50,3*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,1*50,4*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,2*50,2*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,3*50,2*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,4*50,2*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,4*50,3*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,2*50,1*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,6*50,1*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,9*50,9*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,10*50,9*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,11*50,11*50);
        MazeRunner mazeRunner = new MazeRunner(5);
        addObject(mazeRunner,48,564);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,298,578);
        mazeBlock36.setLocation(446,573);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,446,573);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,98,578);
        mazeBlock51.setLocation(451,579);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,451,579);
        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,230,497);
        SpeedBoost speedBoost2 = new SpeedBoost();
        addObject(speedBoost2,164,361);
        SpeedBoost speedBoost3 = new SpeedBoost();
        addObject(speedBoost3,371,274);
        SpeedBoost speedBoost4 = new SpeedBoost();
        addObject(speedBoost4,560,388);
        SpeedBoost speedBoost5 = new SpeedBoost();
        addObject(speedBoost5,108,130);
        SpeedBoost speedBoost6 = new SpeedBoost();
        addObject(speedBoost6,198,40);
        Enemyflyer enemyflyer = new Enemyflyer();
        addObject(enemyflyer,497,91);
        Enemyflyer enemyflyer2 = new Enemyflyer();
        addObject(enemyflyer2,240,291);
        Enemyflyer enemyflyer3 = new Enemyflyer();
        addObject(enemyflyer3,554,498);

        EnemyWalker enemyWalker = new EnemyWalker(false);
        addObject(enemyWalker,95,199);
        EnemyWalker enemyWalker2 = new EnemyWalker(false);
        addObject(enemyWalker2,356,407);
        EnemyWalker enemyWalker3 = new EnemyWalker(false);
        addObject(enemyWalker3,150,49);
        EnemyWalker enemyWalker4 = new EnemyWalker(false);
        addObject(enemyWalker4,22,404);
        enemyWalker4.setLocation(344,304);
        enemyWalker2.setLocation(48,411);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,4,399);
        mazeBlock36.setLocation(446,579);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,446,579);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,145,590);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,193,591);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,2,598);
        YouWinPlatform youWinPlatform = new YouWinPlatform();
        addObject(youWinPlatform,550,27);
        removeObject(youWinPlatform);

        YouWinPlatform youWinPlatform2 = new YouWinPlatform();
        addObject(youWinPlatform2,537,35);
        mazeRunner.setLocation(53,516);
        mazeRunner.setLocation(0,511);
        mazeBlock7.setLocation(58,506);
        MazeBlock mazeBlock59 = new MazeBlock();
        addObject(mazeBlock59,50,594);
        MazeBlock mazeBlock60 = new MazeBlock();
        addObject(mazeBlock60,598,148);
        MazeBlock mazeBlock61 = new MazeBlock();
        addObject(mazeBlock61,598,197);
        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,596,246);
        MazeBlock mazeBlock63 = new MazeBlock();
        addObject(mazeBlock63,597,279);
        MazeBlock mazeBlock64 = new MazeBlock();
        addObject(mazeBlock64,595,314);
        MazeBlock mazeBlock65 = new MazeBlock();
        addObject(mazeBlock65,593,347);
        removeObject(mazeBlock7);
        mazeRunner.setLocation(52,540);
    }
}
