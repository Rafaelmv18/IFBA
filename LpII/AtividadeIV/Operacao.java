public abstract class Operacao{
    protected double valor;

    public Operacao(Double valor) {
        this.valor = valor;
    }

    public abstract double operar();
}
