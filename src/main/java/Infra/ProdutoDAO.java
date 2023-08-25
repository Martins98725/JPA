package Infra;

import Entidades.Produto;

public class ProdutoDAO extends DAO<Produto> {
    public ProdutoDAO() {
        super(Produto.class);
    }
}
