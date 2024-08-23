public class Sistema {
    private Professor[] professores;
    private int numProfessores;

    public Sistema() {
        professores = new Professor[5];
        numProfessores = 0;
    }

    public void incluir(Professor professor) throws Excecao {
        if (numProfessores >= 5) {
            Excecao e = new Excecao("Quantidade máxima de professores atingida");
            throw e;
        }
        for (int i = 0; i < numProfessores; i++) {
            if (professores[i].getCpf() == professor.getCpf()) {
                Excecao e = new Excecao("Professor com o CPF " + professor.getCpf() + " ja existe.");
                throw e;
            }
        }
        professores[numProfessores++] = professor;
    }

    public void excluir(long cpf) throws Excecao {
        boolean encontrado = false;
        for (int i = 0; i < numProfessores; i++) {
            if (professores[i].getCpf() == cpf) {
                encontrado = true;
                for (int j = i; j < numProfessores - 1; j++) {
                    professores[j] = professores[j + 1];
                }
                numProfessores--;
                professores[numProfessores] = null;
                break;
            }
        }
        if (!encontrado) {
            Excecao e = new Excecao("Professor com o CPF " + cpf + " não encontrado.");
            throw e;
        }
    }

    public Professor pesquisar(long cpf) throws Excecao {
        for (int i = 0; i < numProfessores; i++) {
            if (professores[i].getCpf() == cpf) {
                return professores[i];
            }
        }
        Excecao e = new Excecao("Professor com o CPF " + cpf + " não encontrado.");
        throw e;
    }
}