/*6) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário as
notas de 2 provas e um trabalho e que seja capaz de calcular a média aritmética. Caso a média
final seja maior ou igual a 7 mostre a mensagem “aprovado”, caso contrario, imprimir a
mensagem reprovado”. */
import java.util.Scanner;

public class Questao6{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Double nota_prova1, nota_prova2, nota_trabalho, media;

        System.out.println("Qual as notas das provas?");
        nota_prova1 = teclado.nextDouble();
        nota_prova2 = teclado.nextDouble();

        System.out.println("Qual a nota do trabalho?");
        nota_trabalho = teclado.nextDouble();

        media = (nota_prova1 + nota_prova2 + nota_trabalho) / 3;

        if (media >= 7){
            System.out.println("Aprovado!!");
        }else{
            System.out.println("Reprovado!!");
        }
        teclado.close();
    }
}
