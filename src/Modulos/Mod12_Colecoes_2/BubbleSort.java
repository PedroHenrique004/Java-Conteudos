package Modulos.Mod12_Colecoes_2;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números que você gostaria de ordenar, separados por vírgulas:");
        String[] input = scanner.nextLine().split(",");
        int[] vet = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            vet[i] = Integer.parseInt(input[i].trim());
        }

        exibeAleatorio(vet);
        exibeOrdenado(vet);
    }

    private static void exibeOrdenado(int[] vet) {
        System.out.println("Ordem organizada : ");

        for(int i = 0; i < vet.length; i++){

            for (int j = 0; j < vet.length - 1; j++){
                int a = vet[j];
                int b = vet[j + 1];

                if (a > b){
                    int atual = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = atual;
                }
            }

        }

        for (int i : vet){
            System.out.println(i);
        }
    }

    private static void exibeAleatorio(int[] vet) {
        System.out.println(" Ordem inicial : ");
        for (int i : vet){
            System.out.println(i);
        }
        System.out.println(" ");
    }
}
