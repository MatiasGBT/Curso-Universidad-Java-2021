<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y variables implicitas</title>
    </head>
    <body>
        <h1>EL y variables implicitas</h1>
        <ul>
            <%--pageContext es uno de los objetos m�s importantes puesto que podemos acceder a toda la informaci�n
            del JSP que se esta ejecutando mediante este--%>
            <li>Nombre de la aplicaci�n: ${pageContext.request.contextPath}</li>
            <%--Accedemos al tipo de navegador que se esta utilizando--%>
            <li>Navegador del Cliente: ${header["user-agent"]}</li>
            <%--Accedemos al id de la sesi�n--%>
            <li>ID de la sesi�n: ${cookie.JSESSIONID.value}</li>
            <%--Accedemos a la informaci�n del web server que estamos utilizando--%>
            <li>Web server: ${pageContext.servletContext.serverInfo}</li>
            <%--Accedemos al parametro enviado por la p�gina de index--%>
            <li>Valor par�metro: ${param.usuario}</li>
            <li>Valor par�metro: ${param["usuario"]}</li> <%--Tambi�n se puede hacer as�--%>
        </ul>
        <br>
        <br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
