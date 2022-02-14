package dao;

import javax.persistence.*;

//Esta va a ser una clase base para todas las clases DAO, por lo que tiene que ser abstracta
//para no poder crear objetos de esta.
public abstract class GenericDao {

    protected static EntityManager em;
    private static EntityManagerFactory emf;
    private static final String PU = "HibernateJpaPU";

    public GenericDao() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PU);
        }
    }

    protected EntityManager getEntityManager() {
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }
}
