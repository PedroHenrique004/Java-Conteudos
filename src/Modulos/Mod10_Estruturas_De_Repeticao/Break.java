package Modulos.Mod10_Estruturas_De_Repeticao;

public class Break {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 1000; contador++){
            System.out.println("Esta é a repetição nr: " + contador);

            if (contador == 10){
                break;
            }
        }
    }
}
