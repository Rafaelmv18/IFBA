import greenfoot.*;

/**
 * Write a description of class Derrota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Derrota extends Actor {

    public void act() {
        setLocation(getX(), getY() + 3);
        
        if (getY() >= getWorld().getHeight() - getImage().getHeight() / 2) {
            setLocation(getX(), getWorld().getHeight() - getImage().getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
