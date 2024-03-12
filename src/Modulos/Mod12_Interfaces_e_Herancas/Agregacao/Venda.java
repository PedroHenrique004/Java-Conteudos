package Modulos.Mod12_Interfaces_e_Herancas.Agregacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * A agregação liga outras classes
 */
public class Venda {
    private Comprador comprador;

    private Vendedor venda;

    private List<Produto> produtos;


    public Venda(){
        this.produtos = new ArrayList<>();
    }

    public void concretizarVenda() {
        System.out.println("Comprador " + this.comprador.getNome());
        System.out.println("Comprou os itens : ");
        for (Produto prod : this.produtos){
            System.out.println(prod.getNome());
        }
    }

    public void cancelarVenda() {
        System.out.println("Venda cancelada");
    }


    /**
     * Assim se adiciona a uma lista no metodo set
     *
     * @param produto
     */

    public void add(Produto produto){
        this.produtos.add(produto);
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVenda() {
        return venda;
    }

    public void setVenda(Vendedor venda) {
        this.venda = venda;
    }

    public List<Produto> getProduto() {
        return produtos;
    }


}
