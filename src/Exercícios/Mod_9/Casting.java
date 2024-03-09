package Exercícios.Mod_9;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número Int : ");
        int numeroInt = scanner.nextInt();

        long numeroLong = numeroInt;

        System.out.println("Aqui está o número convertido para long : " + numeroLong);

        System.out.println("Digite um número Long : ");
        long numeroLong2 = scanner.nextLong();

        int numeroInt2 = (int) numeroLong2;

        System.out.println("Aqui está o número convertido para lint : " + numeroInt2);
    }
}
