package Modulos.Mod12_Interfaces_e_Herancas.Abstratas;

public class Programa {
    public static void main(String[] args) {

        Assalariado empregado = new Assalariado();

        empregado.setCpf("1");
        empregado.setNome("Pedro");
        empregado.setSobrenome("Santos");
        empregado.setSalario(100.0);

        System.out.println( empregado.getNome() + " tem o salario de : " + empregado.vencimento());
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();

        comissionado.setCpf("2");
        comissionado.setNome("Gabriel");
        comissionado.setSobrenome("Santos");
        comissionado.setTotalComissao(10.0);
        comissionado.setTotalVenda(10.0);

        System.out.println( comissionado.getNome() + " tem o salario de : " + comissionado.vencimento());
        imprimir(comissionado);

        Horista horista = new Horista();

        horista.setCpf("3");
        horista.setNome("Ana");
        horista.setSobrenome("Bia");
        horista.setPrecoHora(10.0);
        horista.setTotalHoras(10.0);

        System.out.println( horista.getNome() + " tem o salario de : " + horista.vencimento());

        /**
         * O horista é um Empregado pois ele é um herdeiro
         */
        imprimir(horista);


        /**
         * É exibido
         */
        imprimirSeHorista(horista);

        /**
         * Não é
         */

        imprimirSeHorista(comissionado);
    }

    public static void imprimir(Empregado empregado){
        System.out.println( empregado.getNome() + " tem o salario de : " + empregado.vencimento());
    }

    public static void imprimirSeHorista(Empregado empregado){
        if( empregado instanceof Horista){
            Horista hor = (Horista) empregado;
            System.out.println(hor.getPrecoHora());
        }
    }
}
