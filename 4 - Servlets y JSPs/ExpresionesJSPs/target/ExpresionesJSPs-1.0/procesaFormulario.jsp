
<%--Se puede quitar la directiva o la etiqueta meta--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa formulario</title>
    </head>
    <body>
        <h1>Resultadod e procesar el formulario</h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br>
        Password: <%= request.getParameter("password") %>
        <br>
        <br>
        <a href="index.html">Volver la inicio</a>
    </body>
</html>
