import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends World
{

    /**
     * Constructor for objects of class ScoreBoard.
     * 
     */
    public ScoreBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    super(1024, 768, 1); 
addObject(new home(),961,56);
addObject(new score(),527,61);
    }
}
