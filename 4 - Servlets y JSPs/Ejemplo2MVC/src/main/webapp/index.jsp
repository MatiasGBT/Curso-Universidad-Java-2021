<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo 2 MVC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo 2 MVC</h1>
        <br>
        <div style="color: red">${mensaje}</div>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador">Link al Servlet controlador sin par�metros</a>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregaVariables">
            Link al Servlet controlador para agregar las variables
        </a>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
            Link al Servlet controlador para listar variables
        </a>
    </body>
</html>