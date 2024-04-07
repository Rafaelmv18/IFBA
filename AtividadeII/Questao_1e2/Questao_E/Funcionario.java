public class Funcionario{
    public String Nome;
    public String Nascimento;
    public String RG;
    public String CPF;
    public String Endereco;
    public String Naturalidade;
    public Double Salario;
    public String Profissao;
    public String Grau_Instrucao;
    public String Matricula;

    public Funcionario(String Nome, String Nascimento, String RG, String CPF, String Endereco, String Naturalidade, Double Salario, String Profissao, String Grau_Instrucao, String Matricula) {
        this.Nome = Nome;
        this.Nascimento = Nascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Naturalidade = Naturalidade;
        this.Salario = Salario;
        this.Profissao = Profissao;
        this.Grau_Instrucao = Grau_Instrucao;
        this.Matricula = Matricula;
    }

    public cadastrar(String Nome, String Nascimento, String RG, String CPF, String Endereco, String Naturalidade, Double Salario, String Profissao, String Grau_Instrucao, String Matricula){
        this.Nome = Nome;
        this.Nascimento = Nascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Naturalidade = Naturalidade;
        this.Salario = Salario;
        this.Profissao = Profissao;
        this.Grau_Instrucao = Grau_Instrucao;
        this.Matricula = Matricula;
    }

    public alterar(String Nome, String Nascimento, String RG, String CPF, String Endereco, String Naturalidade, Double Salario, String Profissao, String Grau_Instrucao, String Matricula){
        this.cadastrar(Nome, Nascimento, RG, CPF, Endereco, Naturalidade, Salario, Profissao, Grau_Instrucao, Matricula);
    }

    public void imprimirDados() {
        System.out.println("Nome: " + Nome);
        System.out.println("Data de Nascimento: " + Nascimento);
        System.out.println("RG: " + RG);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereço: " + Endereco);
        System.out.println("Naturalidade: " + Naturalidade);
        System.out.println("Salário: " + Salario);
        System.out.println("Profissão: " + Profissao);
        System.out.println("Grau de Instrução: " + Grau_Instrucao);
        System.out.println("Matrícula: " + Matricula);
    }
}