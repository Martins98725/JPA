package TesteComProduto;

import Entidades.Produto;
import Infra.DAO;

public class NovoProduto {
    public static void main(String[] agrs){
        Produto produto = new Produto("Gabinete ", 350.99);
        DAO<Produto> dao = new DAO<>(Produto.class);

        dao.abrirTransacao().incluir(produto).fechar();

        System.out.println("ID do produto " + produto.getId());
    }
}