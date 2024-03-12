package Modulos.Mod12_Colecoes_2;

public class ArraysSimples {

    public static void main(String[] args) {
        declaraArray();
    }

    private static void declaraArray() {
        System.out.println("-------------- Declara array ------------------");

        /**
         *
         * Declaração do array:
         *
         *  Array -- nome -- instancia -- tamanho
         */

        int[] a = new int [4];

        /**
         *
         * Araay ja com valores
         *
         * Array - nome - valores
         */

        int[] iniciaValores = {1,2,3,4};

        /**
         *
         * Array e depois valores
         */

        int[] meuArray;

        meuArray = new int[4];

        meuArray [0] = 1;
        meuArray [1] = 2;
        meuArray [2]= 3;
        meuArray [3] = 4;

        for (int i = 0; i < meuArray.length; i++) {
            System.out.println(meuArray[i]);
        }

        for (int i : meuArray) {
            System.out.println(i);
        }


    }
}
