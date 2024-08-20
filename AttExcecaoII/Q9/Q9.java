// 9. Escreva um programa em Java que mostra que a ordem dos tratadores de exceções é importante. 
// Se você tentar capturar um tipo de exceção de superclasse antes de um tipo de subclasse, o compilador deve gerar erros.
// Explique por que ocorrem esse erros.

public class Conta {
    private float valor;

    public Conta(float valor){
        this.valor = valor;
    }

    
}