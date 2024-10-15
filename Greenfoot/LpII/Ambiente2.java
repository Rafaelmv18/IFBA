import greenfoot.*; 

public class Ambiente2 extends Ambiente {
    private int tempo = 0;
    
    private boolean ultimoRioEsquerdo = true;
    public Ambiente2(int frutas, int vidas) {
        super(1200, 700, vidas);
        frutasContador.setValor(frutas);
        somAmbiente = new GreenfootSound("rio.wav");
        adicionarJogadores(45, getHeight() - 500, 45, getHeight() - 200);
        
        addObject(new Jacare(), 220, getHeight() - 600);
        addObject(new Pedra(), 350, getHeight() - 800);
        addObject(new Tronco(), 478, getHeight() - 400);
        addObject(new Jacare(), 220, getHeight() - 200);
        addObject(new Pedra(), 350, getHeight() - 500);
        addObject(new Tronco(), 478, getHeight() - 100);
        addObject(new Jacare(), 750, getHeight() - 600);
        addObject(new Pedra(), 860, getHeight() - 800);
        addObject(new Tronco(), 998, getHeight() - 400);
        addObject(new Jacare(), 750, getHeight() - 200);
        addObject(new Pedra(), 860, getHeight() - 500);
        addObject(new Tronco(), 998, getHeight() - 100);
    }
    public void act() {
        super.act();

        if (vidas > 0) {
            if (tempo >= 59) {
                adicionarItemRio();
                tempo = 0;
            } else {
                tempo++;
            }
        }
        
        verificarMudancaDeFase();
    }


    private void adicionarItemRio() {
        int[] areasX = { 
            (getWidth() / 2) - 154, (getWidth() / 2) - 260, (getWidth() / 2) - 400, 
            (getWidth() / 2) + 150, (getWidth() / 2) + 270, (getWidth() / 2) + 400 
        };
        
        int areaEscolhida;
        if (ultimoRioEsquerdo) {
            areaEscolhida = Greenfoot.getRandomNumber(3);
        } else {
            areaEscolhida = Greenfoot.getRandomNumber(3) + 3;
        }
    
        ultimoRioEsquerdo = !ultimoRioEsquerdo;
        boolean distanciaOk = verificarDistancia(areasX[areaEscolhida], 100, 150);
    
        if (Greenfoot.getRandomNumber(1) == 0 && distanciaOk) {
            int random = Greenfoot.getRandomNumber(3);
            if (random == 0) {
                addObject(new Jacare(), areasX[areaEscolhida], 0);
            } else if (random == 1) {
                addObject(new Pedra(), areasX[areaEscolhida], 0);
            } else if (random == 2) {
                addObject(new Tronco(), areasX[areaEscolhida], 0);
            }
            
        }
    }
    private boolean verificarDistancia(int x, int distanciaMinimaX, int distanciaMinimaY) {
        for (Object obj : getObjects(Object.class)) {
            Actor actor = (Actor) obj;
            if (Math.abs(actor.getX() - x) < distanciaMinimaX && actor.getY() < distanciaMinimaY) {
                return false;
            }
        }
        return true;
    }

    private void verificarMudancaDeFase() {
        PatoCesta patoCesta = (PatoCesta) getObjects(PatoCesta.class).get(0);
        PatoTiro patoTiro = (PatoTiro) getObjects(PatoTiro.class).get(0);

        if (patoCesta.getX() >= getWidth() - 10 && patoTiro.getX() >= getWidth() - 10) {
            somAmbiente.stop();
            Greenfoot.setWorld(new Ambiente3(frutasContador.getValor(), vidas));
        }
    }
    
    public void diminuirVida(Actor pato) {
        vidas--;
        atualizarCoracoes();  
        Greenfoot.playSound("patosom.mp3");  
       
        if (pato instanceof PatoCesta) {
            PatoCesta patoCesta = (PatoCesta) pato;
            patoCesta.setLocation(45, getHeight() - 500); 
        } else if (pato instanceof PatoTiro) {
            PatoTiro patoTiro = (PatoTiro) pato;
            patoTiro.setLocation(45, getHeight() - 200); 
        }
    
        
        if (vidas <= 0) {
            mostrarDerrota();
        }
    }
}