package Modulos.Mod10_Estruturas_De_Repeticao;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        int num = s.nextInt();

        switch(num) {
            case 1:
                System.out.println("Escolheu 1");
                break;
            case 2:
                System.out.println("Escolheu 2");
                break;
            case 3:
                System.out.println("Escolheu 3");
                break;
        }

    }
}
