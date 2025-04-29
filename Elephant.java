import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, the Hero.
 * 
 * @author Joe
 * @version May 2025
 */
public class Elephant extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-1);
        }
        else if (Greenfoot.isKeyDown("right")) {
            move(1); 
        }
        eat();
    }
    
    /**
     * Eat the apple and spawns a new apple 
     */
    
    public void eat() {
        if (isTouching(Apple.class)) {
            removeTouching(Apple.class);
            
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
        }
    }
}
