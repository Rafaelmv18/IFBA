import greenfoot.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Ambiente4 extends Ambiente {
    private int tempoRestante;
    private int tempo = 0; 
    private String[] imagensDeFundo = {"ambiente4_1.png", "ambiente4_2.png", "ambiente4_3.png"};

    public Ambiente4(int frutas, int vidas) {
        super(1200, 800, vidas);
        somAmbiente = new GreenfootSound("floresta.mp3");
        setBackground(imagensDeFundo[Greenfoot.getRandomNumber(imagensDeFundo.length)]);
        
        tempoRestante = frutas * 4;
        frutasContador = new Contador("Tempo: ", tempoRestante);
        addObject(frutasContador, getWidth() / 2, 20);          
        adicionarJogadores(45, getHeight() - 50, 45, getHeight() - 50);
        
        addObject(new Chave(), 50, getHeight() - 750);
        addObject(new Chave(), 1150, getHeight() - 50);
        addObject(new Pata(), 1155, getHeight() - 750);
    }
    
    public void act() {
        super.act();
        tempo++;
        
        if (tempo >= 60) {
            tempoRestante--;

            frutasContador.setValor(tempoRestante);
            tempo = 0;
        }
        if (tempoRestante <= 0) {
            mostrarDerrota();
        }
    }
}
