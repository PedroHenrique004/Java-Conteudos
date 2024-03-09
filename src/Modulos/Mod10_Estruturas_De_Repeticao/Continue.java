package Modulos.Mod10_Estruturas_De_Repeticao;

public class Continue {

    public static void main(String[] args) {

        for (int contador = 1; contador <= 100; contador++){

            if (contador %5 != 0){
                continue;
            }

            System.out.println("Contador: " + contador);
        }
    }
}
