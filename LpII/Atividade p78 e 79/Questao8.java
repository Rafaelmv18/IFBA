/*8) Faça um algoritmo utilizando a representação de fluxograma que calcule a área de uma
circunferência e apresente a medida da área calculada. Sabe-se que para realizar o cálculo da
área de uma circunferência é necessário utilizar a seguinte a seguinte fórmula: A = Pi*r² . O
valor do Raio será informado pelo usuário.  */

import java.util.Scanner;

public class Questao8{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Double raio, Area, pi = 3.14;

        System.out.println("Qual o valor do raio?");
        raio = teclado.nextDouble();

        Area = pi * (raio * raio);

        System.out.println("A área do circunferência é " + Area);
        
        teclado.close();
    }
}
