import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public void act()
    {
        String key=Greenfoot.getKey();
        if (key!=null)
        {
            key=key.toUpperCase();
            if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         //myInfo.setString(0,Greenfoot.getKey());//0 is the current user
         myInfo.setString(0,key);
         myInfo.store();
         //System.out.println(myInfo.getString(0));
        }
            Greenfoot.setWorld(new backround());
        }
    }
   /* if (Greenfoot.isKeyDown("enter"))
    {
    Greenfoot.setWorld(new backround());
}*/


    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
}
