package web;

public class Explicacion {
    /*
    Cabeceros de respuesta con Servlets:
    Se utilizan para indicar al navegador web como comportarse ante una respuesta de parte del servidor Web.
    Un ejemplo común es generar hojas de Excel, PDFs, audio, video, etc en lugar de responder solamente con texto.
    Para indicar el tipo de respuesta, se utilizan los tipos MIME (Multiporpose Internet Mail Extensions). Son un conjunto
    de específicaciones con el objetivo de intercambiar archivos a través de internet, como puede ser texto, audio,
    video u otros tipos.
    Ejemplos más comunes de tipos MIME:
    Para comenzar, tenemos que especificar el nombre del tipo MIME, por ejemplo, si nuestro servidor Web
    tiene que mostrar como resultado un documento de tipo microsoft Word. Para esto, especificamos del lado
    del servidor el tipo que especificaremos a nuestro cliente, en este caso, application/msword (Microsoft Word).
    También puede haber tipos MIME como application/pdf (Acrobat .pdf), application/vnd.ms-excel (Excel spreedsheet),
    application/vnd.ms-powerpoint (Powerpoint presentation), application/zip (zip archive), etc.

    API de Servlets al utilizar cabeceros de respuesta:
    Los métodos para establecer los valores de los headers (utilizaremos el objeto response):
    -setHeader(String nombreCabecero, String valorCabecero).
    -setDateHeader y setIntHeader ponen un cabecero, si ya existe, lo reemplaza.
    Para agregar cabeceros:
    -addHeader, addDateHeader y addIntHeader agregan nuevos valores en vez de reemplazarlos.
    Métodos más comunes para establecer valores en los Headers:
    -setContentType (Se utiliza la tabla MIME para definir el valor del tipo de respuesta que enviaremos al cliente).
    -setContentLenght. Sirve para especificar el largo del contenido que vamos a responder hacia el cliente.
    -addCookie.
    -sendRedirect.

    Cabeceros de respuesta más comunes:
    -Cache-control y Pragma: Se usan para el control del cache. Sirven para indicar el cache a nuestro cliente.
    -Content-Encoding: Indica la codificación del documento que vamos a enviar.
    -Content-Length: Indica el numero de bytes de la respuesta.
    -Content-Type: Indica el tipo MIME a responder.
    -Expires: Indica el tiempo en el que el documento se considera expirado.
    -Last-Modified: Indica el tiempo en el que el documento fue modificado.
    -Refresh: Indica los segundos en que el navegador recarga la página.
    -Set-Cookie: Agrega una cookie al navegador.
    -WWW-Authenticate: Indica el tipo de autenticación.
    */
}
