import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class htp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class htp extends World
{

    /**
     * Constructor for objects of class htp.
     * 
     */
    public htp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        mulai MulaiMain = new mulai();
        addObject(MulaiMain, 480, 354);
    }
}
