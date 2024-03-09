package Modulos.Mod11_Colecoes_1.List;

import java.util.Collections;
import java.util.List;

public class ArrayList {

    /**
     *
     * É como um array cujo tamanho pode crescer.
     * A busca de um elemento é rápida, mas inserções e exclusões não são.
     *
     */

        public static void main(String args[]) {
            exemploListaSimples();
            exemploListaSimplesOrdemAscendente();
            listaDenumeros();
        }

    private static void listaDenumeros() {
            List<Integer> ordem = new java.util.ArrayList<>();
            ordem.add(3);
            ordem.add(2);
            ordem.add(4);
            ordem.add(5);
            ordem.add(1);
            Collections.sort(ordem);
            System.out.println(ordem);
            System.out.println(" ");
    }

    private static void exemploListaSimples() {
            System.out.println("****** exemploListaSimples ******");
            List<String> lista = new java.util.ArrayList<String>();
            lista.add("João da Silva");
            lista.add("Antonio Sousa");
            lista.add("Lúcia Ferreira");
            System.out.println(lista);
            System.out.println(" ");
        }

        private static void exemploListaSimplesOrdemAscendente() {
            System.out.println("****** exemploListaSimplesOrdemAscendente ******");
            List<String> lista2 = new java.util.ArrayList<String>();
            lista2.add("João da Silva");
            lista2.add("Antonio Sousa");
            lista2.add("Lúcia Ferreira");
            Collections.sort(lista2);
            System.out.println(lista2);
            System.out.println(" ");
        }

}
