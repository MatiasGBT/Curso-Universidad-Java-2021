package test.ciclovida;

import domain.Contacto;
import javax.persistence.*;

public class Estado4EliminarObjeto {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //Definimos la variable
        Contacto contacto = null;
        
        //Recuperamos el objeto
        contacto = em.find(Contacto.class, 3); //Estado transitivo
        
        //Iniciamos la transacción
        em.getTransaction().begin();
        
        //Eliminamos el objeto
        em.remove(em.merge(contacto)); //El método delete() es del API de Hibernate, por ende usamos remove.
        
        em.getTransaction().commit();
        
        //Estado de detached
        System.out.println(contacto);
    }
}
