/**1) Construir um algoritmo utilizando a representação de fluxograma para que solicite ao
usuário a quantidade de horas trabalhadas no mês por um operário. Em seguida, calcular e
informar o seu salário sabendo que ele ganha R$ 20,00 por hora.  */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        int horas, salario;

        System.out.println("Qual a quantidade de horas trabalhadas?");
        horas = teclado.nextInt();
        
        salario = horas * 20;

        System.out.println("O salário equivalente a " + horas + " horas de trabalho é R$ " + salario);

        teclado.close();
    }
}
