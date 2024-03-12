package Modulos.Mod13_Interfaces_e_Herancas.Interface;

public class ClasseTeste {

    public static void main(String[] args) {
        ICaneta caneta = new CanetaNormal() {
            {
                escrever("Olá Pedro");
                System.out.println(getCor());

                /**
                 * Aqui uso aquela que não é obrigatória, os outras não tem e também funcionam
                 */
                escreverComumParaTodas();
            }
        };

        ICaneta giz = new Giz(){
            {
                escrever("Olá Pedro");
                System.out.println(getCor());
            }
        };

        ICaneta lapiz = new Lapis(){
            {
                escrever("Olá Pedro");
                System.out.println(getCor());
                testando();
            }
        };
    }
}
