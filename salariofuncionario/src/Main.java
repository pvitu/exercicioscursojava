import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        //--- Coleta de dados ---

        Funcionario func = new Funcionario();

        System.out.println("Dados do funcipnário:");

        System.out.println("nome: ");
        func.Name = sc.nextLine();

        System.out.println("Salário Bruto: ");
        func.SalarioBruto = sc.nextDouble();

        System.out.println("Imposto: ");
        func.Imposto = sc.nextDouble();

        //--- Exibição dos dados iniciais sem aumento ---

        System.out.println();
        System.out.println("Funcionário: " + func);

        //--- Aumento Salarial

        System.out.println();
        System.out.println("Digite a porcentagem de aumento salarial: ");
        double percentual = sc.nextDouble();

        func.AumentarSalario(percentual);

        //--- Exibição dos dados finais
        System.out.println();
        System.out.println("Dados atualizados: " + func);

        sc.close();
    }

}
