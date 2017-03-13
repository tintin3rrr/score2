import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mode2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mode2 extends Actor
{
    /**
     * Act - do whatever the mode2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if (Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(new scene());
        }
    }    
}
