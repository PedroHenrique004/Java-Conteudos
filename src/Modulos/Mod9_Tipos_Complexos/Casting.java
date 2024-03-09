package Modulos.Mod9_Tipos_Complexos;

public class Casting {

    public static void main(String[] args) {

        /**
         * Imagina uma caixinha cheia, um int tem 16 de espaço, dá para passar os itens para um long que tem 64 de espaço
         *
         * mas uma caixa long de 64 itens não pode virar uma de 16 pois fica faltando espaço;
         */

        /**
         * Implicito:
         */

        int a = 64545;
        long b = a;

        System.out.println(b);


        /**
         * EXplicito:
         */


        int num1 = 10;

        /**
         *
         * Se fizer assim dá erro:
         *
         * short num2 = num1;
         */

        short num2 = (short) num1;

        long numL = 111111111111111111l;

        System.out.println(numL);

        /**
         *
         * Erro:
         *
         * int numI = numL;
         */

        int numI = (int) numL;
        System.out.println(numI);

        /**
         *
         * Perceba que o valor muodu muito devido ao long ser 64bits e o int ser 16bits
         */
    }



}
