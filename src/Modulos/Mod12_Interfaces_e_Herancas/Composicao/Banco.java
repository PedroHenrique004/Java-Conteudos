package Modulos.Mod12_Interfaces_e_Herancas.Composicao;


import java.util.HashSet;
import java.util.Set;

/**
 *
 * Na composição, é necessário ter uma classe base para criar outras
 */

public class Banco {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Set<ContaCorrente> contasCorrentes;

    private Set<ContaPoupanca> contasPoupancas;

    public Banco() {
        this.contasCorrentes = new HashSet<>();
        this.contasPoupancas = new HashSet<>();
    }


    public void add (ContaCorrente cc){
        this.contasCorrentes.add(cc);
    }

    public void add (ContaPoupanca cp){
        this.contasPoupancas.add(cp);
    }
}
