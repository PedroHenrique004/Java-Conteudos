package Modulos.Mod13_Interfaces_e_Herancas.Abstratas;

public class Horista extends Empregado{

    private Double precoHora;

    private Double totalHoras;

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(Double totalHoras) {
        this.totalHoras = totalHoras;
    }

    public Double vencimento() {
        return precoHora * totalHoras;
    }
}
