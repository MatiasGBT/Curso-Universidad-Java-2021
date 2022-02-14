package test.ciclovida;

import domain.Contacto;
import javax.persistence.*;

public class Estado2RecuperarObjetoPersistente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //Realmente no es necesario abrir una transacción para recuperar un objeto de la BD
        //Definimos la variable que recibira el objeto
        Contacto contacto = null;
        
        //Recuperamos el objeto
        contacto = em.find(Contacto.class, 3);
        
        //Ya recuperado, el objeto esta en estado de Detached
        System.out.println(contacto);
        
        //Sin embargo, también podemos recuperarlo en una transacción
        em.getTransaction().begin();
        contacto = em.find(Contacto.class, 3); //La diferencia es que el objeto estaría en estado persistente en este momento.
        //Si modificaramos el objeto en este momento, se guardaría en la BD
        em.getTransaction().commit();
        
        System.out.println(contacto);
    }
}
