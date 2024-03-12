package Exercicios.Mod_13;

public class CNPJ extends Pessoa{

    private String numeroCNPJ;

    private String nomeEmpresa;

    public String getProfissao() {
        return "Uma entidade jurídica não tem uma profissão.";
    }

    public String getNumeroCNPJ() {
        return numeroCNPJ;
    }

    public void setNumeroCNPJ(String numeroCNPJ) {
        this.numeroCNPJ = numeroCNPJ;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
}
