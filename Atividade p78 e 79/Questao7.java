/*7) Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do
usuário e informa se o mesmo está obeso. Lembre que para saber se uma pessoa está obesa
deve-se utilizar a fórmula: imc = peso/altura2. Caso o resultado do imc seja maior que 30 o
usuário está obeso.  */

import java.util.Scanner;

public class Questao7{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Double peso, altura, imc;
        
        System.out.println("Qual o seu peso?");
        peso = teclado.nextDouble();

        System.out.println("Qual a sua altura?");
        altura = teclado.nextDouble();

        imc = peso/(altura * altura);

        if (imc > 30){
            System.out.println("Você está obeso! IMC = " + imc);
        }else{
            System.out.println("Você não está obeso! IMC = " + imc);
        }
        teclado.close();
    }
}
