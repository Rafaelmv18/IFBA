public class ProgramaProfessor {
    public static void main(String[] args) {

        String [] = disciplinaProfessor1 = {"Matemática", "Física", "Química"};
        Professor professor1 = new Professor("João", "Doutor", "Engenharia", 72, 5180.00, disciplinasProf1);

        String[] disciplinasProfessor2 = {"História", "Geografia"};
        Professor professor2 = new Professor("Maria", "Mestre", "Letras", 60, 4520.00, disciplinasProf2);

        System.out.println("Professor 1");
        professor1.imprimirDados();

        System.out.println("\n");

        System.out.println("Professor 2");
        professor2.imprimirDados();


        professor1.alterarDescricao(3, "Estatística");

        System.out.println("\nAlteração do Professor 1");
        professor1.imprimirDados();
    }
}
