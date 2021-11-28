package utilerias;

public class Explicacion {
    /*
    Directivas en JSPs:
    Las directivas nos permiten controlar el comportamiento de un JSP (por ejemplo las clases que vamos a utilizar
    dentro de un JSP y hacer el import de clases Java, especificar el tipo MIME con el que responderemos al cliente, etc).
    Con el uso de directivas podremos especificar:
    -Las clases Java que queremos importar en un JSP.
    -El tipo MIME utilizado.
    -Indicar si el JSP puede acceder a la sesión HTTP.
    -El tamaño del buffer de salida.
    -Indicar la página JSP en algún caso de excepción.
    -El manejo de multihilos.
    -Etc.

    Atributos en las directivas de un JSP:
    Algunos de los atributos que podemos indicar en la directiva page son:
    -import: <%@ page import="paquete.Clase1, paquete.ClaseN"%> Es una buena práctica poner el import al principio del JSP.
    -contentType: <%@ page contentType="MIME-type"%> (El tipo de respuesta que enviaremos al cliente)
    -session: <%@ page session="true"%> Indicamos si el JSP va a poder acceder al objeto Session que se haya creado anteriormente.
    -isELIgnored: <%@ page isELIgnored="false"%> Indica si queremos deshabilitar el manejo de expression language en nuestro JSP (si es el caso hay que poner true).
    -buffer: <%@ page buffer="tamañoEnKb"%> Permite especificar el tamaño que puede contener nuestro buffer del JSP,
     si llegamos al tamaño especificado en este JSP se realiza un flush (vaciado de manera automatica) de todo el flujo
     que hayamos agregado al objeto PrintWriter o a nuestro putput Servlet.
    -errorPage: <%@ page errorPage="url relativo al jsp de error"%> Con este vamos a especificar cual va a ser el JSP
     que va a manejar la excepción en caso de que el JSP provoque un error.
    -isErrorPage: <%@ page isErrorPage="true"%> Cuando manejamos excepciones con JSP, es común manejar esta directiva en otro JSP.
     Esta directiva ira en los JSP que manejen errores. Por default, los JSPs tienen esta directiva en valor false.
    -isThreadSafe: <%@ page isThreadSafe="true"%> Especificamos que un JSP se considera seguro para ser accedido por
     multiples hilos (el valor por default es true).
    -Extends: <%@ page extends="paquete.NombreClase"%> Nos permite heredar de una clase según especifiquemos.
     Normalmente solo se utiliza si queremos agregar comportamiento de terceros. Este concepto se utilizara unicamente si algún
     software o solución lo requiera.
    */
}
