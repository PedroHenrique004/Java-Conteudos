package Modulos.Mod12_Interfaces_e_Herancas.Composicao;

public class ContaCorrente {

    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    private Double saldo;

    private Double chequeEspecial;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
