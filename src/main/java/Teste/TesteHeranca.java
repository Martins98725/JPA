package Teste;

import Desafio.Aluno;
import Desafio.AlunoBolsista;
import Infra.DAO;

public class TesteHeranca {
    public static void main(String[] args){
        DAO<Aluno> dao = new DAO<>();
        Aluno aluno = new Aluno(123L,"Martins");
        AlunoBolsista alunoB = new AlunoBolsista(231L, "Ícaro", 1000);
        dao.incluirAtomico(aluno);
        dao.incluirAtomico(alunoB);

        dao.fechar();
    }

}
