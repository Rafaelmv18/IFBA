public abstract class Brinquedo{
    protected double velocidade;
    protected double aceleracao;

    public Brinquedo(double velocidade, double aceleracao){
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }

    public abstract void mover();

    public void velocidade(int vel){

    }

    public void velocidade(double vel){

    }

    public void velocidade(double vel, double acel){

    }
}