import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bird extends Actor
{
    /**
     * Act - do whatever the bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int flap=0;
    int velocity = 0;
    
    public void act() 
    {
         
    
        
        if (flap<=5){
            setImage("flappy_bird_down_wings.png");
        }
        else if (flap<=10){
            setImage("flappy_bird_mid.png");
        }
        else{
            setImage("flappy_bird_up_wings.png");
        }
        //String turn (3)== b;     
        if (getRotation()<=100 || getRotation()>=300){
                         //100                 //340
            turn(2); //2
            //velocity=velocity+4;
        }
        if(Greenfoot.isKeyDown("space"))
        {
            //turn(-3);
            setRotation(-35); //-35
            setLocation (getX() , getY() - 8); //4
            velocity = 0; // 0 
            /*if (velocity+1 >= velocity) {
                setRotation(100);
                
                
                
                
                
            }
        //if (Greenfoot.isKeyUp("spa
       /* if Greenfoot.isKeyUp("space"){
        {
          else if (getRotation()<=-35 || getRotation()>=
            
            
        
        }*/
        }
        flap=flap+1; // orignal is 1
        flap=flap%16;
        velocity=velocity+10; //keep at 4 works best 
        setLocation (getX() , getY() +1+velocity/75 ); //75
        if (getY() >= 375) //375 is orignal number
        {
            World world;
            world=getWorld();
            Greenfoot.setWorld(new endscreen (((backround) getWorld()).getScore()));
            world.removeObject(this);
        }
        
    }

    public void eat()
    {
        Actor bird;

        bird = getOneIntersectingObject(bird.class);
        //bird = getONeIntersectingObject(bird.class);
        int groundLevel = getWorld().getHeight()- getImage().getHeight()/2;
        
        // if (bird <= ( (getY(), 600, getX(),600 )):
        /*{
        getWorld().removeObject(this);
        }
        /* World world;
        world=getWorld();
        world.removeObject(bird);*/
    }
}
   /* public void act ()
    {
      Actor bird;
      
      if (bird.getlocation< (gety())==375)
      {
      
      
    
        
        
        
    
    
}

}*/

    
    
    
    