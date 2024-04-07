import java.util.Scanner;

public class Questao1{
    public Double TamanhoTela;
    public int Volume;;
    public Double Marca;
    public int Voltagem;
    public Double Canal;
    public boolean ligar;
    public Double consumo;

    public Televisao(Strig TamanhoTela, Double Marca, int Voltagem, int Canal){
        this.TamanhoTela = TamanhoTela;
        this.Volume = 5;
        this.Marca = Marca;
        this.Voltagem = Voltagem;
        this.Canal = Canal;
        this.ligar = false;
    }

    public Ligar(){
        this.ligar = true;
        System.out.println("TV ligada");

        consumo = TamanhoTela * Voltagem;

        System.ou.println("Consumo da TV: " + consumo);
    }

    public Desligar(){
        this.ligar = false;
        System.out.println("TV desligada");
    }

    public AumentarVolume(){
        if (ligar){
            if (Volume <= 10){
                Volume++;
                System.out.println("Volume da TV: " + Volume);
            }else {
                System.out.println("Volume da TV: " + Volume + "máximo");
            }
        }else {
            System.out.println("TV desligada");
        }
    }

    public DiminuirVolume(){
        if (ligado){
            if (Volume >= 0){
                Volume--;
                System.out.println("Volume da TV: " + Volume);
            }else {
                System.out.println("Volume da TV: " + Volume + "mínimo");
            }
        } else{
            System.out.println("TV desligada");
        }
    }

    public Subir_Canal(){
        if (Canal > 1){
            Canal++;
            System.out.println("Canal atual " + Canal);
        }
    }

    public Descer_Canal(){
        if (Canal > 1){
            Canal--;
            System.out.println("Canal atual " + Canal);
        } else{
            System.out.println("Está na menor Canal");
        }
    }

    public EstatosAtuais(){
        System.out.println("Tamanho da tela: " + TamanhoTela);
        System.out.println("Marca: " + Marca);
        System.out.println("Voltagem: " + Voltagem);
        System.out.println("Canal: " + Canal);
        System.out.println("TV está ligado: " + ligado);
        System.out.println("Consumo: " + consumo);
    }
}