package beans.actions;

import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name = "success", location = "/WEB-INF/content/bienvenido.jsp"),
    @Result(name = "input", location = "/WEB-INF/content/login.jsp")
    //Ya no se hace un redireccionamiento a la acción de login debido a que no se mostrarían los mensajes de error
})
public class ValidarUsuarioAction extends ActionSupport {

    //API de Log4j
    Logger log = LogManager.getLogger(LoginAction.class);

    private String usuario;
    private String password;

    @Action("validarUsuario")
    @Override
    public String execute() {
        if ("admin".equals(this.usuario)) {
            addActionMessage(getText("usuario.valido"));
            return SUCCESS;
        } else {
            return INPUT;
        }
    }

    @Override
    public void validate() {
        if (this.usuario == null || "".equals(this.usuario.trim())) {
            addFieldError("usuario", getText("val.usuario"));
            //La key es el nombre (name) del input del jsp, el value esta en el archivo .properties
        } else if (!usuarioValido()) {
            //Este método no estara asociado a un campo, será más generico
            addActionError(getText("usuario.invalido"));
        }
        
        if (this.password == null || "".equals(this.password.trim())) {
            addFieldError("password", getText("val.password"));
        } else if (this.password.length()<3) {
            addFieldError("password", getText("val.pass.min.length"));
        }
    }
    
    private boolean usuarioValido() {
        return "admin".equals(this.usuario);
    }

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
}
