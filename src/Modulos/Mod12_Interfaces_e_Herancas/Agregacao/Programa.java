package Modulos.Mod12_Interfaces_e_Herancas.Agregacao;

public class Programa {

    public static void main(String[] args) {

        Produto produtoTV = criarProduto(1L, 1000d,"TV");
        Produto produtoCel = criarProduto(2L, 100d,"Celular");

        Vendedor vendedor = criarVendedor(10d, "Pedro");

        Comprador comprador = criarComprador("Gabriel", 2000d);

        Venda venda = new Venda();
        venda.setVenda(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concretizarVenda();
    }


    private static Produto criarProduto(Long codigo, Double valor, String nome) {

        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;

    }

    private static Vendedor criarVendedor(Double comissao, String nome){
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Comprador criarComprador(String nome, Double verba) {
        Comprador comprador = new Comprador();
        comprador.setNome(nome);
        comprador.setVerba(verba);
        return comprador;
    }
}
