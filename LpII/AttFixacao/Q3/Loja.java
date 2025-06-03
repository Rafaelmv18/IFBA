public class Loja{

    private String nome;
    private String ramo;
    private int anoFundacao;
    private Vendedor vendedor;

    public Loja(String nome, String ramo, int anoFundacao){
        this.nome = nome;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor(){
        return vendedor;
    }

    public void admitirVendedor(Vendedor vendedor){
        System.out.println("Vendedor " + vendedor.getNome() + " admitido!");
    }

    public void demitirVendedor(Vendedor vendedor){
        System.out.println("Vendedor " + vendedor.getNome() + " demitido!");
    }
}