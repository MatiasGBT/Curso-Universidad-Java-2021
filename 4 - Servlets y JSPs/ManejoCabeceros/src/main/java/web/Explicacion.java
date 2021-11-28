package web;

public class Explicacion {
    /*
    Cabeceros de petición (request headers):

    Permiten obtener metadatos de la petición HTTP, por ejemplo, el método HTTP utilizado en la petición (get, post, etc).
    También se puede recuperar la ip del equipo que realizó la petición al servidor,
    el dominio del equipo que realizo la petición (ej: www.mydomain.com),
    el recurso solicitado (ej: http://mydomain.com/recurso),
    el navegador que se utilizo en la petición (Mozilla, Chrome, etc.) y
    varios cabeceros más.

    Métodos para procesar peticiones HTTP:
            Estos métodos nos permiten procesar los cabeceros, y son los siguientes:
            (Estos métodos se encuentran en el objeto HttpServletRequest).
            -getHeader() //Permite procesar un cabecero a la vez
            -getHeaders() //Nos regresa todos los nombres en una enumeración de Java que corresponde con los cabeceros de la petición HTTP.
            -getHeaderNames() //Permite recuperar todos los nombres relacionados con los cabeceros en la petición HTTP
                    Métodos con información relativa al contexto:
                            -getMethod() //Regresa información referente al tipo de método ejecutado (get, post, etc).
                            -getRequiestURI() //Permite obtener la URI con la cual se solicito el recurso web.
                            -getQueryString() //Permite recuperar los parametros posteriores al signo de interrogación en una petición get.
                            -getProtocol() //Indica que protocolo se utilizo (http o ftp, etc).
                    Métodos más especializados:
                            -getCookies() //Permite obtener todas las cookies que se almacenan en una petición HTTP.
                            //Una cookie es un archivo utilizado en el navegador web para guardar ciertas preferencias del usuario en el momento en que este utiliza el sitio.
                            -getAuthType() y getRemoteUser() //Sirven para procesar la seguridad en el API de los Servlets y JSPs.
                            -getContentLenght() //Permite obtener el largo de nuestra petición.
                            -getContentType() //Permite obtener el tipo de nuestra petición.
                            -getDataHeader() //Fechas.
                            -getIntHeader() //Tipos enteros.
    Estos métodos están definidos dentro del API de los Servlets en la clase HttpServletRequest.
    */
}
