package sga.cliente.cascade;

import javax.persistence.*;
import org.apache.logging.log4j.*;
import sga.domain.*;

public class PersistenciaCascadaJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //1. Crear nuevo objeto
        //Objeto en estado transitivo
        Persona persona1 = new Persona("Hugo", "Hernandez", "hhernandez@mail.com", "55443322");
        
        //2. Crear objeto Usuario (tiene dependencia con el objeto Persona)
        Usuario usuario1 = new Usuario("hhernandez", "123", persona1);
        
        //3. Persistimos el objeto Usuario (SOLO ese objeto)
        //Gracias a la configuración de cascada en las clases de entidad, se persistiran ambos objetos a la vez
        em.persist(usuario1);
        
        //4. commit de la transacción.
        tx.commit();
        
        //Objetos en estado de Detached
        log.debug("Objeto persistido Persona: " + persona1);
        log.debug("Objeto persistido Usuario: " + usuario1);
        
        em.close();
    }
}
