package sga.cliente.asociaciones;

import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;
import sga.domain.Persona;
import sga.domain.Usuario;

public class ClienteAsociacionesJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        //No necesitamos un objeto Transaction debido a que solo haremos un SELECT y no modificaremos la BD
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        //Cerramos la conexión
        em.close();
        
        //Imprimir los objetos persona
        for(Persona persona : personas) {
            log.debug("Persona: " + persona);
            //Recuperamos los usuarios de cada persona
            for(Usuario usuario : persona.getUsuarioList()) {
                log.debug("Usuario: " + usuario);
            }
        }
    }
}
