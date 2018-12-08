import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 import greenfoot.*;
      import java.awt.Color;
public class ScoreBoard extends Actor
{
        private GreenfootImage board;
        private GreenfootImage sb;
        private int score = 0;
        private String label = "Score:";
        Color color=Color.WHITE;
        UserInfo myInfo = UserInfo.getMyInfo();
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      
        public ScoreBoard()
        {
            super();
            int boardWidth = 200;
            int boardHeight = 30;
            
            board = new GreenfootImage(boardWidth,boardHeight);
            board.setColor(Color.green); 
            //&& Color.blue);
            board.fillRect(0, 0, boardWidth,boardHeight);
            this.setImage(board);
            
            //draw it
            update();
    }    
    public void changeColor(Color c){
        int boardWidth = 200;
            int boardHeight = 30;
       board = new GreenfootImage(boardWidth,boardHeight);
            board.setColor(c); 
            //&& Color.blue);
            board.fillRect(0, 0, boardWidth,boardHeight);
            this.setImage(board);
            update();
    }
    public int getScore()
    {
        return score;
    }
     
    public void addScore(int pts)
    {
        score += pts;
        update();
    }
    public void update()
    {
        sb = new GreenfootImage(board);
        String User="";
        
        User= myInfo.getString(0);
        System.out.println("sb"+myInfo.getString(0));
        /* if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
        User= myInfo.getString(0);
        }*/
        sb.drawImage(new GreenfootImage(label + score+" by: "+User, 18, Color.WHITE, new Color(0,0,0,0)),40,5);
        this.setImage(sb);
    }
    public void updateHS()
    {
        sb = new GreenfootImage(board);
        String HSUser="";
         if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
        HSUser= myInfo.getString(1);
        myInfo.store();
        System.out.println(HSUser);
        //int setHSuser = 0()
        }
    
        sb.drawImage(new GreenfootImage("Highscore is " + score+" by: "+HSUser, 18, Color.WHITE, new Color(0,0,0,0)),25,5);
        this.setImage(sb);
        
}




}
/*public void updateNewHS()
{
 import java.util.Scanner
    //String > == greater than
    //String < == less than
    Word = input.nexLine();
    sb = new GreenfootImage(board);
    String HSUser="";
       if( score >= HSUser=""){
      system.out.println("new Highscore" + score+ "by;" +HSUser, 18, Color.WHITE, new Color(0,0,0,0),25,5);
        
        }
         if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
        HSUser= myInfo.getString(1);      
        myInfo.store();
        System.out.println(HSUser);
        //if( score+= pts > get
        //int setHSuser = 0()
        }
    
       // sb.drawImage(new GreenfootImage("new Highscore is " + score+" by: "+HSUser, 18, Color.WHITE, new Color(0,0,0,0)),25,5);
        this.setImage(sb);
}
}
        /*public void newHS() 
        {
            //char = HSUser;
            sb = new GreenfootImage(board);
            String HSUser=""; 
            if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
        HSUser= myInfo.getString(1);
        myInfo.store();
        System.out.println(HSUser);        
    }
      if (score > get.HSUser){
      myInfo.setScore(score);
      myInfo.store();
    }
       sb.drawImage(new GreenfootImage(" New Highscore is " + score+" by: "+HSUser, 18, Color.WHITE, new Color(0,0,0,0)),25,5);
        this.setImage(sb);
    }
}
  // public void newHS()
   //{
       /*HScore = prefs.getInt("HSUser",0);  
            if(score > highestScore){  
                 //If the score is higher than the highest score we put it's value as the new highest score  
                prefs.putInt("HSUser", score);  
            }  */
      //  }  
    //}  
  
       
       
       



