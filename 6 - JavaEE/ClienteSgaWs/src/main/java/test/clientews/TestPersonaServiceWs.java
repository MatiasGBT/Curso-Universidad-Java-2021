package test.clientews;

import cliente.ws.servicio.Persona;
import cliente.ws.servicio.PersonaServiceImplService;
import cliente.ws.servicio.PersonaServiceWs;
import java.util.List;

public class TestPersonaServiceWs {
    public static void main(String[] args) {
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        System.out.println("Ejecutando servicio de listar personas ws");
        List<Persona> personas = personaService.listarPersonas();
        
        for(Persona p : personas) {
            System.out.println("Persona: " + p.getIdPersona() + ", nombre: " + p.getNombre()
            + ", apellido: " + p.getApellido() + ", email: " + p.getEmail());
        }
        
        System.out.println("Fin de servicio listar personas ws");
    }
}
