import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Cliente{
    public static void main(String[] args){

        List<Conta> contas = new ArrayList<Conta>();
        Conta conta1 = new Conta(1, "Rafael", 1000.0f, 500.0f);
        contas.add(conta1);

        Conta conta2 = new Conta(2, "Lucas", 8009.0f, 800.0f);
        contas.add(conta2);

        Conta conta3 = new Conta(3, "Matheus", 97804.0f, 2000.0f);
        contas.add(conta3);
       
       Collections.sort(contas);

       for(Conta conta : contas){
            System.out.println("Número da conta: " + conta.getNumero() + " " + "Nome: " + conta.getTitular());
        }

        System.out.println("\n");

        ContaComparator t = new ContaComparator();

        Collections.sort(contas , t);

        for(Conta conta : contas){
            System.out.println("Número da conta: " + conta.getNumero() + " " + "Nome: " + conta.getTitular());
        }
    }
}