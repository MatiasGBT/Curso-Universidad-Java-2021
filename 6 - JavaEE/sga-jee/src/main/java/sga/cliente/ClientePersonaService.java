package sga.cliente;

import java.util.List;
import javax.naming.*;
import sga.domain.Persona;
import sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaService.listarPersonas();
            
            for(Persona p : personas) {
                System.out.println(p);
            }
            
            System.out.println("\nFin de la llamada al EJB desde el cliente");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
