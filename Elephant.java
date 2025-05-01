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
    
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    GreenfootImage[] idleRight = new GreenfootImage[8];
    
    // direction elephant is facing
    String facing = "right";
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Constructor - the code that gets run once when the object is created
     */
    public Elephant() {
        for (int i = 0; i < idleRight.length; i++) {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100,100);
        }
        
        for (int i = 0; i < idleLeft.length; i++) {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 100);
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    
    /**
     * Animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant() {
        if (animationTimer.millisElapsed() < 100) {
            return;
        }
        animationTimer.mark();
        
        if (facing.equals("right")) {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    private int speed = 3;
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            facing = "left";
            move(-speed);
        }
        else if (Greenfoot.isKeyDown("right")) {
            facing = "right";
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
