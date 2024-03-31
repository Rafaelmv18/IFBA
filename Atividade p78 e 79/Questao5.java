/*5) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário 2
números diferentes e mostre o maior deles.*/
import java.util.Scanner;

public class Questao5{
    public static void main(String[] args){
     
        Scanner teclado = new Scanner(System.in);

        Double num1, num2;

        System.out.println("Digite um número:");
        num1 = teclado.nextDouble();

        System.out.println("Digite outro número:");
        num2 = teclado.nextDouble();

        if(num1 > num2){
            System.out.println("O número " + num1 + " é maior que o " + num2);
        } else if (num1 < num2){
            System.out.println("O número " + num2 + " é maior que o " + num1);
        }else{
            System.out.println ("Os números são iguais");
        }
        teclado.close();
    }
}
