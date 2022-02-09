package beans.actions;

//En la versión 2, una action de Struts no debe necesariamente de implementar o extender de otra clase

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class MostrarPersonaAction extends ActionSupport {
    //API de Log4j
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
    //Atr de atributo
    private String nombre;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Lo único que debe tener una clase Action es la utilización del método Execute
    public String execute() {
        log.debug("El nombre es: " + this.nombre);
        return SUCCESS;
    }
}
