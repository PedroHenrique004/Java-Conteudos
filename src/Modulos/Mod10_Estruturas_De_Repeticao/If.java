package Modulos.Mod10_Estruturas_De_Repeticao;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int resultado = s.nextInt();

        if (resultado > 18) {
            System.out.println("Maior de idade");
        }
        else if (resultado == 18 ) {
            System.out.println("Tem exatos 18 e já é maior");
        }
        else {
            System.out.println("Ainda é de menor");
        }
    }
}
