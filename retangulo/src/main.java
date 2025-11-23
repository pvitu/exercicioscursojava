import java.util.Locale;
import java.util.Scanner;

public class main{

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);;

        Retangulo ret = new Retangulo();

        System.out.println("Entre com a altura e largura do retângulo:");

        System.out.println("Largura (Width): ");
        ret.width = sc.nextDouble();

        System.out.println("Altura (Heigth): ");
        ret.height = sc.nextDouble();

        System.out.printf("\n--- Resultados ---");

        System.out.printf("ÁREA = %.2f\n", ret.area());
        System.out.printf("PERIMETRO = %.2f\n", ret.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", ret.diagonal());

        sc.close();
    }
}