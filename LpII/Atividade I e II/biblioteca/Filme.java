public class Filme extends Publicacao {
    private String diretor;
    private String atorPrincipal;
    private String sinopse;
    private int tempoDuracao;

    public Filme(String titulo, String autor, int anoPublicacao, String genero, String editora,int quantidadeDisponivel, String diretor, String atorPrincipal, String sinopse, int tempoDuracao) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Diretor: " + diretor);
        System.out.println("Ator Principal: " + atorPrincipal);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Tempo de Duração: " + tempoDuracao + " minutos");
    }
}