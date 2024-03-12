package Exercicios.Mod_11_e_12;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
    static List<Pessoa> listaPessoas = new ArrayList<>();
    static List<String> listaMasculino = new ArrayList<String>();
    static List<String> listaFeminina = new ArrayList<String>();

    public static void main(String[] args) {

        cadastraPessoas();
        listasPorSexo();
    }

    private static void cadastraPessoas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão adicionadas? ");
        int numPessoas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numPessoas; i++){
            Pessoa pessoa = new Pessoa();

            System.out.println("Digite o nome da pessoa: ");
            String nome = sc.nextLine();
            pessoa.setNome(nome);

            String sexo;

            System.out.println("Digite o sexo da pessoa: (Masculino/Feminino)");
            sexo = sc.nextLine().toLowerCase();

            while (!sexo.equals("masculino") && !sexo.equals("feminino")){
                System.out.println("Digite um sexo válido");
                sexo = sc.nextLine().toLowerCase();
            }

            pessoa.setSexo(sexo);
            listaPessoas.add(pessoa);

            if (sexo.equals("masculino")){
                String nomePessoa = pessoa.getNome();
                listaMasculino.add(nomePessoa);
            }
            else if (sexo.equals("feminino")) {
                String nomePessoa = pessoa.getNome();
                listaFeminina.add(nomePessoa);
            }

        }
    }

    private static void listasPorSexo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual lista você quer ver: (M/F)");
        String opcao = sc.nextLine().toLowerCase();

        while (!opcao.equals("m") && !opcao.equals("f")){
            System.out.println("Digite um sexo válido");
            opcao = sc.nextLine().toLowerCase();
        }

        if (opcao.equals("m")){
            System.out.println(listaMasculino);
        }
        else {
            System.out.println(listaFeminina);
        }
    }


}
