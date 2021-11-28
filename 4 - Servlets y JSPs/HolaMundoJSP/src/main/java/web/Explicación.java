package web;

public class Explicación {
    /*
    NOTA: Quitamos el archivo index.html de la carpeta Web Pages debido a que este sería el que se muestra por default,
    sin embargo, en lugar de utilizar código html utilizaremos un archivo JSP (reemplazamos el index.html por index.jsp).
    La librería de JSP se encuentra en el archivo pom.xml, enbebida dentro de la librería de Javaee-api.
    
    Conceptos básicos de los JSP (Java Server Pages):
    Son componentes del lado del servidor web, los cuales están especializados en manejar código HTML e incrustar código
    Java por medio de etiquetas (tags). Los JSPs son utilizados como componentes de presentación, es decir, permiten
    mostrar la información procesada por otros componentes como pueden ser los Servlets.
    Un JSP al compilarse crea de manera indirecta un Servlet asociado a este. El Servlet asociado se genera de manera
    automatica y al vuelo (no hace falta especificar nada respecto a la compilación de nuestro JSP). El ciclo de vida
    de un JSP es muy similar al de un Servlet.

    Beneficios de los JSP:
    - Permiten enfocarnos en escribir código HTML, haciendo más sencillo el mantenimiento de la capa de presentación.
    - Permiten utilizar herramientas de diseño para crear visualmente las páginas HTML (ej: Dreamviewer) e incrustar
      las etiquetas dinámicas de los JSP´s.
    - Nos permitiran separar el código de presentación del código de Java.
    - Cada miembro del equipo de desarrollo se puede enfocar en distintas tareas al separar las responsabilidades
      de cada parte del programa.
    - Un desarrollador que no tenga conocimientos de Java pero si de HTML puede modificar los JSP sin
      afectar su lógica de programación.
    Nota: Los JSP pueden contener código Java complejo pero no es una buena práctica puesto que podrían convertirse
    en poco mantenibles y solamente se podrían entender por el desarrollador que creo este JSP.

    Funciones/rol de un JSP:
    - Un JSP contiene código HTML y, a través de etiquetas, vamos a agregar nuestro código Java para poder manejar la
      cuestión dinamica dentro de nuestra aplicación web.
    - Un JSP se utiliza como un componente de presentación, por lo que "jugaran" el rol de la vista, es decir, permitiran
      mostrar la información que reciban del Servlet y, a su vez, podrán mandar información hacia este.

    Ciclo de vida de un JSP:
    1-Un JSP se debe traducir a un Servlet (se compila y se carga la clase del Servlet).
    Una vez ocurre esto, el JSP tendrá el mismo ciclo de vida que un Servlet, es decir:
    2-Se crea un subproceso del Servlet (conocido como un hilo).
    3-Se ejecuta el método init().
    4-Se ejecuta el método service().
    5-Se ejecuta el método destroy().
    */
}
