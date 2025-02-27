/*
Utilizando fundamentos de POO

Programa que lê dados de um produto em estoque (nome, valor e quantidade no estoque e mostra os dados do produto (nome, preço, quantodade no estoque, valor total no estoque.)

- Realiza uma entrada no estoque e mostra novamente os dados do produto

- Reliza saída no estoque e mostra novamente os dados do produto.
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.produtos;

public class Programa {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        produtos produto = new produtos();
        System.out.println("Ensira a credencial do produto: ");
        System.out.println("Name: ");
        produto.name = sc.nextLine();

        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.print("Quantidade no estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println(produto.name + "," + produto.preco + "," + produto.quantidade);


        sc.close();

    }
}
