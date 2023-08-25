package TestesComUsuario;

import Entidades.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        //Fazendo alteração sem o marge
        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 8L);
        usuario.setNome("Rosa");
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
