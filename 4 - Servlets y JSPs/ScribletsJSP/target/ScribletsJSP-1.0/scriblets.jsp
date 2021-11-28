

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriblets</title>
    </head>
    <body>
        <h1>JSP con Scriblets</h1>
        <br>
        <%--Un comentario de JSP no se muestra al navegador, uno de HTML s�.
        Scriblet para enviar informaci�n al navegador:--%>
        <% out.print("Saludos desde un Scriblet"); %>
        <%--Scriblet para manipular los objetos implicitos--%>
        <br>
        <% 
            String nombreAplicacion=request.getContextPath();
            out.print("Nombre de la aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%--Scriblet con c�digo condicionado--%>
        <% 
            if(session!=null && session.isNew()) {   
        %>
        La sesi�n es nueva.
        <% 
            } else if(session!=null) {   
        %>
        La sesi�n no es nueva.
        <% } %>
        <%--Esto no es buena pr�ctica, simplemente es para ver que existe--%>
        
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
