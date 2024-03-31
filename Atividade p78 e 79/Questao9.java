/*9) Faça um algoritmo utilizando a representação de fluxograma que calcule o salário líquido
de um professor. Para elaborar o programa, é necessário solicitar do usuário alguns dados,
tais como valor da hora aula, número de horas trabalhadas no mês, percentual de desconto do
INSS. Em primeiro, deve-se estabelecer o seu salário bruto para fazer o desconto e ter o valor
do salário líquido.  */

import java.util.Scanner;

public class Questao9{
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        Double hora_aula, horas_trabalhadas, desconto_INSS, salario_liquido, salario_bruto;

        System.out.println("Cálculo do Salário");
        System.out.println("Qual o valor da hora aula?");
        hora_aula = teclado.nextDouble();

        System.out.println("Horas trabalhadas no mês?");
        horas_trabalhadas = teclado.nextDouble();

        System.out.println("Qual o percentual de deconto do INSS?");
        desconto_INSS = teclado.nextDouble();

        salario_bruto = hora_aula * horas_trabalhadas;
        
        desconto_INSS = salario_bruto * desconto_INSS / 100;

        salario_liquido = salario_bruto - desconto_INSS;

        System.out.println("O salário bruto é de " + salario_bruto + " menos o desconto do INSS de " + desconto_INSS + " da o salário liquido de R$" + salario_liquido);

        teclado.close();
    }
}