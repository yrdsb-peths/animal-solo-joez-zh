import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for elephant
 * 
 * @author Joe
 * @version May 2025
 */
public class Apple extends Actor
{
    int speed = 1;
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);  
        
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd) {
        speed = spd;
    }
    
}
