package TestComUmPraUm;

import Infra.DAO;
import UmPraUm.Assento;
import UmPraUm.Cliente;

public class NovoClienteAssento {
    public static void main(String[] args){
        Assento assento = new Assento("12L");
        Cliente cliente = new Cliente("Rita", assento);

        DAO<Object> dao = new DAO<>();
        dao.abrirTransacao().incluir(assento).incluir(cliente).fecharTransacao().fechar();
    }
}
