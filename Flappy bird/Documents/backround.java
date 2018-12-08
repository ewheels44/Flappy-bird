import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class backround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class backround extends World
{

    /**
     * Constructor for objects of class backround.
     * 
     */
    bird flappy = new bird();
    int recharge=0;
    int time=0;
    ScoreBoard scoreboard;
    int clearance=150;
    public backround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(flappy, 300,200);
        prepare();
    }
    public void addScore(){
        scoreboard.addScore(1);
    }
    public int getScore(){
        return scoreboard.getScore();
    }
    public void act(){
        recharge=recharge+1;
        time=time+1;
        if (recharge==300){
           // addObject(new pipe(false,time), 600,570);
          //  addObject(new pipe(true,time), 600,-700);
          Random rand=new Random();
          int midPoint=(rand.nextInt(100)*2)+100;
          int botY=200+(clearance/2)+(midPoint-(clearance/2))/2;
          int topY=(midPoint-(clearance/2))/2;
          addObject(new pipe(false,time,botY), 600,botY);
           addObject(new pipe(true,time,topY), 600,topY);
            recharge=0;
            if (clearance>100){
            clearance=clearance-4;
        }
        if (clearance<100){
            clearance=100;
        }
        }
}

private void prepare()
    {
        scoreboard = new ScoreBoard();
        addObject(scoreboard, 79, 19);
    }
}

