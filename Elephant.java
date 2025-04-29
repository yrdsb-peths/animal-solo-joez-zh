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
    }
}
