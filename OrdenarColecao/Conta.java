public class Conta implements Comparable<Conta>{
    private int numero;
    private String titular;
    private float limiteCredito;
    private float saldo;

    public Conta(int numero, String titular, float limiteCredito, float saldo){
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public float getLimiteCredito(){
        return limiteCredito;
    }

    public float getSaldo(){
        return saldo;
    }

    @Override
    public int compareTo(Conta o){
        if(this.numero > o.numero){
            return 1;
        }

        if(this.numero < o.numero){
            return -1;
        }

        return 0;
    }
}