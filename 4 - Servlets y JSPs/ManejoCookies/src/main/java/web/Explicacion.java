package web;

public class Explicacion {
    /*
    Manejo de sesiones con Servlets:
    Una sesión en una aplicación web permite administrar varias peticiones de un mismo usuario. Esta necesidad
    surge debido a que el protocolo HTTP no recuerda información (protocolo de tipo stateless).
    Esto significa que entre petición y petición de cierto usuario, no recordara ninguna información del mismo.
    Las sesiones en los Servlets se pueden manejar por medio de 2 mecanismos:
    -Cookies (Es el que se estudiara en esta sección).
    -URL Rewritting.
    El API de los Servlets abstrae estos conceptos de una clase llamada HTTPSessions.

    Concepto y uso de cookies:
    Se usan para recordar información del usuario. Una cookie es un archivo que contiene información en forma de nombre
    y valor, el cual se almacena en el navegador Web.
    Su objetivo es almacenar información del usuario cada vez que accede a un mismo sitio, como puede ser el lenguaje preferido,
    colores preferidos y en general preferencias del usuario.
    Las cookies no se deben utilizar para almacenar información sensible como passwords, tarjetas de crédito, etc,
    debido a que la información almacenada es texto plano sin ningún tipo de encriptación.
    En Java, los Servlets pueden crear este tipo de objetos y enviar información  hacia el navegador Web. A su vez,
    también podemos leer las cookies que el navegador envíe a nuestro servidor Web por medio del API de los Servlets
    utilizando el objeto Cookie, este se encuentra en el paquete javax.servlet.http.
    El objeto cookie nos permitira almacenar información del usuario, ya sea para leer nueva información que este llegando
    o para mandar información hacia el navegador web. Todo esto se debe de relacionar con un mismo sitio web.

    API de las cookies en los Servlets:
    Una cookie se puede leer en una petición HTTP (por ejemplo iterando el arreglo de Cookies) y se puede escribir
    en una respuesta HTTP.
    Para crear un objeto de tipo Cookie podemos utilizar el siguiente código:
    Cookie c=new Cookie("usuario","Juan"); en este caso creamos una cookie llamada usuario y el valor es Juan.
    c.getName(); para obtener por ejemplo el nombre (regresaría usuario) o c.getValue():
    para obtener el valor (regresaría Juan).
    Métodos para leer Cookies en una petición HTTP:
    Cookie[] cookies=request.getCookies();
    Todos los valores que se almacenan en una Cookie son de tipo String.
    Método para agregar una cookie en la respuesta HTTP:
    response.addCookie(c);

    API del objeto Cookie:
    Métodos más comunes de un objeto Cookie:
    -getDomain/setDomain: Se utiliza para especificar el dominion de donde proviene o se va a almacenar la Cookie.
    -getMaxAge/setMaxAge: Expecífica el tiempo a expirar (en segundos).
    -getName(): Obtiene el nombre de la Cookie. Para colocar el nombre se debe usar el constructor de la clase.
    -getValue/setValue: Especifica el valor asociado con el nombre de la Cookie.
    */
}
