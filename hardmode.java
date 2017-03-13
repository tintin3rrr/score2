import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hardmode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hardmode extends World
{

    /**
     * Constructor for objects of class hardmode.
     * 
     */
    public hardmode()
    {    
        
    super(1000, 900, 1); 
    addObject(new Goal(),500,154);
        addObject(new hardkeeper(),500,259);
        addObject(new ball(),500,855);
        addObject(new arrow(),500,800);
addObject(new rehard(),866,44);
addObject(new home(),945,48);
addObject(new timer(),500,40);
addObject(new score(),150,40);
addObject(new life(),762,40);
    }
}
