import greenfoot.*; 

public class Fruta extends Arvore {

    public void act() {
        super.act();
        checarColisao();
    }

    public void checarColisao() {
        if (getWorld() != null && !isRemoved()) {
            if (isTouching(PatoCesta.class)) {
                Jogador.coletarFruta();
                getWorld().removeObject(this);
            }
        }
    }

    private boolean isRemoved() {
        return !getWorld().getObjects(Fruta.class).contains(this);
    }
}
