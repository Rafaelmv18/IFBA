import greenfoot.*;

public class PatoCesta extends Jogador {
    private boolean virarDireita = true;
    private Contador frutasContador;

    public PatoCesta(Contador frutasContador) {
        super(frutasContador);
        this.frutasContador = frutasContador;
    }

    public void act() {
        super.act();
        if (!(getWorld() instanceof Ambiente4)){
            if (Greenfoot.isKeyDown("a")) {
                move(-2);
                if (virarDireita) {
                    virar();
                    virarDireita = false;
                }
            }
            if (Greenfoot.isKeyDown("d")) {
                move(2);
                if (!virarDireita) {
                    virar();
                    virarDireita = true;
                }
            }
            if (getWorld() instanceof Ambiente2) {
                if (Greenfoot.isKeyDown("w")) {
                    setLocation(getX(), getY() - 2);
                }
                if (Greenfoot.isKeyDown("s")) {
                    setLocation(getX(), getY() + 2);
                }
            }
        } else {
            if (Greenfoot.isKeyDown("a")) {
                if (!verificarColisaoAdiante(-2, 0)) { 
                    setLocation(getX() - 2, getY());
                    if (virarDireita) {
                        virar();
                        virarDireita = false;
                    }
                }
            }
            if (Greenfoot.isKeyDown("d")) {
                if (!verificarColisaoAdiante(2, 0)) {
                    setLocation(getX() + 2, getY()); 
                    if (!virarDireita) {
                        virar();
                        virarDireita = true;
                    }
                }
            }
            if (Greenfoot.isKeyDown("w")) {
                if (!verificarColisaoAdiante(0, -2)) {
                    setLocation(getX(), getY() - 2);
                }
            }
            if (Greenfoot.isKeyDown("s")) {
                if (!verificarColisaoAdiante(0, 2)) { 
                    setLocation(getX(), getY() + 2); 
                }
            }
        }
        if (Greenfoot.isKeyDown("e") && isTouching(Cesta.class)) {
            Greenfoot.setWorld(new Ambiente4(frutasContador.getValor(), 1));
        }
    }
    private boolean verificarColisaoAdiante(int deltaX, int deltaY) {
        int x = getX() + deltaX;
        int y = getY() + deltaY;

        Color pixelColor = getWorld().getBackground().getColorAt(x, y);

        return pixelColor.equals(new Color(0, 0, 0));
    }
}
