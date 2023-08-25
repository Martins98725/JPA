package TestMuitosPraMuitos;

import Infra.DAO;
import MuitosPraMuitos.Sobrinho;
import MuitosPraMuitos.Tio;

public class NovoTioSobrinho {
    public static void main(String[] args){
        Tio tio1 = new Tio("Miúdo");
        Tio tio2 = new Tio("Gordo");

        Sobrinho sobrinho1 = new Sobrinho("Luiza");
        Sobrinho sobrinho2 = new Sobrinho("Ícaro");

        tio1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio1);

        tio1.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tio1);

        tio2.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinho2);
        sobrinho2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao().incluir(tio1).incluir(tio2).incluir(sobrinho1).incluir(sobrinho2).fecharTransacao().fechar();
    }
}
