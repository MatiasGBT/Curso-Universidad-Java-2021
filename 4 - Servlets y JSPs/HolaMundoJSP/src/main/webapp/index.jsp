
<%--
Así se agregan comentarios en un archivo .jsp

Los JSP son componentes del lado del servidor que incluso pueden hacer llamadas
a bases de datos, NO son simples páginas HTML.
--%>

<%--Librería JSLT (taglib):--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--El uri no se busca en internet, sino en las dependencias que tenemos en la libreria javaee-api8.0--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> <%--Esto es la directiva--%>
<%--Sin saberlo, estamos utilizando el concepto de directiva, estas sirven para especificar
varias cosas como el tipo de contenido y el pageEncode, las cuales se especificaban con el
objeto response en los Servlets
Existen distintos tipos de directivas, como por ejemplo para incluir un archivo (include), page,
taglib (para utilizar algunas librerias de jsp). JSP esta enfocado en utilizar código HTML e incrustar código Java.
--%>
<!DOCTYPE html>
<html>
    <head>
        <!-- La etiqueta de meta no hace falta debido a que ya usamos la directiva de page -->
        <title>Hola Mundo JSP´s</title>
    </head>
    <body>
        <h1>Hola Mundo JSP´s</h1>
        <%--
        Opciones para incrustar código Java:
        "<%" Es un Scriptlet
        "<%!" Es para declarar una variable
        "<%--" Es para comentar
        "<%=" Es una expresión (mandar a imprimir un valor como si fuese out.print).
        --%>
        <ul>
            <%-- A diferencia de los Servlets, con los JSP tenemos disponible de manera automatica algunas variables
            como por ejemplo out que es del tipo PrintWriter--%>
            <li> <% out.print("Hola mundo con Scriplets"); %> </li>
            <%--Utilizamos "Expression Language" para imprimir información
            a nuestro cliente, se utiliza el caracter de moneda y los corchetes.--%>
            <li>${"Hola mundo con Expression Language (EL)"}</li>
            <%--Utilizamos una expresión, estas sirven para utilizar de manera interna la variable out--%>
            <li> <%= "Hola mundo con expresiones" %> </li>
            <%--Utilizando la libreria de JSTL, para utilizarla hay que definir arriba del archivo la libreria a utilizar
            La utilizaremos con el prefijo c que definimos arriba--%>
            <li> <c:out value="Hola mundo con JSTL"></c:out> </li>
        </ul>
    </body>
</html>

<%--
Hay que recordar que este JSP genero un Servlet, si le damos click derecho al
archivo index.jsp y le damos a la opción de View Servlet, podremos visualizarlo.
--%>