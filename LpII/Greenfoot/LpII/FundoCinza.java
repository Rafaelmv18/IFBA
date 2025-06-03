import greenfoot.*;
/**
 * Write a description of class Jogador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FundoCinza extends Actor {
    public FundoCinza(int largura, int altura) {
        GreenfootImage imagem = new GreenfootImage(largura, altura);
        imagem.setColor(new Color(100, 100, 100, 150));
        imagem.fill();
        setImage(imagem);
    }
}