public class App{
    public static void main(String[] args){
        Sistema sistema = new Sistema();

        try{
            Professor professor1 = new Professor("Rafael", 20, "Masculino", 12345678912L, 04123456L, "Rua A, 123");
            sistema.incluir(professor1);

            Professor professor2 = new Professor("Mario", 23, "Masculino", 12392678912L, 04523456L, "Rua C, 213");
            sistema.incluir(professor2);
            
            Dependente dependente1 = new Dependente("Lucas", 19, "Masculino");
            professor1.adicionarDependente(dependente1);

            Dependente dependente2 = new Dependente("João", 41, "Masculino");
            professor2.adicionarDependente(dependente2);

            sistema.pesquisar(professor1.getCpf());
            System.out.println("Professor encontrado. CPF: " + professor1.getCpf());

            sistema.pesquisar(professor2.getCpf());
            System.out.println("Professor encontrado. CPF: " + professor2.getCpf());

            sistema.excluir(professor1.getCpf());
            System.out.println("Professor excluido. CPF: " + professor1.getCpf());
            
        }catch (Excecao e){
            System.out.println(e.getMessage());
        }
    }
}