import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class keeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class keeper extends Actor
{
int min_x = 157;
int max_x = 844;
 
int x = Greenfoot.getRandomNumber(max_x - min_x) + min_x;
    /**
     * Act - do whatever the keeper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
   if(getX() == x)
        x = Greenfoot.getRandomNumber(max_x - min_x) + min_x;
     
    int speed = 3;
 
    if(x >= getX()+speed)
        setLocation(getX()+speed, getY());
    else if(x <= getX()-speed)
        setLocation(getX()-speed, getY());
    else if(x > getX() || x < getX())
        setLocation(x, getY());
    }    
    }
  


