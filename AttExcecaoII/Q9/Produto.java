// 9. Escreva um programa em Java que mostra que a ordem dos tratadores de exceções é importante. Se você tentar capturar um tipo de exceção de superclasse antes de um tipo de subclasse, o compilador deve gerar erros. Explique por que ocorrem esse erros.

public class Produto {
    private float valor;
    private float saldo;

    public Produto(float valor, float saldo) {
        this.valor = valor;
        this.saldo = saldo;
    }

    public void compra() throws Excecao, Exception {
        if (saldo >= valor) {
            Excecao e = new Excecao("Produto pode ser vendido");
            throw e;
        } else if (valor < 0) {
            Exception e = new Exception("Valor do produto não pode ser negativo");
            throw e;
        } else {
            Excecao e = new Excecao("Produto não pode ser vendido");
            throw e;
        }
    }
}