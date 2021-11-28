
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP con expresiones</title>
    </head>
    <body>
        <h1>JSP con expresiones</h1>
        Concatenación: <%= "Saludos" + " " + "JSP"%>
        <br>
        Operación matematica: <%= 2 * 3 / 2 %>
        <br>
        Session ID: <%= session.getId() %>
        <br>
        <br>
        <a href="index.html">Volver al inicio</a>
    </body>
</html>
