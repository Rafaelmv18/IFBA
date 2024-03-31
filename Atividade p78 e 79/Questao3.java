/**3)Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário sua
idade e informe se o mesmo já pode tirar carteira de motorista. O usuário somente poderá
tirar a carteira de motorista se a idade for maior que 18 anos */

import java.util.Scanner;

public class Questao3{
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        int idade;

        System.out.println("Qual a sua idade?");
        idade = teclado.nextInt();

        if (idade >= 18){
            System.out.println("Você pode tirar sua carteira!!!");
        }else {
            System.out.println("Você é menor de idade, não pode tirar a carteira!!!");
        }
        teclado.close();
    }
}
