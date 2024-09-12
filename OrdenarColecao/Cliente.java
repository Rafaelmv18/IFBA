import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Cliente{
    public static void main(String[] args){

        List<Conta> contas = new ArrayList<Conta>();
        Conta conta1 = new Conta();

        conta1.setNumero(1);
        conta1.setTitular("Rafael");
        conta1.setSaldo(1000.0f);
        conta1.setLimiteCredito(500.0f);
        contas.add(conta1);

        Conta conta2 = new Conta();
        conta2.setNumero(2);
        conta2.setTitular("Lucas");
        conta2.setSaldo(8009.0f);
        conta2.setLimiteCredito(800.0f);
        contas.add(conta2);

        Conta conta3 = new Conta();
        conta3.setNumero(3);
        conta3.setTitular("Mathes");
        conta3.setSaldo(97804.0f);
        conta3.setLimiteCredito(2000.0f);
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