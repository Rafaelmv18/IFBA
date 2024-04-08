public class Banco{
    public String nomeCorrentista;
    public String rg;
    public String cpf;
    public double saldo;    
    public double numero;    
    public String agencia;    

    public Banco(String nomeCorrentista, String rg, String cpf, double saldo, double numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void cadastrar(String nomeCorrentista, String rg, String cpf, double saldo, double numero, String agencia){
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void alterar(String nomeCorrentista, String rg, String cpf, double saldo, double numero, String agencia) {
        this.cadastrar(nomeCorrentista, rg, cpf, saldo, numero, agencia);
    }

    public void imprimirSaldo() {
        System.out.println("Nome do Corretista: " + nomeCorrentista);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
    }
}