import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class life extends Actor
{
     private int life = 3;
    /**
     * Act - do whatever the life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            setImage(new GreenfootImage("Life : " + life, 30, Color.WHITE, Color.BLACK));
    }    
}
