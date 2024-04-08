public class Animal {
    public String especie;
    public String dataNascimento; 
    public String nome;
    public int numeroRegistro;
    public String localNascimento;

    public Animal(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void cadastrar(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void alterar(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.cadastrar(especie, dataNascimento, nome, numeroRegistro, localNascimento);
    }

    public void informacoes() {
        System.out.println("Espécie: " + especie);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Nome: " + nome);
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Local de Nascimento: " + localNascimento);
    }
}