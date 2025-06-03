public class Calculo {
    private double totalSalario;

    public void calculaSalario(double salarioBase, int horasTrabalhadas) {
        this.totalSalario = salarioBase * horasTrabalhadas;
    }

    public double getTotalSalario() {
        return totalSalario;
    }
}
