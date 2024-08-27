import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Livro> livros;

    public Cadastro(){
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void removerLivro(Livro livro){
        livros.remove(livro);
    }

    public void imprimirDados(Livro livro){
        for(Livro livro : livros){
            System.out.println(livro);
        }
    }

    public boolean verificarLivro(Livro livro){
        return livros.contains(livro);
    }

    public Livro obterLivro(Livro livro){
        if(livros.contains(livro)){
            return livro;
        }else{
            return null;
        }
    }

    public boolean verificarLista(Livro livro){
        return livros.isEmpty();
    }
}