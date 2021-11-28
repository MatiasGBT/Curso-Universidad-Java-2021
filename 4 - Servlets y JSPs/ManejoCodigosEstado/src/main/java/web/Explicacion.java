package web;

public class Explicacion {
    /*
    Los códigos de estado se utilizan para indicar el estado de la respuesta del servidor web hacia el cliente, es decir,
    hacia el navegador web.

    API de Servlets al utilizar los códigos de Estado:
    -Métodos más utilizados para manejar los códigos de Estado desde nuestro servidor web:
	Por medio de el objeto HttpServletResponse del API de los Servlets, vamos a utilizar
	cualquiera de estos métodos para indicar al navegador web el status de respuesta del
	servidor hacia el cliente.
	-setStatus(int código): Indicamos con un número el código de estado de nuestro servidor
	hacia el cliente (generalmente se utilizan constantes ej: SC_OK, SC_NOT_FOUND).
	-sendError(int código, String error): A su vez, podemos indicar un mensaje de error.
	-sendRedirect(String url): Específicamos una URL a la cual redirigirá a nuestro cliente.
	El código de estado en este método es el 302.
    -Códigos de estado más comunes:
	-200(OK): La respuesta es correcta, es el código de estado por default.
	-204(Sin contenido): El navegador continua dedsplegando el documento previo.
	-301(Movimiento permanente): El documento solicitado ha cambiado de ubicación, y posiblemente
	se indique la nueva ruta, en ese caso, el navegador se redirige automaticamente a la nueva página.
	-302(Encontrado): El documento se a movido temporalmente, el navegador se redirige automaticamente
	a la nueva url.
	-401(Sin autorización): No se tiene permiso para visualizar el contenido solicitado, debido a que
	se trató de acceder a un recurso protegido con contraseña sin la autorización respectiva.
	-404(No encontrado): El recurso solicitado no se encuentra en el servidor web.
	-500(Error interno en el servidor web): El servidor web lanzó una excepción irrecuperable y por lo
	tanto no se puede continuar procesando la petición.
    */
}
