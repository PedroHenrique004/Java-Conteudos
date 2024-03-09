package Modulos.Mod8_Tipos_Variaveis_E_Operadores;

public class Operadores {

    public static void main (String args[]){
        operacoesAritmeticas();
        operacoesAAtribuicoes();
        opecoesComIncremento();
        testesrelacionais();
    }

    private static void testesrelacionais() {
        System.out.println("----------Relacionais----------");

        int num1 = 10;
        int num2 = 20;
        boolean maior = num1 > num2;
        System.out.println("num1 > num2 quando num1 é menor : " + maior);
        System.out.println(" ");

        num1 = 20;
        num2 = 20;
        maior = num1 > num2;
        System.out.println("num1 > num2 quando num1 é igual : " + maior);
        System.out.println(" ");


        num1 = 30;
        num2 = 20;
        maior = num1 > num2;
        System.out.println("num1 > num2 quando num1 é maior : " + maior);
        System.out.println(" ");
    }

    private static void opecoesComIncremento() {
        System.out.println("----------Incremento/Decremento----------");

        int inicio = 1;
        System.out.println("Valor inicial : " + inicio);
        inicio++;
        System.out.println("Aumentando com inicio++ : " + inicio);
        inicio--;
        System.out.println("Decrementando com inicio-- : " + inicio);

        System.out.println(" ");
    }

    private static void operacoesAritmeticas() {
        System.out.println("----------Aritmeticos----------");
        int basico = 10 + 10;
        int basico2 = 15 - 5;
        int basico3 = basico * basico2;
        System.out.println("Operações aritmeticas: " + basico3);
        System.out.println(" ");
    }

    private static void operacoesAAtribuicoes() {

        System.out.println("----------Atribuições----------");
        int n1 = 10;
        int n2 = 10;
        int soma = n1 + n2;
        System.out.println("Primeria soma n1 + n2 : " + soma);

        soma += n2;
        System.out.println("Soma com soma += n2 : " + soma);
        System.out.println(" ");
    }


}
