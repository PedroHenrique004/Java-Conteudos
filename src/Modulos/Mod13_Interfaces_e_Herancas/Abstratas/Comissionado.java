package Modulos.Mod13_Interfaces_e_Herancas.Abstratas;

public class Comissionado extends Empregado{

    private Double totalVenda;

    private Double totalComissao;

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(Double totalComissao) {
        this.totalComissao = totalComissao;
    }

    public Double vencimento() {
        return totalComissao * totalVenda;
    }
}
