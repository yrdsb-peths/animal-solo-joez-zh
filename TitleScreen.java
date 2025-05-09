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
    
    Label instructionlabel = new Label("Use  <- and -> to move", 35);
    Label startLabel = new Label("Press spacebar to start", 35);
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 300, 200);
        addObject(instructionlabel, 300, 265);
        addObject(startLabel, 300, 300);
        
        prepare();
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,300, 100);
    }
}
