package Modulos.Mod12_Colecoes_2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Aqui é mais rápido mas a ordenação não é garantida
 */

public class MapExemplo {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
    }

    private static void exemploListaSimples() {
        System.out.println("============ Simples ==============");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Pedro");
        lista.put(2, "Ana");
        lista.put(3, "Pedro");
        lista.put(4, "Gabriel");

        System.out.println(lista);
        System.out.println(" " );
    }

    private static void exemploListaSimplesIterandoValores() {
        System.out.println("****** exemplo mostrando o valor ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");
        for (String value : lista.values()) {
            System.out.println(value);
        }System.out.println(" " );
    }

    private static void exemploListaSimplesIterandoChaves() {
        System.out.println("****** exemplo mostrando apenas a chave ******");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Lúcia Ferreira");
        lista.put(4, "João da Silva");

        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
        System.out.println(" ");
    }
}
