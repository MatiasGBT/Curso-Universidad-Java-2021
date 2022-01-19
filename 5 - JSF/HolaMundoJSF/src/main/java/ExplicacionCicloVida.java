
public class ExplicacionCicloVida {
    /*
    Ciclo de vida de JSF:
    Comienza con una petición de un usuario, el cual solicita un recurso de nuestro servidor web.
    La primera fase de este ciclo de vida es el proceso de restauración o creación de la vista. Si es la primera
    vez que se solicita esta vista, se va a crear cada uno de los componentes que representan las etiquetas
    de nuestra página JSF y tendra una clase correspondiente de Java que represente esa etiqueta en JSF.
    Todas estas etiquetas son administradas por un componente principal llamado Component Tree.
    En caso de que la petición sea GET o sin parametros, el framework no tiene nada que realizar y solo devuelve la
    respuesta al cliente.
    En caso contrario, osea, si necesitamos procesar información, el paso 2 es aplicar los valores de la petición,
    es decir, los parametros enviados son mapeados con cada uno de los componentes Java correspondientes, lo que permite
    llenar la información que los usuarios envían a nuestra aplicación Java.
    El paso 3 es el proceso de validaciones y conversiones. En el paso 2 se asignan los valores correspondientes
    a las clases Java, pero no se sabe si esos valores son los adecuados o es encesario convertirlos a cierto tipo de dato.
    Si alguna validación de este paso falla, el estado del componente Java se marca como invalido y se pasa directamente al
    estado 6 (el de mostrar la información al cliente). Aun así, la aplicación continúa.
    En caso de que no haya errores de validación, en el paso 4 se actualizan los valores de las clases de modelo.
    En el paso 5 se invocan los métodos que procesan las peticiones de los usuarios. En este paso, se ejecutan los métodos
    action almacenados en los Managed Beans. Los métodos action listener son llamados antes que los métodos action.
    Una vez procesados los métodos de nuestra aplicación, se genera una respuesta respectiva hacia el cliente, terminando
    el ciclo de vida de la aplicación.
    */
}
