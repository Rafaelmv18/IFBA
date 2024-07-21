public class Publicacao{
        
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;
    protected String genero;
    protected String editora;
    protected int quantidadeDisponivel;

    public Publicacao(String titulo, String autor, int anoPublicacao, 
        String genero, String editora,int quantidadeDisponivel){
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
            this.genero = genero;
            this.editora = editora;
            this.quantidadeDisponivel = quantidadeDisponivel;
        }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public String getGenero(){
        return genero;
    }

    public String getEditora(){
        return editora;
    }

    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }


    public void imprimirDados(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicacao: " + getAnoPublicacao());
        System.out.println("Genero: " + getGenero());
        System.out.println("Editora: " + getEditora());
        System.out.println("Quantidade Disponivel: " + getQuantidadeDisponivel());
    }
}