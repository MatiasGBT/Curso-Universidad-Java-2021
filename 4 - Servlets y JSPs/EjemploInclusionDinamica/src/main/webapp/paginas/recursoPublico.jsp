<!-- Como se ejecutan por separado, la página a incluir es posible que necesite la etiqueta HTML así que no la borraremos -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <br>
        Inclusión de contenido dinamico desde un JSP público.
        <br>
        Nombre de la aplicación: <%= request.getContextPath()%>
    </body>
</html>
