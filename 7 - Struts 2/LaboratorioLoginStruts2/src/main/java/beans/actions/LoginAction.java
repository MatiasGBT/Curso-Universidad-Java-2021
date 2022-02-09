package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport {
    //API de Log4j
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String usuario;
    private String password;
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //Lo único que debe tener una clase Action es la utilización del método Execute
    @Override
    public String execute() {
        log.debug("El nombre de usuario es: " + this.usuario + " y el password es: " + this.password);
        return SUCCESS;
    }
    
    //Hay que definir cada uno de los elementos del archivo de propiedades en esta clase
    public String getNombre() {
        return getText("form.nombre");
    }
    
    public String getContrasena() {
        return getText("form.contrasena");
    }
    
    public String getBoton() {
        return getText("form.boton");
    }
    
    public String getTitulo() {
        return getText("form.titulo");
    }
    
    public String getValores() {
        return getText("form.valores");
    }
}
