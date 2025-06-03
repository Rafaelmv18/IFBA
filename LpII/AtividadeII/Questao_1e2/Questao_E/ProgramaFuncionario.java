public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Rafael Venas", "01/12/1980", "9865490751", "98075628173", "Rua A, 123", "Feira de Santana", 4500.00, "Analista de TI", "Superior Completo", "AJ75ADJ13");

        Funcionario funcionario2 = new Funcionario("Lucas Almeida", "15/05/1985", "0952176598", "54321678901", "Rua B, 456", "Rio de Janeiro", 5190.00, "Gerente de Vendas", "Pós-Graduação", "GAL5F582E");

        System.out.println("Funcionário 1:");
        funcionario1.imprimirDados();
 
        System.out.println("\n");

        System.out.println("Funcionário 2:");
        funcionario2.imprimirDados();

        funcionario1.alterar("Rafael Venas", "01/12/1980", "9865490751", "98075628173", "Rua A, 123", "Feira de Santana", 4500.00, "Analista de TI", "Superior Completo", "AJ75ADJ97");

        System.out.println("\nAlteração do Funcionário 1");
        funcionario1.imprimirDados();
    }
}
