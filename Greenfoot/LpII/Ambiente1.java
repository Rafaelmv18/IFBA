import greenfoot.*; 

public class Ambiente1 extends Ambiente {
    private int tempo = 0;
    private Contador tempoContador;
    private int tempoRestante = 60; 

    public Ambiente1() {    
        super(900, 500, 3);
        somAmbiente = new GreenfootSound("floresta.mp3");

        tempoContador = new Contador("Tempo: ", tempoRestante);
        addObject(tempoContador, getWidth() / 2, 20);

        adicionarJogadores(200, getHeight() - 50, 700, getHeight() - 50);
    }

    public void act() {
        super.act();

        if (vidas > 0) {
            if (tempo >= 59) {
                adicionarItemArvore();
                tempo = 0;
            } else {
                tempo++;
            }
            if (tempoRestante == 0) {
                somAmbiente.stop();
                Greenfoot.setWorld(new Ambiente2(frutasContador.getValor(), vidas));
            } else if (tempo % 60 == 0) {
                tempoRestante--;
                tempoContador.decrementar(1);
            }
        }
    }

    private void adicionarItemArvore() {
        int random = Greenfoot.getRandomNumber(3);
        if (random == 0) {
            addObject(new Maca(), Greenfoot.getRandomNumber(getWidth()), 0);
        } else if (random == 1) {
            addObject(new Banana(), Greenfoot.getRandomNumber(getWidth()), 0);
        } else {
            addObject(new Cobra(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }
}
