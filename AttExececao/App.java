public class App{
    public static void main(String[] args){
        Cadastro cadastro = new Cadastro(4);

        try{
            Aluno aluno1 = new Aluno("Rafael", "Rua A, 12", 123);
            cadastro.adicionarAluno(aluno1);
            Aluno aluno2 = new Aluno("João", "Rua A, 12", 234);
            cadastro.adicionarAluno(aluno2);
            Aluno aluno3 = new Aluno("Marcos", "Rua A, 12", 456);
            cadastro.adicionarAluno(aluno3);
            Aluno aluno4 = new Aluno("Lucas", "Rua A, 12", 123);
            cadastro.adicionarAluno(aluno4);
        } catch (MatriculaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}