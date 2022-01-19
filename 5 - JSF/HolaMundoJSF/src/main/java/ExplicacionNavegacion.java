
public class ExplicacionNavegacion {
    /*
    Navegación en JSF:
    - Permite movernos entre páginas de la misma tecnología.
    - Existen varios tipos de navegación:
     -Navegación estática: el valor de la siguiente vista (página) esta definido por un nombre o cadena fija.
     -Navegación dinamica: el valor de la siguiente vista va a depender de la acción ejecutada por el usuario y
     la cadena de regreso del método action ejecutado.
    - Formas de configurar nuestra navegación:
     -Navegación implícita: la salida especificada busca una página con un nombre identico a la cadena de salida
     en el directorio actual, con la extensión de la página actual también (por ejemplo: xhtml o jspx).
     -Navegación explicita: se define la navegación dentro del archivo de faces-config.xml

    Navegación estática:
    El elemento para definir cual es la siguiente página a mostrar es una cadena, a la que se le conoce como salida
    (o en inglés, outcome).
    - La navegación estática aplica en los siguientes casos:
     -No se requiere ejecutar código Java del lado del servidor, solo redireccionar la página.
     -No hay lógica para determinar la página siguiente.
    Ejemplo navegación estática:
    - Página JSF que inicia la petición:
    <h:commandButton label="Entrar" action="login"/>
    - La página siguiente se puede determinar en 2 formas:
     a) Outcome por default, busca directamente la página login.xhtml.
     b) Buscar outcome en faces-config.xml encontrando el caso que determina la siguiente página a mostrar.
    Como se puede ver, el action del commandButton tiene de nombre la página a buscar.

    Navegación dinámica
    Utiliza un método conocido como action, el cual tiene lógica para determinar el outcome.
    Ejemplo:
     -Código página JSF (Vista):
     <h:commandButton label="Aceptar" action="#{loginBean.verificarUsuario}"/>
     -Código LoginBean (Controlador):
     public String verificarUsuario() {
       if(...) {
            return "exito"; //Buscara una página llamaad exito.xhtml o, en el archivo faces-config, un caso de navegación que tenga como outcome la palabra exito.
       } else {
            return "fallo"; //Lo mismo que exito pero con la palabra fallo.
       }
     }

    Creación reglas de navegación:
    <faces-config ...>
            <navigation-rule>
                    <from-view-id>/inicio.xhtml</form-view-id> //Esta es la página que iniciara la petición
                    <navigation-case>
                            <from-outcome>entrar</from-outcome>
                            <to-view-id>/login.xhtml</to-view-id>
                    </navigation-case>
                    <navigation-case>
                            <from-outcome>fallo</from-outcome>
                            <to-view-id>/error.xhtml</to-view-id>
                    </navigation-case>
            </navigation-rule>
            ...
    </faces-config>
    Se pueden crear reglas de navegación genericas como volver a la página principal.
    */
}
