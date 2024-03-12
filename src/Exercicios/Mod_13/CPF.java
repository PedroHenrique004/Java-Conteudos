package Exercicios.Mod_13;

public class CPF extends Pessoa{
    private Long numeroCPF;

    private String profissao;

    public Long getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(Long numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
