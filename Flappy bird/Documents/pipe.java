 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pipe extends Actor
{
    /**
     * Act - do whatever the pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean turned;
    
    public pipe(boolean rotate,int time, int yVal){
          GreenfootImage image = getImage();  
          this.turned=rotate;
        if(rotate){
            setRotation(180);
            image.scale(image.getWidth(), yVal*2);  
            setImage(image); 
        
        }
        else{
            image.scale(image.getWidth(), (400-yVal)*2);  
            setImage(image); 
        }
        
        image = getImage();  
        //image.scale(image.getWidth(), image.getHeight() +time/100);  
        setImage(image);  
    }
    public void act() 
    {
        
        setLocation (getX() -1, getY());
        Actor bird=(Actor) getWorld().getObjects(bird.class).get(0);
            if (bird.getX()==getX()&&turned){
               ((backround) getWorld()).addScore();
                           }
        eat();
        if (getX()<10){
            getWorld().removeObject(this);
        }
        
       
    }
          public void eat()
          {
              Actor bird;
             
              bird = getOneIntersectingObject(bird.class);
              //getOneObjectAtOffset(0, 0, bird.class);
              if (bird !=null)
              {
                  World world;
                  world = getWorld();
                  world.removeObject(bird);
                  Greenfoot.setWorld(new endscreen (((backround) getWorld()).getScore()));
                }
 
}
}

