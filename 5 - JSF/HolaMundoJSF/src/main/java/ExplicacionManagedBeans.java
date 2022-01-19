
public class ExplicacionManagedBeans {
    /*
    Concepto de Managed Bean:
    - Es una clase de Java que sigue la nomenclatura de los Managed Bean, los cuales no están obligados a extender
    de ninguna otra clase.
    - Aunque JSF no define una clasificación para los Backing Beans, se pueden definir las siguientes:
      -Beans de modelo: Representan el Modelo en el patrón MVC.
      -Beans de control: Representan el Controlador en el patrón MVC.
      -Beans de Soporte (o Helpers): Contienen código por ejemplo de Convertidores.
      -Beans de Utilerías: Se pueden utilizar para tareas genericas como obtener el objeto Request.

    Uso de los ManagedBeans:
    - Un Managed Bean se puede declarar de distintas maneras:
      -Con anotaciones antes del nombre de clase: @ManagedBean
      -Como bean CDI (Context and Dependency Inyection), antes del nombre de la clase: @Named
      Para utilizar este concepto hay que agregar un archivo llamado beans.xml en la carpeta web/WEB-INF
      -Utilizando el archivo faces-config.xml: <managed-bean>...</managed-bean>

    CDI ofrece un modelo más flexible para administrar los beans. Los beans CDI están asociados a un contexto, como
    por ejemplo, request, session, etc.

    Alcance de los ManagedBeans:
    - Request: Persiste solo durante la petición del usuario.
    - View: Persiste si es la misma vista, útil si usamos AJAX.
    - Session: Persiste durante el tiempo de la sesión del usuario.
    - Application: Persiste durante toda la aplicación.

    CDI y alcance de Beans:
    - La única diferencia es el alcance de View, el cual es reemplazado por el alcance de Conversation, el cual persiste
    hasta completar alguna tarea.
    */
}
