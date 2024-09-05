public class App {
    public static void main(String[] args){

        Cadastro cadastro = new Cadastro();

        Livro livro1 = new Livro(123, "Marcos", "Editora 1", "Titulo 1");
        Livro livro2 = new Livro(321, "Matheus", "Editora 2", "Titulo 2");
        Livro livro3 = new Livro(132, "João", "Editora 3", "Titulo 3");

        cadastro.adicionarLivro(livro1);
        cadastro.adicionarLivro(livro2);
        cadastro.adicionarLivro(livro3);

        cadastro.imprimirDados();
        System.out.println("\n");

        cadastro.removerLivro(livro2);
        cadastro.imprimirDados();
        System.out.println("\n");

        if (cadastro.verificarLivro(livro1)) {
            System.out.println("O livro está na lista.");
        } else {
            System.out.println("O livro não está na lista.");
        }

        cadastro.obterLivro(livro3);
        System.out.println("\n");

        if (cadastro.verificarLista()) {
            System.out.println("A lista não possui livros.");
        } else {
            System.out.println("A lista possui livros.");
        }
    }
}