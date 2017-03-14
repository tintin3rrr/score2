import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scene extends World
{
static int n;
    /**
     * Constructor for objects of class scene.
     * 
     */
    
    public scene(int n)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        addObject(new Goal(),500,154);
        addObject(new keeper(n),500,259);
     
        
addObject(new restart(),866,44);
addObject(new home(),945,48);
addObject(new timer(),500,40);
addObject(new score(),150,40);
addObject(new life(),762,40);
life.life = 3;
score.score = 0;
    }
    public void act(){
        if(getObjects(ball.class).isEmpty()){
           addObject(new ball(),500,855);
           addObject(new arrow(),500,757);
    }
}
}
