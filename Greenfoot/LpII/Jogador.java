import greenfoot.*;

public class Jogador extends Actor {
    private static int pontos = 0;
    private static Contador frutasContador;
    protected static int possuiChave = 0;
    private static boolean patoCestaTocandoPata = false;
    private static boolean patoTiroTocandoPata = false;

    public Jogador(Contador frutasContador) {
        this.frutasContador = frutasContador;
        atualizarContadores();
        possuiChave = 0;
    }
    
    public void act() {
        coletarChave(); 
        verificarPata(); 
    }

    private void coletarChave() {
        if (isTouching(Chave.class)) {
            Actor chave = getOneIntersectingObject(Chave.class);
            possuiChave++;
            if (chave != null) {
                getWorld().removeObject(chave); 
            }
        }
    }

     private void verificarPata() {
        if (isTouching(Pata.class)) {
            Actor pata = getOneIntersectingObject(Pata.class);

            if (pata != null) {
                if (this instanceof PatoCesta) {
                    patoCestaTocandoPata = true;
                } else if (this instanceof PatoTiro) {
                    patoTiroTocandoPata = true;
                }
                if (patoCestaTocandoPata && patoTiroTocandoPata && possuiChave == 2) {
                    Greenfoot.setWorld(new Ambiente5());
                }
            }
        } else {
            if (this instanceof PatoCesta) {
                patoCestaTocandoPata = false;
            } else if (this instanceof PatoTiro) {
                patoTiroTocandoPata = false;
            }
        }
    }

    public static void coletarFruta() {
        pontos++;
        frutasContador.incrementar(1);
    }

    private void atualizarContadores() {
        frutasContador.incrementar(0); 
    }

    public void virar() {
        GreenfootImage imagem = getImage();
        imagem.mirrorHorizontally();
        setImage(imagem);
    }
}
