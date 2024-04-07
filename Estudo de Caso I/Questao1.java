import java.util.Scanner;

public class Questao1{
    public Strig Modelo;
    public Double Velocidade;
    public Double Aceleracao;
    public int Marcha;
    public boolean ligar;

    public Carro(Strig Modelo, Double Velocidade, Double Aceleracao, int Marcha){
        this.Modelo = Modelo;
        this.Velocidade = Velocidade;
        this.Aceleracao = Aceleracao;
        this.Marcha = Marcha;
        this.ligar = false;
    }

    public Ligar(){
        this.ligar = true;
        System.out.println("Carro ligado");
    }

    public Desligar(){
        this.ligar = false;
        System.out.println("Carro desligado");
    }

    public Acelerar(){
        if (ligar){
            Velocidade += Aceleracao;
            System.out.println("Velociade do carro: " + Velociade + "Km/h");
        }else {
            System.out.println("Carro desligado");
        }
    }

    public Desacelerar(){
        if (ligado){
            Velociade -= Aceleracao;
            System.ou.println("Velociade do carro: " + Velociade + "Km/h")
        } else{
            System.out.println("Carro desligado");
        }
    }

    public Virar_Esquerda(){
        System.out.println("Virando para esquerda");
    }

    public Virar_Direita(){
        System.out.println("Virando para direita");
    }

    public Subir_Marcha(){
        if (Marcha < 6){
            Marcha++;
            System.out.println("Marcha atual " + Marcha);
        } else{
            System.out.println("Está na maior marcha");
        }
    }

    public Descer_Marcha(){
        if (Marcha > 1){
            Marcha--;
            System.out.println("Marcha atual " + Marcha);
        } else{
            System.out.println("Está na menor marcha");
        }
    }

    public EstatosAtuais(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + "Km/h");
        System.out.println("Aceleração: " + aceleracao + "Km/h");
        System.out.println("Marcha: " + marcha);
        System.out.println("Carro está ligado: " + ligar);
    }
}