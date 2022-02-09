package beans.actions;

//En la versión 2, una action de Struts no debe necesariamente de implementar o extender de otra clase

import org.apache.logging.log4j.*;

public class SaludarAction {
    //API de Log4j
    Logger log = LogManager.getLogger(SaludarAction.class);
    
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
        this.saludosAtr = "Hola desde Struts 2 con Convenciones";
        return "exito"; //Esto ya no esta siendo utilizado debido a las convencioens
    }
}
