public class Carro {
    
    public int codigo;
    public String marca;
    public String cor;
    public String modelo;
    public int anoFabricacao;
    public int numPortas;
    public String tipoCombustivel;
    public int quantidadeDisponivel;
    public double preco;
    public boolean completo;

    public Carro(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numPortas, String tipoCombustivel, int quantidadeDisponivel, Double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
    }

    public void cadastrar(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numPortas, String tipoCombustivel, int quantidadeDisponivel, Double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
    }


    public void alterar(int codigo, String marca, String cor, String modelo, int anoFabricacao, int numPortas, String tipoCombustivel, int quantidadeDisponivel, Double preco, boolean completo) {
        this.cadastrar(codigo, marca, cor, modelo, anoFabricacao, numPortas, tipoCombustivel, quantidadeDisponivel, preco, completo);
    }

    public void listar() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Número de Portas: " + numPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Quantidade Disponível: " + quantidadeDisponivel);
        System.out.println("Preço: " + preco);
        System.out.println("Completo: " + (completo ? "Sim" : "Não"));
    }
}
