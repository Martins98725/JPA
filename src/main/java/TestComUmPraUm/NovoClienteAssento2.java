package TestComUmPraUm;

import Infra.DAO;
import UmPraUm.Assento;
import UmPraUm.Cliente;

public class NovoClienteAssento2 {
    public static void main(String[] args){
        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Fiat", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);
    }
}