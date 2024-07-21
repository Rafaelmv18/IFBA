import java.time.LocalDate;

public class Funcionario {
    public String nome;
    public String cpf;
    public String numRG;
    private int matricula;
    private double salario;
    private LocalDate dataContratacao;
    private double salarioBase;
    private int horasTrabalhadas;

    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.matricula = ++geraMatricula;
        this.dataContratacao = LocalDate.now();
        this.calculaSalario();
    }

    private void calculaSalario() {
        Calculo calculo = new Calculo();
        calculo.calculaSalario(this.salarioBase, this.horasTrabalhadas);
        this.salario = calculo.getTotalSalario();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumRG() {
        return numRG;
    }

    public void setNumRG(String rg) {
        this.numRG = numRG;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + numRG);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Contratação: " + dataContratacao);
    }
}


/*
 * a) Cria um objeto com os seguintes atributos ("Zé,25,44").
 * 
 * b) As linhas são permitidas pois o numRG e cpf são publicos.
 * 
 * c) Não é permitida, pois o salário é calculado multiplicando salarioBase * horasTrabalhadas e a matricula é definida como 0 e deve ter seu dado gerado a partir do atributo estático geraMatricula incrementando 1 e ambos são privados.
 */
