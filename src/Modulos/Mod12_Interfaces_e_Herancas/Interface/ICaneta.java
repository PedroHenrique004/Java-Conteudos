package Modulos.Mod12_Interfaces_e_Herancas.Interface;

/**
 *
 * É tipo a Props do TS
 */

public interface ICaneta {

    public void escrever(String texto);
    public String getCor();

    /**
     *
     * Esse defaultserve para todos mas não é obrigatório igual aos outros
     */

    default void escreverComumParaTodas() {
        System.out.println("Escrita igual a todas");
    }

    default void testando () {
        System.out.println("Pode ter mais de um default?");
    }
}
