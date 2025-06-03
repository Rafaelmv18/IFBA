public class Professor {
    public String nome;
    public String titulacao;
    public String formacao;
    public int cargaHoraria;
    public double salario;
    public String descricaoDisciplinas;

    public Professor(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void cadastrar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas){
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void alterar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas){
        this.cadastrar(nome, titulacao, formacao, cargaHoraria, salario, descricaoDisciplinas);
    }

    public void alterarDescricao(String descricaoDisciplinas){
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void dados(){
        System.out.println("Nome: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga Horária: " + cargaHoraria + "horas");
        System.out.println("Salário: " + salario);
        System.out.println("Descrição das disciplinas que o professor pode ensinar: " + descricaoDisciplinas);
    }
}