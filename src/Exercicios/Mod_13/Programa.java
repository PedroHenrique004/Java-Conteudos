package Exercicios.Mod_13;

public class Programa {

    public static void main(String[] args) {

        CPF pessoaFisica = new CPF();

        pessoaFisica.setNome("Pedro");
        pessoaFisica.setSexo("Masculino");
        pessoaFisica.setNumeroCPF(11111111111L);
        pessoaFisica.setProfissao("Desenvolvedor de Software");

        CNPJ pessoaJuridica = new CNPJ();

        pessoaJuridica.setNome("Pedro");
        pessoaJuridica.setSexo("Masculino");
        pessoaJuridica.setNomeEmpresa("Pedro Softwares");
        pessoaJuridica.setNumeroCNPJ("11.111.111/1111-11");

        imprimirCPF(pessoaFisica);
        imprimirCNPJ(pessoaJuridica);
    }

    public static void imprimirCNPJ(Pessoa pessoa){
        if (pessoa instanceof CNPJ){
            System.out.println(pessoa.getNome() + " é do sexo " + pessoa.getSexo() + " e é dono da " + ((CNPJ) pessoa).getNomeEmpresa() + ", aqui está o CNPJ da empresa : " + ((CNPJ) pessoa).getNumeroCNPJ());
        }
    }

    public static void imprimirCPF(Pessoa pessoa){
        if (pessoa instanceof CPF){
            System.out.println( pessoa.getNome() + " é do sexo " + pessoa.getSexo() + " e trabalha como " + pessoa.getProfissao() + " e esse é seu CPF : " + ((CPF) pessoa).getNumeroCPF());
        }
    }

}
