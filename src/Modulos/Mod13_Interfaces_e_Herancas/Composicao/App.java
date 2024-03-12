package Modulos.Mod13_Interfaces_e_Herancas.Composicao;

public class App {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.setNome("Banco Pedro");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);

    }
}
