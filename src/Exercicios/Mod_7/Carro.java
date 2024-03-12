package Exercicios.Mod_7;

/**
 * @author Pedro Santos
 *
 * Criação de um classe carro
 */

public class Carro {
    private String marcaDoCarro;

    private String modeloDoCarro;

    private String corDoCarro;

    private int anoDoCarro;


    public String getMarcaDoCarro() {
        return marcaDoCarro;
    }

    public void setMarcaDoCarro(String marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public String getCorDoCarro() {
        return corDoCarro;
    }

    public void setCorDoCarro(String corDoCarro) {
        this.corDoCarro = corDoCarro;
    }

    public int getAnoDoCarro() {
        return anoDoCarro;
    }

    public void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }



    public static void main (String args[]){
        Carro meuCarro = new Carro();

        meuCarro.setMarcaDoCarro("Clio");
        meuCarro.setModeloDoCarro("Renault");
        meuCarro.setCorDoCarro("Vermelho");
        meuCarro.setAnoDoCarro(2007);

        System.out.println("Marca do carro: " + meuCarro.getMarcaDoCarro());
        System.out.println("Modelo do carro: " + meuCarro.getModeloDoCarro());
        System.out.println("Cor do carro: " + meuCarro.getCorDoCarro());
        System.out.println("Ano do carro: " + meuCarro.getAnoDoCarro());
    }
}
