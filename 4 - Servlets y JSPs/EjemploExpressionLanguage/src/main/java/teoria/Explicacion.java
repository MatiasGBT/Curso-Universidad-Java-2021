package teoria;

public class Explicacion {
    /*
    Expression Language (EL):
    EL nos permite sinplificar el despliegue de información en un JSP utilizando JavaBeans.
    Sintaxis con acciones JSP:
     - <jsp:useBean id="nombreBean" class="ClaseBean"/>
     - <jsp:getProperty name="nombreBean" propiedad="nombrePropiedad"/>
    Sintaxis con Expression Language:
     - ${nombreBean.nombrePropiedad} Esta es una forma (la más común), también se puede usar:
     - ${nombreBean["nombrePropiedad"]} Es como un arreglo.

    Caracteristicas de EL:
    -Los objetos JavaBean se deben agregar previamente en algún alcance (scope) por medio
    del método setAttribute() en un Servlet:
     - page.
     - request.
     - session.
     - application.
    -La notación es muy simplificada, pero solo permite la lectura de la información (getters). no existe notación
    para la modificación de los atributos en un JavaBeans (setters).
    -Permite acceder a propiedades de un JavaBean de manera anidada. Ej: ${alumno.direccion.calle}.

    Más características de EL:
    -EL también nos permite acceder a propiedades de un objeto de tipo colección o arreglos. Ej: ${listaPersonas[índice/llave]}.
     (nota: no es posible iterar arrelgos, para ello se necesita JSTL, se ve en el prox capitulo del curso).
    -Con EL obtenemos conversiones automáticas de tipos de datos al desplegar información.
    -Manejo automático de valores null o vacíos, convirtiendolos en cadenas vacías (y así evitar errores como nullPointerException).
    -Podemos manejar algunos operadores básicos:
     - ${3+2-1}
     - ${"x">"y"}
     - ${3>=10/2}
     - Esto no es una buena práctica ya que estamos utilizando lógica en nuestras páginas y el objetico es que todas las
     operaciones se realicen desde las clases Java, los JSPs deben enfocarse unicamente en desplegar información.

    Acceso a variables implícitas con EL:
    -Con EL podemos acceder a algunos objetos implicitos tal como lo podemos hacer también con JSPs.
     Objeto pagecontext ej: 4{pageContext.session.id}
    -También podemos acceder a valores de algunos parametros por medio de las variables param y paramValues.
     Ej: ${param.nombre}
    -También podemos acceder a algunos valores de cabeceros con header y headerValues.
     Ej: ${header["user-agent"]} también podemos utilizar ${header.user-agent}
    -También podemos acceder al objeto cookie.  Ej: ${cookie.nombreCookie.value}
    -A su vez, podemos acceder a los atributos agregados en algún alcance utilizando las variables pageScope, requestScope,
     sessionScope y applicationScope. Ej: ${sessionScope.rectangulo.area} ó ${rectangulo.area} (esto es lo más común).
    */
}
