package TestesComUsuario;

import Entidades.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuarios3 {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 8L);
        em.detach(usuario);
        usuario.setNome("Rosa");

        em.merge(usuario);
        em.getTransaction().commit();


        em.close();
        emf.close();
    }
}
