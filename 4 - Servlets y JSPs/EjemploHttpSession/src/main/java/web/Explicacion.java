package web;

public class Explicacion {
    /*
    Sesión HTTP:
    El API de los Servlets nos permite administrar las sesiones de los clientes por medio de la clase HttpSession.
    Esto ocurre de manera automatica. Cada petición que realice un cliente hacia nuestro web, crea una nueva sesión
    de manera automatica.
    Si tenemos 2 navegadores web diferentes en una misma pc, cada uno tendra una sesión diferente.
    Una sesión nos va a permitir administrar las peticiones que realiza un usuario. El objeto HttpSession se obtiene
    a partir del objeto HttpServletRequest, por lo que una sesión se utiliza para administrar distintas peticiones del usuario.
    Una sesión tiene una duración de vida más larga que una peticion (el objeto request). Una sesión se destruye cuando
    haya pasado el tiempo que le hemos asignado a la sesión de inactividad, o podemos destruirla manualmente mediante
    el metodo invalidate().

    Manejo de sesiones en Servlets:
    -request.getSession(): Se utiliza para obtener la sesión que se creó a partir de la petición del cliente.
    Se obtiene el objeto HttpSession, la sesión creada se asocia con un cliente que genero la petición.
    -sesion.getAttribute(): Permite obtener un atributo previamente agregado a la sesión del cliente.
    -sesion.setAttribute(): Permite agregar un atributo a la sesión actual del cliente.
    Estos 2 metodos nos permiten leer y agregar información a la sesión.
    -sesion.removeAttribute(): Permite eliminar un atributo agregado a la sesión.
    -sesion.invalidate(): Invalida la sesión actual del cliente.

    Otros metodos importantes:
    -sesion.isNew(): Permite saber si la sesión ha sido recién creada (regresa true o false).
    -sesion.getCreationTime(): Permite conocer la fecha y hora de cuando se creó la sesión.
    -sesion.getLastAccesedTime(): Permite conocer la última vez en la que la sesión fue accedida por el cliente.
    -sesion.getMaxInactiveInterval(): Permite conocer el tiempo de inactividad en segundos necesario para que la sesión
    se destruya si es que no recibe una petición por parte de un cliente.
    -sesion.setMaxInactiveInterval():Permite modificar el valor mencionado en la función anterior. Este valor
    también se puede modificar en el archivo web.xml.
    */
}
