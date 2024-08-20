public class Sistema {
    private Professor[] professor;
    private int numProfessores;

       public Sistema() {
        professor = new Professor[20];
        numProfessores = 0;
    }

    public void incluir(Professor professor) throws Excecao{
        if(professor >= 20){
            Excecao = new Excecao("Quantidade máxima atingida");
            throw e;
        }
        for (int i = 0; i < numProfessores; i++) {
            if (professor[i].getCpf().equals(professor.getCpf())) {
                Excecao = new Excecao("Professor com o CPF " + professor.getCpf() + " já existe.");
                throw e;
            }
        }
        professores[numProfessores++] = professor;
    }

    public void excluir(long cpf) throws Excecao{
        boolean encontrado = false;
        for (int i = 0; i < numProfessores; i++) {
            if (professor[i].getCpf().equals(cpf)) {
                encontrado = true;
                for (int j = i; j < numProfessores; j++) {
                    professor[j] = professor[j + 1];
                }
                numProfessores--;
                break;
            }
        }
        if(!encontrado){
            Excecao new Excecao("Professor com o CPF " + professor.getCpf() + " não encontrado.");
                throw e;
        }
    }

    public void pesquisar(long cpf){
        for(int i = 0; i < numProfessores; i ++){
            if(professor[i].getCpf().equals(cpf)){
                return professor[i];
            }
        }
        Excecao new Excecao("Professor com o CPF " + professor.getCpf() + " não foi encontrado.");
            throw e;
    }
}