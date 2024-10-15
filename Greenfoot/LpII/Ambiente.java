import greenfoot.*; 
import java.util.ArrayList;
import java.util.List;

public class Ambiente extends World {
    protected Contador frutasContador;
    protected int vidas;
    protected List<Coracao> coracoes = new ArrayList<>();
    protected GreenfootSound somAmbiente;
    protected boolean derrotaMostrada = false;
    protected boolean vitoriaMostrada = false;
    protected boolean somTocando = false;

    public Ambiente(int l, int a, int vidasIniciais) {    
        super(l, a, 1); 
        vidas = vidasIniciais;
        
        if (this instanceof Ambiente1 || this instanceof Ambiente2 || this instanceof Ambiente3){
            frutasContador = new Contador("Frutas: ", 0);
            addObject(frutasContador, 70, 20);
        }

        atualizarCoracoes();
    }

    public void act() {
        if (!somTocando && somAmbiente != null) {
            somAmbiente.playLoop();
            somTocando = true;
        }
    }

    public void atualizarCoracoes() {
        for (Coracao coracao : coracoes) {
            removeObject(coracao);
        }
        coracoes.clear();

         if (this instanceof Ambiente1 || this instanceof Ambiente2) {
            for (int i = 0; i < vidas; i++) {
                Coracao coracao = new Coracao();
                addObject(coracao, getWidth() - 30 - (i * 30), 24);
                coracoes.add(coracao);
            }
        }
    }

    public void diminuirVida() {
        vidas--;
        atualizarCoracoes();
        Greenfoot.playSound("patosom.mp3");

        if (vidas <= 0) {
            mostrarDerrota();
        }
    }
    
    public void adicionarJogadores(int patoCestaX, int patoCestaY, int patoTiroX, int patoTiroY) {
        addObject(new PatoCesta(frutasContador), patoCestaX, patoCestaY);
        addObject(new PatoTiro(frutasContador), patoTiroX, patoTiroY);
    }

    public void mostrarDerrota() {
        if (!derrotaMostrada) {
            if (somAmbiente != null) {
                somAmbiente.stop();
            }
            derrotaMostrada = true;
            FundoCinza fundoCinza = new FundoCinza(getWidth(), getHeight());
            addObject(fundoCinza, getWidth() / 2, getHeight() / 2);

            Derrota derrota = new Derrota();
            addObject(derrota, getWidth() / 2, - derrota.getImage().getHeight());
        }
    }
}
