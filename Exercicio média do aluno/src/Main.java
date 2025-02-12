/*
RESOLVIDO EM 12/02/2025 ~ PAULO ARAÚJO

EXERCÍCIO DO CURSO DE JAVA DO PROFESSOR NÉLIO ALVES

Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de uma
disciplina anual. Em seguida, mostrar a nota final que o aluno obteve no ano juntamente com um
texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO".
Todos os valores devem ter uma casa decimal.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota do primeiro semestre: ");
        double notaSemestre1 = sc.nextDouble();

        System.out.println("Nota do segundo semestre: ");
        double notaSemestre2 = sc.nextDouble();

        double notaFinal = notaSemestre1 + notaSemestre2;

        if (notaFinal >= 60) {
            System.out.println("APROVADO, PARABÉNS!");
        } else {
            System.out.println("REPROVADO, ESTUDE MAIS NA PRÓXIMA");
        }
        sc.close();
    }
}
