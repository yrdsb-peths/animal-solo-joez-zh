import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Joe
 * @version May 2025
 */

public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, getHeight()/2);
    }
    
    /**
     * main world act loop
     */
    
    public void act() {
        // starts the game when the user presses the space bar
        if (Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
