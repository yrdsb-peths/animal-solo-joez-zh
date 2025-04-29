import greenfoot.*;

/**
 * The World our hero lives in.
 * 
 * @author Joe
 * @version May 2025
 */

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel = new Label(0, 80);
    
    public MyWorld() {
        super(600, 400, 1);
        
        // creates the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // creates a label
        addObject(scoreLabel, 50, 50);
        
        // creates apples
        createApple();
    }
    
    /**
     * Increase score
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Creates a new apple at a random location at the top of the screen
     */
    public void createApple() {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
