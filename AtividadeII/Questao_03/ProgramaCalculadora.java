import java.util.Scanner;


class Calculo{
    public Double soma(Double num1, Double num2){
        return num1 + num2;
    }
    public Double subtracao(Double num1, Double num2){
        return num1 - num2;
    }
    public Double multiplicacao(Double num1, Double num2){
        return num1 * num2;
    }
    public double divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão por 0\nTente outro vez!!");
            return 0;
        }
        return num1 / num2;
    }
}

public class ProgramaCalculadora{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Calculo calculo = new Calculo();

        Double num1, num2;
        int operacao;

        System.out.println("Digite dois número:");
        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();

        System.out.println("Qual operação deseja realizar?");
        System.out.println("1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão");
        operacao = teclado.nextInt();

        Double resultado;

        switch (operacao) {
            case 1:
                resultado = calculo.soma(num1, num2);
                break;
            case 2:
                resultado = calculo.subtracao(num1, num2);
                break;
            case 3:
                resultado = calculo.multiplicacao(num1, num2);
                break;
            case 4:
                resultado = calculo.divisao(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);

        teclado.close();
    }
}  