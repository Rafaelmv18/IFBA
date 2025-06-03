/*2) Construa um algoritmo utilizando a representação de fluxograma que calcule e informe a
quantidade de gasolina que será preciso colocar no carro e quanto irá custar para o seu dono ir
até a sua fazenda. O usuário deverá informar a distância que será percorrida e o preço do litro
da gasolina. Para o cálculo, sabe-se que o carro faz em média 12 km/litro */

import java.util.Scanner;

public class Questao2{
    public static void main(String[] args){

       Scanner teclado = new Scanner(System.in);

       Double distancia, gasolina_total, preco_gasolina, gasolina;

       System.out.println("Qual a distância até a fazenda? (Km)");
       distancia = teclado.nextDouble();

       System.out.println("Qual o preço por litro da gasolina?");
       preco_gasolina = teclado.nextDouble();

       gasolina = distancia/12;
       gasolina_total = gasolina * preco_gasolina;

       System.out.println("O valor a ser gasto é: " + gasolina_total);
       System.out.println("A quatidade de gasolina necessária é: " + gasolina + " litro");
       
       teclado.close();

    }
}
