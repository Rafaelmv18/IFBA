public class Navio extends Brinquedo{

    public Navio(double velocidade, double aceleracao){
        super(velocidade, aceleracao);
    }
    
    @Override
    public void mover(){
        System.out.println("O navio está movendo!");
    }
}