import greenfoot.*;

public class PatoTiro extends Jogador {
    private int cooldown = 0;
    private boolean lado;
    private boolean virarDireita = true;
    private int chavesColetadas = 0;
    
    public PatoTiro(Contador frutasContador) {
        super(frutasContador);
    }
    
    public void act() {
        super.act();
        
        if (!(getWorld() instanceof Ambiente4)) {
            if (Greenfoot.isKeyDown("right")) {
                move(2);
                lado = false;
                if (!virarDireita) {
                    virar();
                    virarDireita = true;
                }
            }
            if (Greenfoot.isKeyDown("left")) {
                move(-2);
                lado = true;
                if (virarDireita) {
                    virar();
                    virarDireita = false;
                }
            }
            if (getWorld() instanceof Ambiente2) {
                if (Greenfoot.isKeyDown("up")) {
                    setLocation(getX(), getY() - 2);
                }
                if (Greenfoot.isKeyDown("down")) {
                    setLocation(getX(), getY() + 2);
                }
            }
        } else {
            if (Greenfoot.isKeyDown("left")) {
                if (!verificarColisaoAdiante(-2, 0)) { 
                    setLocation(getX() - 2, getY());
                    if (virarDireita) {
                        virar();
                        virarDireita = false;
                    }
                }
            }
            if (Greenfoot.isKeyDown("right")) {
                if (!verificarColisaoAdiante(2, 0)) { 
                    setLocation(getX() + 2, getY()); 
                    if (!virarDireita) {
                        virar();
                        virarDireita = true;
                    }
                }
            }
            if (Greenfoot.isKeyDown("up")) {
                if (!verificarColisaoAdiante(0, -2)) { 
                    setLocation(getX(), getY() - 2); 
                }
            }
            if (Greenfoot.isKeyDown("down")) {
                if (!verificarColisaoAdiante(0, 2)) { 
                    setLocation(getX(), getY() + 2);
                }
            }
        }
    
        if(getWorld() instanceof Ambiente1){
            atirar(); 
        }

        if (cooldown > 0) {
            cooldown--;
        }
    }

    
    private boolean verificarColisaoAdiante(int deltaX, int deltaY) {
        int x = getX() + deltaX;
        int y = getY() + deltaY;

        Color pixelColor = getWorld().getBackground().getColorAt(x, y);

        return pixelColor.equals(new Color(0, 0, 0));
    }

     public void atirar() {
            if (cooldown == 0 && Greenfoot.isKeyDown("enter")) {
                Ovo ovo;
                if (lado) {
                    ovo = new Ovo(-2);
                    getWorld().addObject(ovo, getX() - 10, getY());
                } else {
                    ovo = new Ovo(2);
                    getWorld().addObject(ovo, getX() + 10, getY());
                }
                cooldown = 60;
        }
    }
}
