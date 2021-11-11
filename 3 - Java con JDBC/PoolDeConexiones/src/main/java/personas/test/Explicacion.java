package personas.test;

public class Explicacion {
    /*
    Hasta el momento obteniamos una conexión a la BD de manera indivicual con la clase de DriverManager y el método
    getConnection(). En una aplicación empresarial sera necesario utilizar muchas conexiones, y crear una nueva conexión
    tiene un gran impacto en los recursos, por lo que es conveniente es manejar un pool de conexiones.
    Un pool de conexiones permite agilizar el proceso de obtener una conexión por cada clase de Java que necesite de una.
    Su objetivo es tener listo varias conexiones a la Base de datos de manera que sea más eficiente el proceso de obtener
    y liberar una conexión a esta. El proceso de administración de una conexión se delega al pool de conexiones, por
    lo que ya no tendríamos que abrir y cerrar una conexión.
    Para crear un pool de conexiones hay varias maneras, por ejemplo, creandolo por código Java (tendremos que
    mantener nosotros mismos el código) o utilizar algún proyecto como el de JDBC de Apache. También podemos apoyarnos
    del servidor de aplicaciones como Tomcat, Glassfish, WildFly, etc. Estos se encargarían de administrar el pool
    de conexiones.

    Para manejar un pool de conexiones con Apache Commons dbcp2 (una dependencia) tenemos que abrir el archivo
    pom.xml y agregamos una dependencia más escribiendo las etiquetas <dependency> (y la de cierre) dentro de
    la etiqueta <dependencies>. Agregamos lo siguiente dentro de la dependencia:
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-dbcp2</artifactId>
    <version>2.9.0</version> ACA DALE CTRL + ESPACIO DENTRO DE LAS ETIQUETAS Y PONE LA ULTIMA VERSION.
    Ahora para descargar la libreria le damos click derecho a nuestro proyecto y le damos Clean and Build.
    */
}
