
public class Explicacion {
    /*
    JavaServer Faces (JSF) es una tecnología creada para facilitar la creación de la interfaz de usuario para aplicaciones web Java.
    JSF es el marco de aplicacioens web estándar para Java Enterprise Edition (Java EE).

    Características de JSF:
    - Implementa el patrón de diseño MVC.
    - Agiliza el desarrollo de aplicacioens web para Java.
    - JSF provee un API para crear elementos HTML complejos, incluyendo de manera embebida dentro del componente tecnología como
    JavaScript y CSS, lo que permite realizar componentes reutilizables.
    - Render-Kits: Los componentes pueden desplegarse no solamente en navegadores Web, sino también en dispositivos móviles u otros
    tipos de clientes.
    - JSF permite crear facilmente nuevos componentes por lo que existen varios frameworks que extienden
    el poder de JSF, como AJAX.
    - Las vistas pueden mostrarse en distintos idiomas, lo que se conoce como internacionalización.
    - Soporte por default de los Facelets.

    Tecnología de los Facelets:
    - Son la tecnología estándar de despliegue JSF.
    - Pueden ser hasta un 30% más rápidos en el análisis y elaboración de páginas en JSF.
    - Fueron creados teniendo en cuenta el ciclo de vida de JSF.
    - Al ejecutar un Facelet, todos los componentes JSF se convierten a instancias Java y son administradas por un Component Tree.
    - Todos los componentes JSF se derivan de la clase abstracta javax.faces.component.UIComponent.
    - El estado de los componentes (Component Tree) puede almacenarse del lado del cliente o del lado del servidor.

    Flujo de navegación en JSF:
    1- El framework inicia una petición GET a una página, como puede ser index.xhtml.
    2- El usuario el contenido de respuesta y envía una petición POST o una petición GET al servidor web, solicitando cierto recurso.
    3- El servidor web revisa la petición y los ManagedBeans involucrados en esta (si es necesario, crea una instancia
    de ellos dependiendo de su alcance, también puede llamar los métodos setters de las propiedades del Bean que se deben llenar).
    4- Ejecuta el método controlador.
    5- El controlador ejecuta la lógica de negocio con el objetivo de obtener el modelo de la petición.
    6- Se redirecciona a la vista correspondiente (Facelet o JSP).
    7- La vista utiliza la información de modelo compartida por la aplicación JSF para regresar la respuesta solicitada
    al cliente.
     */
}
