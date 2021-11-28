
<%--Abrimos un scriplet para recuperar el parametro del formulario--%>
<% 
    String fondo=request.getParameter("colorFondo");
    if(fondo==null || fondo.trim().equals("")) {
        fondo="white"; //Asignamos un color por default
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP cambio de color</title>
    </head>
    <%--En el body con el atributo background color utilizamos una expresión para insertar el color--%>
    <body bgcolor="<%= fondo %>">
        <h1>JSP cambio de color</h1>
        <br>
        Color de fondo aplicado: <%= fondo %>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
