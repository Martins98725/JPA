package TestMuitosPraMuitos;

import Consulta.NotaFilme;
import Infra.DAO;
import MuitosPraMuitos.Filme;

public class ObterMediaDosFilmes {
    public static void main(String[] args){
        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("mediaGeral");
        System.out.println(nota.getMedia());

        dao.fechar();
    }
}
