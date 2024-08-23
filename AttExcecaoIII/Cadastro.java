public class Cadastro{

    private String nome;
    private int idade;
    private String sexo;
    private long cpf;
    private long rg;
    private String endereco;
    private Dependente[] dependente;
    private int quantidade;

    public Cadastro(String nome, int idade, String sexo, long cpf, long rg, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.dependente = new Dependente[5];
        this.quantidade = 0;
    } 

    public String getCpf(){
        return cpf;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public void adicionarDependente(Dependente dependente) throws Execao{
        if (dependente > 5){
            Excecao = new Excecao("Quantidade máxima atingida");
            throw e;
        }
        dependente[quantidade++] = dependente;
    }
}