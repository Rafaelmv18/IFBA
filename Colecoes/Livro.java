public class Livro{
    private int isbn;
    private String autor;
    private String editora;
    private String titulo;

    public Livro(int isbn, String autor, String editora, String titulo){
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    public int getIsbn(){
        return isbn;
    }

    public String getAutor(){
        return autor;
    }

    public String getEditora(){
        return editora;
    }

    public String getTitulo(){
        return titulo;
    }
}