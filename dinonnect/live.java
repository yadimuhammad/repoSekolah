import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class live here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class live extends Actor
{
    /**
     * Act - do whatever the live wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-1,getY());
        if(getOneIntersectingObject(dino.class) !=null){
            ((wed) getWorld()).nambah();
            getWorld().removeObject(this);
        }
    }    
}
