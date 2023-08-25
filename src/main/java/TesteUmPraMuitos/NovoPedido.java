package TesteUmPraMuitos;

import Entidades.Produto;
import Infra.DAO;
import MuitosPraUm.ItemPedido;
import MuitosPraUm.Pedido;

public class NovoPedido {
    public static void main(String[] args){
        DAO<Object>dao = new DAO<>();
        Produto produto = new Produto("Geladeira", 1234.99);
        Pedido pedido = new Pedido();
        ItemPedido itemPedido = new ItemPedido(pedido, produto, 2);
        dao.abrirTransacao().incluir(produto).incluir(pedido).incluir(itemPedido).fecharTransacao().fechar();
    }
}
