/**4) Faça um algoritmo utilizando a representação de fluxograma para ler a temperatura do
corpo medida com um termômetro. Caso a temperatura seja maior que 37 graus o paciente
está com febre, caso contrário, sua temperatura está normal. Após ler a temperatura mostre a
mensagem apropriada.  */
import java.util.Scanner;

public class Questao4{
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        Double temperatura;

        System.out.println("Qual a temperatura do corpo?");
        temperatura = teclado.nextDouble();

        if (temperatura > 37){
            System.out.println("O paciente está com febre!");
        } else{
            System.out.println("O paciente não está com febre!");
        }
        teclado.close();
    }
}
