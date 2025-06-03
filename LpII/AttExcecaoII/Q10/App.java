public class App{
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente(1000.0f, 500.0f);
        ContaCorrente conta2 = new ContaCorrente(1000.0f, 500.0f);

        try {
            
            conta1.depositar(500.0f);  
            conta1.sacar(1000.0f);
            System.out.println("Saque realizado. Saldo: " + conta1.getSaldo()); 

            conta2.sacar(500.0f); 
            conta2.depositar(500.0f);   
            System.out.println("Saque realizado. Saldo: " + conta2.getSaldo()); 

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}