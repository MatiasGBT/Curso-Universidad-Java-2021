package beans;

//En la versión 2, una action de Struts no debe necesariamente de implementar o extender de otra clase

import org.apache.logging.log4j.*;

public class HolaMundoAction {
    //API de Log4j
    Logger log = LogManager.getLogger(HolaMundoAction.class);
    
    //Atr de atributo
    private String saludosAtr;
    
    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
    //Lo único que debe tener una clase Action es la utilización del método Execute
    public String execute() {
        log.debug("Ejecutando método Execute desde Struts 2");
        this.saludosAtr = "Saludos desde Struts 2";
        //Requiere regresar un String para indicar cual es el JSP que se va a ejecutar
        return "exito"; //En Struts.xml indicamos a donde redirige con esta cadena
    }
}
