/*10) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e
apresentar o resultado caso seja maior que 10.  */
import java.util.Scanner;

public class Questao10{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Double num1, num2, soma;

        System.out.println("Digite dois valores:");
        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();

        soma = num1 + num2;

        if (soma > 10){
            System.out.println("A soma é " + soma);
        }
        teclado.close();
    }
}
