import greenfoot.*; 

/**
 * Write a description of class Arvore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arvore extends Actor {
    public void act() {
        setLocation(getX(), getY() + 2);
        if (getY() >= getWorld().getHeight() - getImage().getHeight() / 2) {
            if (getWorld() != null) {
                getWorld().removeObject(this);
            }
        }
    }
}
