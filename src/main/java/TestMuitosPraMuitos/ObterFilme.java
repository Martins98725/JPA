package TestMuitosPraMuitos;

import Infra.DAO;
import MuitosPraMuitos.Ator;
import MuitosPraMuitos.Filme;

import java.util.List;

public class ObterFilme {
    public static void main(String[] args){
        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme>filmes = dao.consultar("filmesMaiorQue", "nota", 8.3);
        for (Filme filme : filmes){
            System.out.println(filme.getNome() + "=> " + filme.getNota());
            for (Ator ator : filme.getAtores()){
                System.out.println(ator.getNome());
            }
        }
    }
}
