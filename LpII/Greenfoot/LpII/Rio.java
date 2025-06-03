import greenfoot.*;

public class Rio extends Actor {
    public void act() {
        setLocation(getX(), getY() + 1);

        if (getY() >= getWorld().getHeight() - getImage().getHeight() / 80) {
            if (getWorld() != null) {
                getWorld().removeObject(this);
            }
        }else {
            checarColisao();
        }
    }

    public void checarColisao() {
        if (getWorld() != null) {

            if (isTouching(PatoCesta.class)) {
                PatoCesta patoCesta = (PatoCesta) getOneIntersectingObject(PatoCesta.class);
                if (patoCesta != null && verificarColisao(patoCesta)) {
                    ((Ambiente2)getWorld()).diminuirVida(patoCesta);
                    getWorld().removeObject(this);
                    return;
                }

            }

            if (isTouching(PatoTiro.class)) {
                PatoTiro patoTiro = (PatoTiro) getOneIntersectingObject(PatoTiro.class);
                if (patoTiro != null && verificarColisao(patoTiro)) {
                    ((Ambiente2)getWorld()).diminuirVida(patoTiro);
                    getWorld().removeObject(this);
                }
                
            }
        }
    }

    private boolean verificarColisao(Actor pato) {
        int rioX = getX();
        int rioY = getY();
        int alturaRio = getImage().getHeight();
        int larguraRio = getImage().getWidth();

        int patoX = pato.getX();
        int patoY = pato.getY();
        int alturaPato = pato.getImage().getHeight();
        int larguraPato = pato.getImage().getWidth();

        boolean colisaoLargura = Math.abs(patoX - rioX) <= (larguraRio / 2);
        boolean colisaoAltura = Math.abs(patoY - rioY) <= (alturaRio / 2);

        return colisaoLargura || colisaoAltura;
    }
}
