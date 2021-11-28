<%--Importamos el taglib necesario para implementar la librer�a JSTL Core--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--Esto no va a buscar en internet sino que va a buscar dentro de las dependencias que tenemos en neustro proyecto--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core (Jsp Standard Tag Library)</h1>
        <%--Utilizamos la manipulaci�n de variables--%>
        <c:set var="nombre" value="Ernesto"/>
        Variable nombre: <c:out value="${nombre}"/>
        <br>
        <br>
        <%--Definimos variable con c�digo HTML--%>
        Variable con c�digo HTML: <c:out value="<h4>Hola</h4>" escapeXml="false"/> <%--escapeXml es para que no escape los caracteres de HTML--%>
        <br>
        <br>
        <%--C�digo condicionado (con if)--%>
        <c:set var="bandera" value="true"/>
        <c:if test="${bandera}">
            La bandera es verdadera.
        </c:if>
        <br>
        <%--C�digo condicionado (con switch)--%>
        <c:if test="${param.opcion!=null}">
            <c:choose>
                <c:when test="${param.opcion==1}">
                    <br>
                    Opci�n 1 seleccionada.
                </c:when>
                <c:when test="${param.opcion==2}">
                    <br>
                    Opci�n 2 seleccionada.
                </c:when>
                <c:otherwise>
                    <br>
                    Opci�n proporcionada desconocida: ${param.opcion} <%--Opci�n default del Switch--%>
                </c:otherwise>
            </c:choose>
        </c:if>
        <%--Iteraci�n de un arreglo (utilizamos un scriplet para definir esta variable)--%>
        <%
            String nombres[]={"Claudia","Pedro","Juan"};
            request.setAttribute("nombres", nombres); //la cadena que esta entre comillas ("nombres") es la que usaremos en Expression Language
        %>
        <br>
        <br>
        Lista de nombres:
        <br>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>${persona}</li>
            </c:forEach>
        </ul>
        <br>
        <a href="index.jsp">Regresar al incio</a>
    </body>
</html>
