package Exercícios.Mod_10;

import java.util.Scanner;

public class Notas {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a 1 nota do aluno : ");
            double notaAluno1 = scanner.nextDouble();

            System.out.print("Digite a 2 nota do aluno : ");
            double notaAluno2 = scanner.nextDouble();

            System.out.print("Digite a 3 nota do aluno : ");
            double notaAluno3 = scanner.nextDouble();

            System.out.print("Digite a 4 nota do aluno : ");
            double notaAluno4 = scanner.nextDouble();

            scanner.close();

            double media = (notaAluno1 + notaAluno2 + notaAluno3 + notaAluno4) / 4;
            System.out.println("A média das notas é: " + media);

            if (media == 10) {
                System.out.println("Parabéns, passou com nota máxima");
            } else if (media >= 7) {
                System.out.println("Parabéns, está aprovado");
            } else if (media >= 5) {
                System.out.println("está de recuperação");
            } else if (media < 5) {
                System.out.println("Está reprovadoo");
            }
        }
}
