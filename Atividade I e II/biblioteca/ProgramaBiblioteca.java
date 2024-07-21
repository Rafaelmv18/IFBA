public class ProgramaBiblioteca {
    public static void main(String[] args) {
        
        Livro livro = new Livro("Vinte Mil Léguas Submarinas", "Júlio Verne", 1870, "Romance, Ficção científica", "Grupo Companhia das Letras", 51, 3, "123456789");

        Filme filme = new Filme("2012", "Roland Emmerich e Harald Kloser", 2009, "Ficção científica Romance científico, Ação", "Columbia Pictures", 10, " Roland Emmerich", "John Cusack", "Sobrevivendo ao fim do mundo", 158);

        Publicacao[] publicacoes = new Publicacao[2];
        publicacoes[0] = livro;
        publicacoes[1] = filme;

        for (Publicacao publicacao : publicacoes) {
            publicacao.imprimirDados();
            System.out.println();
        }
    }
}


/*
 * V- Foi possível adicionar no array, pois as classes Livro e Filme herdam a classe Publicacao.
 * 
 * VI - É possível imprir os dados, pois o metodo imprimeDados possui os dados gerais e na classe Filme e Livro chama o metodo imprimeDados mais os dados específicos, por isso os dados ficam corretos.
 */