package TestesComUsuario;

import Entidades.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        String jpl = "select u from Entidades.Usuario u";

        TypedQuery<Usuario> query = em.createQuery(jpl, Usuario.class);
        query.setMaxResults(4);

        List<Usuario>usuarios = query.getResultList();

        for (Usuario usuario : usuarios){
            System.out.println("ID: " + usuario.getId() + "\nNome: " + usuario.getNome());
        }

        em.close();
        emf.close();
    }
}