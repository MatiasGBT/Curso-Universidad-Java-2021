<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y variables implicitas</title>
    </head>
    <body>
        <h1>EL y variables implicitas</h1>
        <ul>
            <%--pageContext es uno de los objetos más importantes puesto que podemos acceder a toda la información
            del JSP que se esta ejecutando mediante este--%>
            <li>Nombre de la aplicación: ${pageContext.request.contextPath}</li>
            <%--Accedemos al tipo de navegador que se esta utilizando--%>
            <li>Navegador del Cliente: ${header["user-agent"]}</li>
            <%--Accedemos al id de la sesión--%>
            <li>ID de la sesión: ${cookie.JSESSIONID.value}</li>
            <%--Accedemos a la información del web server que estamos utilizando--%>
            <li>Web server: ${pageContext.servletContext.serverInfo}</li>
            <%--Accedemos al parametro enviado por la página de index--%>
            <li>Valor parámetro: ${param.usuario}</li>
            <li>Valor parámetro: ${param["usuario"]}</li> <%--También se puede hacer así--%>
        </ul>
        <br>
        <br>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>
