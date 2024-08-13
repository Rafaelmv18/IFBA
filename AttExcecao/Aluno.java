public class Aluno{
    private String nome;
    private String endereco;
    private int matricula;

    public Aluno(String nome, String endereco, int matricula){
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }
}