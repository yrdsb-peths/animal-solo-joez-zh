import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, the Hero.
 * 
 * @author Joe
 * @version May 2025
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant_sound.mp3");
    
    private int speed = 3;
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-speed);
        }
        else if (Greenfoot.isKeyDown("right")) {
            move(speed); 
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
            world.increaseScore();
            elephantSound.play();
        }
    }
}
