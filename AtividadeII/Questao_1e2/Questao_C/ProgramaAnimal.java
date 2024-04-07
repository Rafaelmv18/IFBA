public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leão", "10/01/2020", "Simba", "125682", "África");
        Animal animal2 = new Animal("Elefante", "05/06/2005", "Dumbo", "123234", "África");

        System.out.println("Animal 1");
        animal1.imprimirInformacoes();

        System.out.println("\n");

        System.out.println("Animal 2");
        animal2.imprimirInformacoes();


        animal1.alterar("Leão", "04/02/2020", "Simba", "125682", "África");
        
        System.out.println("\nAlterações do Animal 1:");
        animal1.imprimirInformacoes();
    }
}