package test.ciclovida;

import domain.Contacto;
import javax.persistence.*;

public class Estado3ModificarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //Definimos la variable
        Contacto contacto = null;
        
        //Recuperamos el objeto
        contacto = em.find(Contacto.class, 3); //Estado transitivo
        
        //Modificamos el objeto
        contacto.setEmail("clara@mail.com");
        
        //Iniciamos la transacción
        em.getTransaction().begin(); //El objeto pasaría al estado Persistente ya que estamos dentro de la transacción.
        
        //Persistimos el objeto
        em.persist(contacto);
        //Es más común utilizar merge(). persist() se utiliza para guardar la información la primera vez,
        //merge() es para guardar información una vez tiene representación en la BD (update).
        
        em.getTransaction().commit();
        
        //Estado de detached
        System.out.println(contacto);
    }
}
