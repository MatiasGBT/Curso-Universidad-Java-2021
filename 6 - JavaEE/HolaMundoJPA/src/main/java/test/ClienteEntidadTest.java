package test;

import javax.persistence.*;
import org.apache.logging.log4j.*;
import sga.domain.Persona;

public class ClienteEntidadTest {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transacción
        tx.begin();
        //No se debe especificar el id de la base de datos
        Persona persona1 = new Persona("Maria", "Gutierrez", "mgutierrez<@mail.com", "22113344");
        log.debug("Objeto a persistir: " + persona1);
        //Persistir el objeto en la base de datos
        em.persist(persona1);
        //Terminamos la transacción
        tx.commit();
        log.debug("Objeto persistido: " + persona1);
        em.close();
    }
}
