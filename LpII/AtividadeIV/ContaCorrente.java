public class ContaCorrente{

    private double valor;

    public ContaCorrente(){
        this.valor = 0;
    }

    public void executarOperacao(Operacao opr){
        this.valor += opr.operar();
    }

    public double getSaldo(){
        return valor;
    }
}