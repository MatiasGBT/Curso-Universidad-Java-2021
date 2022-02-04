package sga.cliente;

import javax.naming.*;
import org.apache.logging.log4j.*;
import sga.domain.Persona;
import sga.servicio.PersonaServiceRemote;

public class PruebaManejoTransacciones {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-webV6/PersonaDaoImpl");
            
            log.debug("Iniciando prueba manejo transaccional PersonaService");
            
            //Buscar un objeto persona
            Persona persona1 = personaService.encontrarPersonaPorId(new Persona(1));
            log.debug("Persona recuperada: " + persona1);
            
            //Cambiar el apellido de la persona
            persona1.setApellido("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); //Ponemos más de 45 caracteres para dar error
            
            personaService.modificarPersona(persona1);
            log.debug("Objeto modificado: " + persona1);
            log.debug("Fin de prueba EJB transaccional");
        } catch (NamingException ex) {
            log.debug(ex.getMessage());
        }
    }
}
