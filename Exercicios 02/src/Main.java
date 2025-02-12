/*
Atividade:
Fazer um programa para ler um número inteiro,
e depois dizer se este número é negativo ou não.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber se é positivo ou negativo: ");

        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("Negativo!");
        } else {
            System.out.println("Positivo");
        }
        sc.close();

    }
}