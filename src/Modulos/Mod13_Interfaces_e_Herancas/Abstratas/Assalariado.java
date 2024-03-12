package Modulos.Mod13_Interfaces_e_Herancas.Abstratas;

public class Assalariado extends Empregado {

    /**
     * Com esse extends não preciso repetir esse trecho:
     *
     *     private String nome;
     *
     *     private String sobrenome;
     *
     *     private String cpf;]
     *
     *
     *     Pois ele já está na classe que essa extende
     */
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double vencimento() {
        return salario;
    }
}
