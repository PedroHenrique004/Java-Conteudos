package Modulos.Mod11_Colecoes_1.Set;

import Modulos.Mod11_Colecoes_1.List.Aluno;

import java.util.HashSet;
import java.util.Set;

public class HashSetAluno {

    /**
     *
     * Set equals e hash são obrigatorios la nos metodos que estão em Aluno
     * @param args
     */

    public static void main(String[] args) {
        listaSimples();
    }

    private static void listaSimples() {
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("Pedro", "2", 10);
        Aluno b = new Aluno("Ana", "3", 11);
        Aluno c = new Aluno("Pedro", "2", 10);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);

        System.out.println(conjunto);
    }


}
