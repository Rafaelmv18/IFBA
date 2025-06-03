public class App{
    public static void main(String[] args){

        Brinquedo navio = new Navio(1,1);
        Brinquedo caminhao = new Caminhao(1,1);
        Brinquedo helicoptero = new Helicoptero(1,1);

        ControleRemoto controleRemoto = new ControleRemoto(navio);
        controleRemoto.mover();

        controleRemoto = new ControleRemoto(caminhao);
        controleRemoto.mover();

        controleRemoto = new ControleRemoto(helicoptero);
        controleRemoto.mover();
    }
}