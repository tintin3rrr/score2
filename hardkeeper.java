import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hardkeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class hardkeeper extends Actor
{
    int min_x = 210;
int max_x = 805;
 int x = Greenfoot.getRandomNumber(max_x - min_x) + min_x;
    /**
     * Act - do whatever the hardkeeper wants to do. This method is called whenever
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
    Animate();
    save();
    }    
    public void Animate(){
if(getX()>=448&&getX()<=530)
    setImage("12.1.png");
    if(getX()>=531&&getX()<=630)
    setImage("13.1.png");
     if(getX()>=631&&getX()<=675)
    setImage("14.2.png");
     if(getX()>=676&&getX()<=800)
    setImage("15.2.png");
     if(getX()>=365&&getX()<=447)
    setImage("13.2.png");
     if(getX()>=265&&getX()<=364)
    setImage("14.1.png");
    if(getX()>=140&&getX()<=264)
    setImage("15.1.png");
    }
    public void save(){
    Actor ball = getOneIntersectingObject(ball.class);

    if (ball != null) {
        getWorld().removeObject(ball);
  
    
     
    }
}
}
