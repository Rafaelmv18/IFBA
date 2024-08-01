public class Livro extends Publicacao {
    private int edicao;
    private String isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora,int quantidadeDisponivel, int edicao, String isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicacao: " + getAnoPublicacao());
        System.out.println("Genero: " + getGenero());
        System.out.println("Editora: " + getEditora());
        System.out.println("Quantidade Disponivel: " + getQuantidadeDisponivel());
        System.out.println("Edição: " + edicao);
        System.out.println("ISBN: " + isbn);
    }
}