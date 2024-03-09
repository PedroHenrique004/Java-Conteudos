package Modulos.Mod8_Tipos_Variaveis_E_Operadores;

public class VariaveisTipos {

    private int codigo = 1;

    private long codigoMaior = 123456789;

    private double valorDecimal = 10.1;

    private boolean status = false;

    private String texto = "Texto dentro de uma variável";

    private float valorDecimal2 = 10.0f;

    public int retornaInteiro() {
        int val = 10;
        return val;
    }
    /*

    public int retornaVal(){
        val = 20;
    }

    Não consegue pois a variavel não está no escopo global
    */

    /**
     * Construtores default e com parametros
     *
     * testasdos na outra classe
     *
     * o 1 é o default
     *
     * o 2 é com parametros
     */

    public VariaveisTipos(){

    }

    public VariaveisTipos(int val){
        this.codigo = val;
    }


}
