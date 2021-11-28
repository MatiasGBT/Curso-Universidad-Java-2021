
<%@page isErrorPage="true"%> <%--Indicamos que esta sera la página que maneje errores--%>
<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Este es el JSP de manejo de errores</title>
    </head>
    <body>
        <h1>Manejo de errores</h1>
        <br>
        <%--Podemos utilizar el objeto exception sin definirlo debido a que indicamos que este es el JSP que maneja las excepciones--%>
        Ocurrio una excepción: <%= exception.getMessage()%>
        <br>
        <!--El atributo columnas y el atributo filas es para que no crezca mucho la página-->
        <textarea cols="30" rows="5">
            <% exception.printStackTrace(new PrintWriter(out));%>
        </textarea>

    </body>
</html>
