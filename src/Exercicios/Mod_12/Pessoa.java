package Exercicios.Mod_12;

public abstract class Pessoa {

    private String nome;

    private String sexo;

    public abstract String getProfissao();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
