package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import capadatos.domain.Persona;
import capaservicio.PersonaService;
import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;

/*
Esta clase va a hacer de Controlador (Action) y Modelo (Bean).
El modelo lo obtendremos con ayuda de la interface de servicio, el cual inyectaremos con ayuda 
de Spring y el plug-in de integración entre Struts y Spring que agregamos al archivo pom.xml
*/
public class MostrarPersonaAction extends ActionSupport {

    private long contadorPersonas;

    Logger log = LogManager.getLogger(MostrarPersonaAction.class);

    @Autowired
    private PersonaService personaService;

    private List<Persona> personas;

    @Override
    public String execute() {
        this.personas = personaService.listarPersonas();
        this.contadorPersonas = personaService.contarPersonas();
        return SUCCESS;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public long getContadorPersonas() {
        return contadorPersonas;
    }

    public void setContadorPersonas(long contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }
}