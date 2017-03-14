import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
{
    private int timersec = 60;
    private int timer = 120;
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (timersec>0){
            timersec--;
        }
        if(timersec==0){
            timer--;
            timersec=60;
        }
        if(timer==0){
         Greenfoot.setWorld(new ScoreBoard());
        }
        setImage(new GreenfootImage("Time left : " + timer, 30, Color.WHITE, null));
    }    
}
