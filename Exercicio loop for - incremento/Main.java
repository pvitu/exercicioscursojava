/*
Fazer um programa que lê um valor inteiro N e depois N números inteiros.

Ao final, mostrar a soma dos N números lidos.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números você deseja somar, depois digite os números: ");
        int N = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println("A soma dos números é: " + soma);
        sc.close();
    }
}
