package dao;

import domain.Persona;
import jakarta.persistence.*;
import java.util.List;

public class PersonaDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDao() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    public void listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    //Como esta aplicación no se despliega en un servidor, nosotros tenemos que abrir y cerrar las transacciones
    public void insertar(Persona persona) {
        //Lo ponemos en un bloque try/catch por si hay que hacer rollback
        try {
            //Iniciamos la transacción
            em.getTransaction().begin();
            //Guardamos el objeto en la base de datos
            em.persist(persona);
            //Hacemos commit de la transacción
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void modificar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        /*finally {
            if (em != null) {
                em.close();
            }
        }*/
    }

    public Persona buscarPersonaPorId(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    public void eliminar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(persona));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        /*finally {
            if (em != null) {
                em.close();
            }
        }*/
    }
}
