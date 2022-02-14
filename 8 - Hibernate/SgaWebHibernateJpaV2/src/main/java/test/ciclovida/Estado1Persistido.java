package test.ciclovida;

import domain.Contacto;
import javax.persistence.*;

public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. estado transitivo
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@mail.com");
        contacto.setTelefono("11223344");
        
        //2. estado persistente
        em.getTransaction().begin();
        /*
        Anteriormente cuando se trabajaba puramente con Hibernate estaba el método save(), sin embargo, Hibernate se alineo
        con el estándar de JPA, por lo que ya no tenemos directamente este y otros métodos vistos en la lección.
        Para poder acceder a ese método tendriamos que recuperar el objeto de sesión de Hibernate, sin embargo esto
        es una práctica que ya no es recomendable, por ende usamos el estándar de JPA.
        */
        em.persist(contacto); //No se guardo la información en la BD aún, se guarda cuando hacemos commit.
        //También se puede utilizar el método flush para guardar la información sin cerrar la transacción.
        //em.flush();
        //Esto es común utilizarlo cuando tenemos que recuperar el ID de alguno de los objetos en la BD sin terminar
        //la transacción.
        em.getTransaction().commit();
        
        //3. estado detached
        //Tenemos representación del objeto en la BD pero si hacemos cambios en este y no sincronizamos devuelta, se perderan.
        System.out.println(contacto);
    }
}
