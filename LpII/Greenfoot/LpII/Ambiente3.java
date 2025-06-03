import greenfoot.*;
public class Ambiente3 extends Ambiente {
   
     
    
    public Ambiente3(int frutas, int vidas) {
        super(900, 500, vidas);
        frutasContador.setValor(frutas);
        adicionarJogadores(50, getHeight() - 50, 125, getHeight() - 50);
    
        addObject(new Urso(), 850, getHeight() - 25);
        addObject(new Cesta(), 650, getHeight() - 28);
        addObject(new TeclaE(), 650, getHeight() - 100);
        
        mostrarTexto();
    }
    private void mostrarTexto() {
        GreenfootImage textoImagem = new GreenfootImage(170, 25);
        textoImagem.setColor(Color.BLACK);
        textoImagem.fill();
        
        textoImagem.setColor(Color.WHITE);
        textoImagem.setFont(new Font("Arial", 24));
        textoImagem.drawString("Distraia o urso", 8, 20);
        
        Actor textoActor = new Actor() {
            {
                setImage(textoImagem);
            }
        };
        
        addObject(textoActor, getWidth() / 2, 20);
    }
}
