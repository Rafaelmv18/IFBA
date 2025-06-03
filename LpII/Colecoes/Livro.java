import java.util.Objects;

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

    @Override
    public boolean equals(Object o){
        if (this == o){
         return true;
        }  
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Livro livro = (Livro) o;
        return titulo.equals(livro.titulo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(titulo);
    }

    public String toString() {
        return "Título: " + titulo;
    }
}