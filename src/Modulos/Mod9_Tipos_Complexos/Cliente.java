package Modulos.Mod9_Tipos_Complexos;

public class Cliente {

    private int codigoInt;

    private Integer codigointeger;
    private Long codigoMaior = 123456789l;

    private Double valorDecimal = 10.1;

    private Boolean status = false;

    private Float valorDecimal2 = 10.0f;

    private Short shor;

    private Byte bi;

    private Character letra = 'A';

    public static void main(String[] args) {

    }

    public void teste() {
        /**
         *  this.codigoInt = null; não funciona
         */

        this.codigointeger = null;
    }
}
