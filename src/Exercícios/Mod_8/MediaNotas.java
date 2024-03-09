package Exercícios.Mod_8;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno 1: ");
        double notaAluno1 = scanner.nextDouble();

        System.out.print("Digite a nota do aluno 2: ");
        double notaAluno2 = scanner.nextDouble();

        System.out.print("Digite a nota do aluno 3: ");
        double notaAluno3 = scanner.nextDouble();

        System.out.print("Digite a nota do aluno 4: ");
        double notaAluno4 = scanner.nextDouble();

        scanner.close();

        double media = (notaAluno1 + notaAluno2 + notaAluno3 + notaAluno4) / 4;
        System.out.println("A média das notas é: " + media);
    }
}
