package beans;

public class Explicacion {
    /*
    Manejo de JavaBeans con JSPs:
    -Los JSPs pueden acceder a los JavaBeans.
    -Hay que recordar que un JavaBean es una clase de Java que sigue ciertas reglas básicas:
     - Debe tener un constructor vacío.
     - Todos sus atributos deben de ser privados.
     - Cada atributo debe tener su método get y set.
    -Un JSP debe utilizar el nombre de la propiedad para acceder o modificar el atributo de un JavaBean.
    -Indirectamente el JSP manda a llamar al método get o set asociado con la propiedad indicada en el JSP.

    Alcance de atributos en un JSP (scope):
    El alcance de una variable es la duración o tiempo de uso de una variable en una aplicación web.
    Hay 4 alcances:
     1-page: Este es el alcance más básico, solo se utiliza dentro de los JSP. Un atributo con este alcance solamente
     va a existir durante el tiempo en el que se traduce un JSP hacia un Servlet. Una variable con este alcance no va
     a poder ser utilizada posteriormente al tiempo de ejecución de un JSP a un Servlet.
     2-request: Las variables que pongamos en este alcance unicamente van a existir durante el tiempo en el que un usuario
     haga una petición hacia nuestro servidor web, una vez que llega esta información al servidor, se destruye. Si
     volvieramos a hacer una nueva petición, las variables almacenadas en el alcance de request se destruirían, por ende
     el alcance de request solo existe durante una única petición, pero no durante peticiones subsiguientes.
     3-session: Una variable en este alcance va a durar durante distintas peticiones hacia nuestro servidor web, es decir,
     va a existir durante el tiempo de vida en el que realicemos peticiones entre nuestro cliente y nuestro servidor.
     4-application: Cuando agreguemos información a este alcance, va a existir durante todo el tiempo que este arriba
     nuestra aplicación y se destruirá cuando detengamos nuestro servidor web o que hagamos un undeploy de nuestra aplicación.

    Uso básico de los JavaBeans:
    Podemos utilizar las siguientes acciones en los JSPs:
    -jsp:Bean: Permite acceder a un bean en un alcance (scope) especificado. Se puede o no expecificar el alcance, pero si
    no lo hacemos dentro de nuestra sintaxis, el alcance por default es del tipo page.
    Ejemplo: <jsp:useBean id="nombreBean" class="paquete.NombreClase"/>
    -jsp:setProperty: Permite modificar una o varias propiedades de un bean especificado.
    Ejemplo: <jsp:setProperty name="nombreBean" property="nombreUsuario" value="Juan"/>
    -jsp:getProperty: Permite acceder a una propiedad de un bean especificado.
    Ejemplo: <jsp:getProperty name="nombreBean" property="nombreUsuario"/>
    */
}
