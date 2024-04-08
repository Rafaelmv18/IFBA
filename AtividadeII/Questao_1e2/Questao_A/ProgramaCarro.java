public class ProgramaCarro{
    public static void main(String[] args){
        Carro carro1 = new Carro(86297, "Fiat", "Branco", "Argo", 2022, 4, "Gasolina", 30, 90000.0, true);
        Carro carro2 = new Carro(62750, "Volkswagen", "Prata", "Nivus", 2024, 4, "Gasolina", 41, 149390.0, true);

        System.out.println("Carro 1");
        carro1.listar();

        System.out.println("\n");

        System.out.println("Carro 2");
        carro2.listar();

        carro1.alterar(95631, "Fiat", "Preto", "Argo", 2022, 4, "Gasolina", 30, 90000.0, true);
        
        System.out.println("\nAlterações do Carro 1");
        carro2.listar();
    }
}