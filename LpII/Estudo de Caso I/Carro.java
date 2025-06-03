public class Carro{
    public String Modelo;
    public Double Velocidade;
    public Double Aceleracao;
    public int Marcha;
    public boolean ligar;

    public Carro(String Modelo, Double Velocidade, Double Aceleracao, int Marcha){
        this.Modelo = Modelo;
        this.Velocidade = Velocidade;
        this.Aceleracao = Aceleracao;
        this.Marcha = Marcha;
        this.ligar = false;
    }

    public void Ligar(){
        this.ligar = true;
        System.out.println("Carro ligado");
    }

    public void Desligar(){
        this.ligar = false;
        System.out.println("Carro desligado");
    }

    public void Acelerar(){
        if (ligar){
            Velocidade += Aceleracao;
            System.out.println("Velocidade do carro: " + Velocidade + " Km/h");
        }else {
            System.out.println("Carro desligado");
        }
    }

    public void Desacelerar(){
        if (ligar){
            Velocidade -= Aceleracao;
            System.out.println("Velocidade do carro: " + Velocidade + " Km/h");
        } else{
            System.out.println("Carro desligado");
        }
    }

    public void Virar_Esquerda(){
        System.out.println("Virando para esquerda");
    }

    public void Virar_Direita(){
        System.out.println("Virando para direita");
    }

    public void Subir_Marcha(){
        if (Marcha < 6){
            Marcha++;
            System.out.println("Marcha atual " + Marcha);
        } else{
            System.out.println("Está na maior marcha");
        }
    }

    public void Descer_Marcha(){
        if (Marcha > 1){
            Marcha--;
            System.out.println("Marcha atual " + Marcha);
        } else{
            System.out.println("Está na menor marcha");
        }
    }

    public void EstadosAtuais(){
        System.out.println("Modelo: " + Modelo);
        System.out.println("Velocidade: " + Velocidade + " Km/h");
        System.out.println("Aceleração: " + Aceleracao + " m/s^2");
        System.out.println("Marcha: " + Marcha);
        System.out.println("Carro está ligado: " + ligar);
    }
}