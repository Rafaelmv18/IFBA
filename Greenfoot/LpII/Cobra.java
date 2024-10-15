import greenfoot.*; 

public class Cobra extends Arvore {
    private boolean viradoDireita = true;
    
    public void act() {
        super.act();
        PatoCesta patoCesta = (PatoCesta) getWorld().getObjects(PatoCesta.class).get(0);
        checarColisao(patoCesta);
    }

    public void checarColisao(Actor alvo) {
        if (isTouching(PatoCesta.class) || isTouching(PatoTiro.class)) {
            ((Ambiente1)getWorld()).diminuirVida();
            getWorld().removeObject(this);
        } else if (getY() > 430) {
            setLocation(getX(), 430);
            int alvoX = alvo.getX();
            int minhaX = getX();
            
            
            if (minhaX < alvoX) {
                move(3);
                setImage("cobratD.png");
            } else if (minhaX > alvoX) {
                move(-3);
                setImage("cobratE.png");
            }
        }
    }

}
