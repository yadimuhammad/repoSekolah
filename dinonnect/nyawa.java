import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nyawa extends Actor
{
        public nyawa(){
            GreenfootImage newImage = new GreenfootImage(180, 50);
            setImage(newImage);
        
        }  
        
        public void setScore(int hidup){
            GreenfootImage newImage = getImage();
            newImage.clear();
            Font f = new Font("minecraftia",Font.PLAIN, 18);
            newImage.setFont(f);
            Color c = new Color(150, 40, 40, 40);
            newImage.setColor(c);
            newImage.fill();
            newImage.setColor(Color.black);
            newImage.drawString("Nyawa : " + hidup,10,30);
            setImage(newImage);
            
        
        }
}