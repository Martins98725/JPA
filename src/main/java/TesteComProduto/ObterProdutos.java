package TesteComProduto;

import Entidades.Produto;
import Infra.ProdutoDAO;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args){
        ProdutoDAO produtoDAO = new ProdutoDAO();

        List<Produto>produtos = produtoDAO.obterTodos();

        for (Produto produto : produtos){
            System.out.println("ID: " + produto.getId() +"\nNome: " + produto.getNome() + "\nPreço: " + produto.getPreco());
        }
        double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (t, p) -> t + p).doubleValue();

        System.out.println("Preço final R$: " + precoTotal);
        produtoDAO.fechar();
    }
}
