import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class endscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endscreen extends World
{

    /**
     * Constructor for objects of class endscreen.
     * 
     */
    public void act()
    {
        String key=Greenfoot.getKey();
        if (key!=null&&key!="space")
        {
            key=key.toUpperCase();
            if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         myInfo.setString(0,key);//0 is the current user
         
         myInfo.store();
         System.out.println(myInfo.getString(0));
        }
            Greenfoot.setWorld(new backround());
        }
    }
    public endscreen(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        ScoreBoard sb=new ScoreBoard();
        ScoreBoard hs=new ScoreBoard();
        sb.addScore(score);
        sb.changeColor(Color.BLUE);
        
        addObject(sb,300,200);

         if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
        
         if (score > myInfo.getScore()) {
             myInfo.setScore(score);
             
             //System.out.println("new HS+ "+myInfo.getScore());
             myInfo.setString(1,myInfo.getString(0));
             myInfo.store();  // write back to server
         }
          hs.addScore(myInfo.getScore());
         hs.updateHS();
         addObject(hs,300,230);
        }
     }
     
    }

