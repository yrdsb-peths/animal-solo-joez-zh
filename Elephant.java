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
    
    GreenfootImage[] idle = new GreenfootImage[8];
    
    /**
     * Constructor - the code that gets run once when the object is created
     */
    public Elephant() {
        for (int i = 0; i < idle.length; i++) {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    /**
     * Animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant() {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    private int speed = 3;
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-speed);
        }
        else if (Greenfoot.isKeyDown("right")) {
            move(speed); 
        }
        // eat whenever possible
        eat();
        
        // animate elephant
        animateElephant();
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
