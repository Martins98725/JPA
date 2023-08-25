package TestMuitosPraMuitos;

import Infra.DAO;
import MuitosPraMuitos.Ator;
import MuitosPraMuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args){
        Filme filmeA = new Filme("Star Wars", 8.1);
        Filme filmeB = new Filme("O fugitivo", 8.7);
        Ator atorA = new Ator("Adam Driver");
        Ator atorB = new Ator("Carrie ficher");
        filmeA.adcionarAtor(atorA);
        filmeA.adcionarAtor(atorB);

        filmeB.adcionarAtor(atorA);

        DAO<Filme> dao = new DAO<>();
        dao.incluirAtomico(filmeA);
    }
}
