<!-- Como se ejecutan por separado, la p�gina a incluir es posible que necesite la etiqueta HTML as� que no la borraremos -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <br>
        Inclusi�n de contenido dinamico desde un JSP p�blico.
        <br>
        Nombre de la aplicaci�n: <%= request.getContextPath()%>
    </body>
</html>
