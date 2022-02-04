package test;

import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import java.util.List;
import javax.naming.*;
import sga.domain.Persona;
import sga.service.PersonaServiceRemote;

public class ClientePersonaService {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");

        //Utilizamos el archivo login.conf para poder superar la autenticación del lado del servidor que solicitara el EJB.
        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config", authFile);
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        programmaticLogin.login("admin", "admin".toCharArray());
        //toCharArray para convertir el password en caracteres, ya que así lo solicita el API

        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee-web/PersonaServiceImpl!sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaService.listarPersonas();
            for (Persona p : personas) {
                System.out.println(p);
            }
            
            System.out.println("\nFin de la llamada al EJB desde el cliente");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
