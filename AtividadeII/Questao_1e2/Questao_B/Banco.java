package Banco;

public class Banco{
    public String NomeCorrentista;
    public String RG;
    public String CPF;
    public Double saldo;    
    public Double numero;    
    public String agencia;    

    public ContaPoupanca(String NomeCorrentista, String RG, String CPF, Double saldo, Double numero, String agencia){
        this.NomeCorrentista = NomeCorrentista;
        this.RG = RG;
        this.CPF = CPF;
        this.saldo = saldo;
        this.numer = numero;
        this.agencia = agencia;
    }

    public cadastrar(String NomeCorrentista, String RG, String CPF, Double saldo, Double numero, String agencia){
        this.NomeCorrentista = NomeCorrentista;
        this.RG = RG;
        this.CPF = CPF;
        this.saldo = saldo;
        this.numer = numero;
        this.agencia = agencia;
    }

    public alterar(String NomeCorrentista, String RG, String CPF, Double saldo, Double numero, String agencia){
        this.cadastrar(NomeCorrentista, RG, CPF, saldo, numero, agencia);
    }

    public ImprimirSaldo(){
        System.out.println("Nome do Corretista" + NomeCorrentista);
        System.out.println("CPF" + CPF);
        System.out.println("Saldo" + saldo);
    }
}