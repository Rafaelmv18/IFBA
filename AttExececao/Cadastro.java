public class Cadastro{
    private Aluno[] aluno;
    private int quantidadeAluno;

    public Cadastro(int tamanho) {
        this.aluno = new Aluno[tamanho];
        this.quantidadeAluno = 0;
    }

    public void adicionarAluno(Aluno novoAluno) throws MatriculaException{
        for(int i = 0; i < quantidadeAluno; i++){
            if(aluno[i].getMatricula() == novoAluno.getMatricula()){
                throw new MatriculaException("Mátricula  " + aluno[i].getMatricula() + " já existe");
            }
        }
        if (quantidadeAluno < aluno.length) {
            aluno[quantidadeAluno] = novoAluno;
            quantidadeAluno++;
            System.out.println("Aluno adicionado com sucesso: " + novoAluno.getMatricula());
        } else {
            System.out.println("Cadastro de alunos está cheio!");
        }
    }
}