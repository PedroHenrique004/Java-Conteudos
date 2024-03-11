package Modulos.Mod11_Colecoes_2;

public class BubbleSort {

    static int[] vet = {8,9,3,5,1};

    public static void main(String[] args) {
        exibeAleatorio();
        exibeOrdenado();
    }

    private static void exibeOrdenado() {
        System.out.println("Ordem organizada : ");

        for(int i = 0; i < vet.length; i++){

            for (int j = 0; j < vet.length - 1; j++){
                int a = vet[j];
                int b = vet[j + 1];

                if (a > b){
                    int atual = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = atual;
                }
            }

        }

        for (int i : vet){
            System.out.println(i);
        }
    }

    private static void exibeAleatorio() {
        System.out.println(" Ordem inicial : ");
        for (int i : vet){
            System.out.println(i);
        }
        System.out.println(" ");
    }
}
