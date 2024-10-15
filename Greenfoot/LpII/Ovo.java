import greenfoot.*; 

/**
 * Write a description of class Ovo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ovo extends Actor {
    private int velocidade;

    public Ovo(int velocidade) {
        this.velocidade = velocidade;
    }

    public void act() {
        if (getWorld() != null) {
            move(velocidade);
            trajetoOvo();
            removerOvoSeForaDoMundo();
        }
    }

    private void trajetoOvo() {
        if (isTouching(Cobra.class)) {
            Greenfoot.playSound("cobrasom.mp3");
            removeTouching(Cobra.class);
            if (getWorld() != null) {
                getWorld().removeObject(this);
            }
        }
    }

    private void removerOvoSeForaDoMundo() {
        if (getWorld() != null) {
            if (getX() <= 0 || getX() >= getWorld().getWidth() - 1) {
                getWorld().removeObject(this);
            }
        }
    }
}
