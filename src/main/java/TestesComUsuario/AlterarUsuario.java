package TestesComUsuario;

import Entidades.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario {
    public  static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        //vale resaltar que a alteração so ocorre entre o getTransaction().begin() e o getTransaction().commit()
        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 1L);

        System.out.println(usuario.getNome());
        usuario.setNome("Rafaela");

        //aqui ele altera o nome do usuarip no banco de dados
        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
