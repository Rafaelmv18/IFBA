public class App{
    public static void main(String[] args){

        ContaCorrente co1 = new ContaCorrente();
        ContaCorrente co2 = new ContaCorrente();
        ContaCorrente co3 = new ContaCorrente();

        Banco banco = new Banco("Rafael", co1, "João", co2, "Mario", co3);

        banco.creditar("Rafael", 100);
        banco.creditar("Mario", 50);
        banco.debitar("João", 40);
        banco.transferir("Mario", "João", 50);

        System.out.println("Saldo de Rafael: " + banco.getSaldo("Rafael"));
        System.out.println("Saldo de João: " + banco.getSaldo("João"));
        System.out.println("Saldo de Mario: " + banco.getSaldo("Mario"));
    }
}