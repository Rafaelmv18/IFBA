public class Helicoptero extends Brinquedo{

    public Helicoptero(double velocidade, double aceleracao){
        super(velocidade, aceleracao);
    }

    @Override
    public void mover(){
        System.out.println("O helicoptero está movendo!");
    }
}