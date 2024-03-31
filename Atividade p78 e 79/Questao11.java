/*11) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e caso o
resultado seja maior ou igual a 10, deve-se ser somado a 5 caso contrário o valor do resultado
deverá ser subtraído de 7. Após a obtenção do resultado apresente essa informação para o
usuário.  */
import java.util.Scanner;

public class Questao11{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Double num1, num2, soma;
        
        System.out.println("Digite dois valores:");
        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();

        soma = num1 + num2;

        if (soma >= 10){
            soma += 5;
            System.out.println("A soma dos números é maior ou igual a 10, por isso foi adicionado 5, ficando " + soma);
        }else{
            soma = 7 - soma;
            System.out.println("A soma dos números é menor do que 10, por isso o resultado foi subtraído de 7, ficando " + soma);
        }
        teclado.close();
    }
}
