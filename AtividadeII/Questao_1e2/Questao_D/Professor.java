public class Professor{
    public Strig nome;
    public String titulacao;
    public String formacao;
    public int CargaHoraria;
    public Double Salario;
    public String DescricaoDisciplinas;

    public Professor(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String[] disciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.fromacao = fromacao;
        this.CargaHoraria = CargaHoraria;
        this.Salario = Salario;
        this.DescricaoDisciplinas = DescricaoDisciplinas;
    }

    public cadastrar(String nome, String titulacao, String formacao, int CargaHoraria, Double Salario, String DescricaoDisciplinas){
        this.nome = nome;
        this.titulacao = titulacao;
        this.fromacao = fromacao;
        this.CargaHoraria = CargaHoraria;
        this.Salario = Salario;
        this.DescricaoDisciplinas = DescricaoDisciplinas;
    }

    public alterar(String nome, String titulacao, String formacao, int CargaHoraria, Double Salario)(){
        this.cadastrar(nome, titulacao, formacao, CargaHoraria, Salario);
    }

    public alterarDescricao(String DescricaoDisciplinas){
        this.cadastrar(DescricaoDisciplinas);
    }

    public dados(String nome, String titulacao, String formacao, int CargaHoraria, Double Salario, String DescricaoDisciplinas){
        System.out.println("Nome: " + nome);
        System.out.println("Tilulação: " + titulacao);
        System.out.println("Formação: " + fromacao);
        System.out.println("Carga Horária: " + CargaHoraria);
        System.out.println("Salário: " + Salario);
        System.out.println("Descrição das disciplinas que o professor pode ensinar: " + DescricaoDisciplinas);
    }
}