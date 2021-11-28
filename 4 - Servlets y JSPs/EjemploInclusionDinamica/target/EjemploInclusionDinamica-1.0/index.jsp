
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclusión Dinámica</title>
    </head>
    <body>
        <h1>Ejemplo Inclusión Dinámica</h1>
        <br>
        <jsp:include page="paginas/recursoPublico.jsp"/>
        <br>
        <%--Vamos a pasar un parametro a este JSP para que podamos ver como es posible
        enviar información a los JSPs que se van a incluir--%>
        <%--Enviamos un parametro llamado colorFondo con el valor de yellow--%>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yellow"/> 
        </jsp:include>
    </body>
</html>
