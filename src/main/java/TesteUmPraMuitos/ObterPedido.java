package TesteUmPraMuitos;

import Entidades.Produto;
import Infra.DAO;
import MuitosPraUm.ItemPedido;
import MuitosPraUm.Pedido;

public class ObterPedido {
    public static void main(String[] args){
        DAO< Pedido> dao = new DAO<>(Pedido.class);
        Pedido pedido = dao.obterPorID(1L);
        for (ItemPedido item : pedido.getItens()){
            System.out.println(item.getQuant());
            System.out.println(item.getProduto().getNome());
        }
        dao.fechar();
    }
}
