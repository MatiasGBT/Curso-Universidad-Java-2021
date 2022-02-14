package test;

import domain.Persona;
import jakarta.persistence.*;
import java.util.List;

public class HolaMundoHibernate {
    public static void main(String[] args) {
        //Vamos a ejecutar un query de HQL ()Hibarnate Query Language
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager em = fabrica.createEntityManager();
        
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
