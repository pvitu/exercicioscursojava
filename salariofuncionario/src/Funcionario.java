public class Funcionario {
    public String Name;
    public double SalarioBruto;
    public double Imposto;

    public double SalarioLiquido() {
        return SalarioBruto - Imposto;
    }

    public void AumentarSalario(double porcentagem) {
        SalarioBruto += SalarioBruto * (porcentagem / 100.0);
    }

    @Override
    public String toString() {
        return Name
                + ", $"
                + String.format("%.2f", SalarioLiquido());
    }

}
