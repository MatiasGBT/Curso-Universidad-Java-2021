package web;

public class Explicación {
    /*
    Un servlet es una clase de Java que permite procesar peticiones web por medio del protocolo
    HTTP. Cuando el cliente hace una petición al servidor web por medio de un sevlet vamos a poder
    procesar dicha petición. En la petición, pueden ir parametros como resultado de ejecutar un link
    o información que provenga de un formulario HTML. De esta manera comienza la comunicación entre cliente y servidor.
    Una vez que el Servlet procesa la petición del cliente y recupera los parametros, normalmente realiza
    un procesamiento, como recuperar información de una Base de Datos o realizar algún calculo del lado
    del servidor. Como resultado de este procesamiento, se vuelve a mostrar información hacia el cliente
    que realizo la petición respectiva.
    
    Un Servlet permite leer información del cliente web (los parametros de una petición), generar una
    respuesta para mostrarle al cliente (generar HTML y archivos binarios como PDF, audio, video, etc.).
    
    Funciones de un Servlet:
    El uso más común sera para controlar el flujo de una aplicación web.
    Un Servlet no es la mejor manera para generar un código HTML. Para esto se creo JSPs.
    En el modelo vista-controlador, el usuario primeramente visualiza información, la cual pudo provenir
    de un JSP o de código estático HTML. Una vez que el cliente visualiza la info, realiza una petición,
    la cual es procesada por nuestro Servlet controlador, el cual se apoya de la información de negocio de
    nuestra aplicación. Una clase JavaBean contiene la información de nuestro modelo. Posteriormente, el Servlet
    decide cual es el JSP que se va a mostrar y le enviara el modelo que necesita para poder desplegar la 
    información al usuario.
    Este patrón modelo vista-controlador, separa las responsabilidades en una aplicación web. Este patrón de
    diseño se aplica en la capa de presentación.
    El Servlet es quien va a tener la tarea de administración de navegación y del flujo de nuestra aplicación web.
    
    Métodos HTTP y procesamiento con Servlets:
    Hay 8 métodos soportados por el protocolo HTTP. Estos son: Option, Get, Head, Post, Delete, Trace y Connect.
    Los más usados son el Get (envía información del cliente hacia el servidor por medio de una URL, el método
    que usa el Servlet para procesar esta petición es doGet()) y Post (envía información en el cuerpo del mensaje,
    no en el URL, utiliza el método doPost()).
    El método Get enviara parametros a nuestro servidor web por medio de la URL, por lo que se podran visualizar
    directamente en la URL del navegador.
    El método Post se envía en el cuerpo del mensaje HTTP, por lo que la información no se va a poder visualizar
    en el URL, si no que se enviara como parte del contenido que recibira el servidor web.
    
    Al crear una clase del tipo Servlet, debemos extender de la clase HTTP Servlet, la cual pertenece al paquete
    Javax.servlet.http. Esta clase que creemos tiene que sobreescribir o el método doGet() o el doPost() según
    la petición enviada por parte del cliente.
    
    Ciclo de vida de un Servlet:
    Un Servlet es una clase, para poder cumplir con su ciclo de vida primeramente debemos compilarla y cargarla en la
    memoria de Java en la máquina virtual, por cada una de las peticiones que se soliciten hacia el Servlet, se creara
    una nueva instancia de Servlet (un subproceso), es decir, se genera un hilo de la clase que ya existe en memoria.
    Esto se hace con la intención de que la creación de un Servlet sea mucho más eficiente y sea más rápida la ejecución
    de las peticiones HTTP procesadas por el Servlet.
    Posteriormente, se llama el metodo init(), el cual es equivalente a un constructor en una clase Java normal, por lo que
    permitira inicializar nuestra clase Servlet en caso de que sea necesario. Este método solo se ejecuta la primera vez
    que se manda a llamar el Servlet.
    Como siguiente paso, una vez que ya tenemos al Servlet funcionando, se ejecuta el método service(), el cual se encargará
    indirectamente de mandar los métodos doGet(), doPost() o cualquiera de los métodos HTTP. Este método NO se debe sobreescribir.
    Solo se debe sobreescribir en caso de que se sepa que se esta realizando con el fin de realizar tareas más avanzadas.
    Por último, una vez que el Servlet termina de procesar las peticiones del usuario, se puede mandar a llamar al método
    destroy(), el cual es equivalente al método finalize() en una clase normal de Java. Esto se usa si queremos liberar
    ciertos recursos de nuestro Servlet.
    */
}
