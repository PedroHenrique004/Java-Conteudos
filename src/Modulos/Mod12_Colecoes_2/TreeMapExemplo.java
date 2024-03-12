package Modulos.Mod12_Colecoes_2;

import java.util.Map;
import java.util.TreeMap;

/**
 * Chave nunca se repete
 * Garante que as chaves estarão em ordem ascendente.
 * pode ser retirado do mapa por chave
 *
 * Mais demorado
 */

public class TreeMapExemplo {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("******  Apenas o valor ******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("****** Apenas a chave ******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        for (String value : lista.values()) {
            System.out.println(value);
        }
    }

    private static void exemploListaSimples() {
        System.out.println("****** Simples ******");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "João da Silva");
        lista.put(3, "Lúcia Ferreira");

        System.out.println(lista);
        System.out.println("");
    }
}
