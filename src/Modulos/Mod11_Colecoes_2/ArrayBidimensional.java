package Modulos.Mod11_Colecoes_2;

public class ArrayBidimensional {
    public static void main(String[] args) {
        declaraArrayBi();
    }

    private static void declaraArrayBi() {
        System.out.println("-------------- Declara array Bidimensional ------------------");

        int [][] array1 = { {1,2,3} , {4,5,6} };
        exibeArray(array1);
    }

    private static void exibeArray(int[][] array) {
        for (int linha = 0; linha < array.length; linha++){
            for (int coluna = 0; coluna < array[linha].length; coluna++){
                System.out.println(array[linha][coluna]);
                System.out.println(" ");
            }
        }
    }
}
