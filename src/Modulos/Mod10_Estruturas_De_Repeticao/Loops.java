package Modulos.Mod10_Estruturas_De_Repeticao;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>();

        for(int i = 1; i <= 10 ; i++){
            System.out.println("linha : " + i);
            valores.add(i);
        }

        for (Integer i : valores) {
            System.out.println("linha : " + i);
        }

    }
}
