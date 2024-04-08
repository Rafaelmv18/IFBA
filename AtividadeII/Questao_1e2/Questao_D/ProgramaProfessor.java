public class ProgramaProfessor {
    public static void main(String[] args) {

        Professor professor1 = new Professor("João", "Doutor", "Engenharia", 72, 5180.00, "Matemática, Física, Química");
        Professor professor2 = new Professor("Maria", "Mestre", "Letras", 60, 4520.00, "História, Geografia");

        System.out.println("Professor 1");
        professor1.dados();

        System.out.println("\n");

        System.out.println("Professor 2");
        professor2.dados();

        professor1.alterarDescricao("Estatística, Física, Química");

        System.out.println("\nAlteração do Professor 1");
        professor1.dados();
    }
}
