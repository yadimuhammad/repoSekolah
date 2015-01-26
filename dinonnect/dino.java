import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dino extends Actor
{
       public void lompat() {
            
            setLocation(getX(),getY()-10);
            
        }
    /**
     * Act - do whatever the dino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        
        
        setLocation(getX(),getY()+2);
        greenfoot.MouseInfo mouse = Greenfoot.getMouseInfo();
        
       if(Greenfoot.isKeyDown("up")){
        lompat();
        }
        
        if(getOneIntersectingObject(midle.class) !=null){
        
            setLocation(getX(),165);
            
        }
        else if(getOneIntersectingObject(midle.class) == null){
             setLocation(getX(),getY()+2);
       
        }
        
        if(getOneIntersectingObject(batas_bawah.class) != null){
            setLocation(getX(), 330);
        }
       
        if(getOneIntersectingObject(midle2.class) !=null){
        
            ulang();
            
        }
        
        if(getOneIntersectingObject(enemy.class) !=null){
            ulang();
        
        }
        if(getOneIntersectingObject(top.class) !=null){
            ulang();
        }
        
        
            
            
        
        
    }   
    
  
    public void ulang(){
    
        ((wed) getWorld()).kurang();
        setLocation(getX(),150);
        
    }
}
