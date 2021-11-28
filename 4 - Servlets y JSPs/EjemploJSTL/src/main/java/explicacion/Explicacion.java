package explicacion;

public class Explicacion {
    /*
    JSTL (JavaServer Pages Standard Tag Library):
    JSTL extiende los tags de los JSPs, agregando principalmente las siguientes librerías:
     - core: Permite leer y manipular datos, así como iterar, agregar condiciones y otras funciones básicas.
     - xml: Permite la manipulación y transformación de documentos XML.
     - sql: Permite ejecutar consultas a una Base de Datos, asi como crear conexiones a las mismas.
     - fmt: Permite dar formato a las cadenas, apoyado de conceptos como Internacionalización (Locale).

    Configuración de JSTL:
    -Agregar las siguientes librerías al Classpath (no es necesario si el servidor Web como Flassfish ya cuenta
    con estas librerías). Deberemos agregar los siguientes jar al Classpath de nuestro proyecto:
     - standar.jar
     - jstl.jar
    -Configuración de la directiva JSP (debemos de agregar alguna configuración/directiva a nuestro JSP):
     - JSP clásico: <%@ taglib uri="http://java.sun.com/jstlcore" prefix="c" %>
     - Documento JSP(si estamos utilizando la sintaxis de JSPX):
     xmlns:c="http://java.sun.com/jsp/jstl/core"
     xmlns:jsp="http://java.sun.com/JSP/page"
     Agregando estos elementos ya estamos configurando correctamente nuestros JSPs para poder utilizar las librerías
     de jstl en nuestro proyecto.

    Librería core de JSTL:
    -En esta librería tenemos por ejemplo tags de despliegue de información: <c:out value="${persona.nombre}">
    (prefijo c + ":" + nombreFunción).
    -A su vez, tenemos tags de creación y manipulación de variables: <c:set var="nombre" value="Carlos" scope="page"/>
    -Tags de Elementos condicionales: <c:if test=""${i>0}"/> y <c:choose/> <c:when test="a">
    -Tags de Iteración de elementos (arreglos o conexiones, es uno de los elementos más utilizados):
     <c:forEach var="persona" item="${personas}"/>
    Más elementos de esta librería:
    -Tags de importación de recursos web: <c:import url="recursoInternoExterno">.
    -Tags de redireccionamiento: <c:redirect url="${nuevaUrl}"/>
    -Tags de manejo de parámetros:
            <c:import url="c-import-param.jsp">.
                    <c:param name="nombre" value="${param.select}"/>
            </c:import>.
    */
}
