public class Televisao {
    public Double TamanhoTela;
    public int Volume;
    public Double Marca;
    public int Voltagem;
    public Double Canal;
    public boolean ligar;
    public Double consumo;

    public Televisao(Double TamanhoTela, Double Marca, int Voltagem, Double Canal){
        this.TamanhoTela = TamanhoTela;
        this.Volume = 5;
        this.Marca = Marca;
        this.Voltagem = Voltagem;
        this.Canal = Canal;
        this.ligar = false;
    }

    public void Ligar(){
        this.ligar = true;
        System.out.println("TV ligada");

        consumo = TamanhoTela * Voltagem;

        System.out.println("Consumo da TV: " + consumo);
    }

    public void Desligar(){
        this.ligar = false;
        System.out.println("TV desligada");
    }

    public void AumentarVolume(){
        if (ligar){
            if (Volume < 10){
                Volume++;
                System.out.println("Volume da TV: " + Volume);
            }else {
                System.out.println("Volume da TV: máximo");
            }
        }else {
            System.out.println("TV desligada");
        }
    }

    public void DiminuirVolume(){
        if (ligar){
            if (Volume > 0){
                Volume--;
                System.out.println("Volume da TV: " + Volume);
            }else {
                System.out.println("Volume da TV: mínimo");
            }
        } else{
            System.out.println("TV desligada");
        }
    }

    public void Subir_Canal(){
        if (ligar){
            Canal++;
            System.out.println("Canal atual " + Canal);
        }
    }

    public void Descer_Canal(){
        if (ligar){
            if (Canal > 0){
                Canal--;
                System.out.println("Canal atual " + Canal);
            } else{
                System.out.println("Está no menor Canal");
            }
        } else{
            System.out.println("TV desligada");
        }
    }

    public void EstadosAtuais(){
        System.out.println("Tamanho da tela: " + TamanhoTela);
        System.out.println("Marca: " + Marca);
        System.out.println("Voltagem: " + Voltagem);
        System.out.println("Canal: " + Canal);
        System.out.println("TV está ligada: " + ligar);
        System.out.println("Consumo: " + consumo);
    }
}
