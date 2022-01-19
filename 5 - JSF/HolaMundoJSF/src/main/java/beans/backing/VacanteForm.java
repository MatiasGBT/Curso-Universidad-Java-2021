package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class VacanteForm {
    
    @Inject //Para poder utilizarlo, hay que utilizar el concepto de inyección de dependencia de CDI.
    private Candidato candidato;
    
    Logger log = LogManager.getRootLogger();
    
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public String enviar() {
        if (this.candidato.getNombre().equals("Juan")) {
            log.info("Entrando al caso de exito");
            return "exito";
        } else {
            log.info("Entrando al caso de fallo");
            return "fallo";
        }
    }
}
