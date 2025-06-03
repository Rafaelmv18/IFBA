import greenfoot.*;

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor {
    private int valor = 0; 
    private String prefixo;

    public Contador(String prefixo, int valor) {
        this.prefixo = prefixo;
        this.valor = valor;
        atualizarImagem();
    }

    public void incrementar(int quantidade) {
        valor += quantidade;
        atualizarImagem();
    }

    public void decrementar(int quantidade) {
        valor -= quantidade;
        atualizarImagem();
    }
    
    public int getValor() {
        return valor;
    }
    
    public void setValor(int novoValor) {
        this.valor = novoValor;
        atualizarImagem();
    }

    private void atualizarImagem() {
        setImage(new GreenfootImage(prefixo + valor, 24, Color.WHITE, Color.BLACK));
    }
}
