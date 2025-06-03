import java.util.Objects;

public class Conta implements Comparable<Conta>{
    private int numero;
    private String titular;
    private float limiteCredito;
    private float saldo;

    public Conta(){
        
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public float getLimiteCredito(){
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito){
        this.limiteCredito = limiteCredito;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }     
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Conta conta = (Conta) o;
        return titular.equals(conta.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titular);
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