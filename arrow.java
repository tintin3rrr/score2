import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow extends Actor
{
    /**
     * Act - do whatever the arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage o = new GreenfootImage("10.1.png");
    MouseInfo mouse;
    public arrow(){
        setImage(o);
        setRotation(270
        );
    }
    public void act() 
    {
    checkMouse();
        if (Greenfoot.isKeyDown("left"))  {               
       turn(-1); 
   }        
   if (Greenfoot.isKeyDown("right")) {               
       turn(1);        
   }  
   if(Greenfoot.isKeyDown("space")){
       World W = getWorld();
       W.removeObjects(W.getObjects(arrow.class));  

    }
    }    
    public void checkMouse(){
        mouse = Greenfoot.getMouseInfo();
        if(mouse!=null){
        turnTowards(mouse.getX(),mouse.getY());
        }
    }
}
