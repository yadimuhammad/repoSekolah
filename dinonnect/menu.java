import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        mulai MulaiMain = new mulai();
        addObject(MulaiMain, 296, 170);
        
        
        cara Cara = new cara();
        addObject(Cara,296,253);
        
        credit Credit = new credit();
        addObject(Credit,296,338);
    }
    public void act() {
        Greenfoot.playSound("bgm.mp3");
    }
}
