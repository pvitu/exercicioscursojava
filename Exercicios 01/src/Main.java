/*
Exercício feito por Paulo Araújo em 28/01/2025 referente ao Curso
Java COMPLETO Programação Orientada a Objetos + Projetos do professor Nelio Alves

-------

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1, valor2, soma;

        System.out.println("Digite o primeiro valor");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = sc.nextInt();

        soma = valor1 + valor2;

        System.out.println("A soma dos dois valores é =" + soma);

        sc.close();

    }
}