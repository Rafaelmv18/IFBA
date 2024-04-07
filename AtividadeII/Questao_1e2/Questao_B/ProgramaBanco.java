import Banco;

public class ProgramaBanco {
    public static void main(String[] args) {
   
        Banco conta1 = new Banco("Rafael Venas", "9865490751", "98075628173", 8900, 97420, "XPTO001");
        Banco conta2 = new Banco("Lucas Almeida", "0952176598", "54321678901", 3000, 58902, "XPTO002");

        System.out.println("Conta 1");
        conta1.imprimirSaldo();

        System.out.println("\n");

        System.out.println("Conta 2");
        conta2.imprimirSaldo();

        conta1.alterar("Rafael Venas", "9865490751", "98075628173", 90000, 97420, "XPTO001");

        System.ou.println("\nAlterações da Conta 1");
        conta1.imprimirSaldo();
    }
}