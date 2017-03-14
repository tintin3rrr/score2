import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean x;
    private int delay = 1;
    private int rotation;
    private int turn;
    private static final int TURN_LIMIT = 20;
    
    boolean shoot = false;
    public ball(){
        x=false;
        setRotation(270);
        shoot = false;
    }
    public void act() 
    {
    if(Greenfoot.isKeyDown("space")){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(!shoot && mouse!=null){
            turnTowards(mouse.getX(),mouse.getY());
            rotation = getRotation();
        }
        shoot = true;
Greenfoot.playSound("kick1.wav");
    }
            
        
        movement();
    curve();
    animate();

        if(isAtEdge()){
    getWorld().removeObject(this);
life.life--;
Greenfoot.playSound("boo.wav");
        }
    }
   public void movement()
    {
     if(shoot == true){
         move(10);
    }
      
    }
    public void curve(){
     if(shoot == true){
            if(Greenfoot.isKeyDown("Left")){
            turn = Math.max(-30, turn-1);
        }
            if(Greenfoot.isKeyDown("Right")){
        turn = Math.min(turn+1, 30);
        }
        setRotation(rotation + turn);
    }
}
    public void animate(){
        if(shoot == true){
        setImage("8.2.png");
        }
    }
   
}


