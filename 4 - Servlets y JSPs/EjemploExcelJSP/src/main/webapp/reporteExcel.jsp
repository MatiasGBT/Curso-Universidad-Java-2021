
<%--
Este JSP no va a responder contenido HTML, sino que el contenido que va a responder es del tipo Excel.
Por esto quitamos la directiva de tipo text/html (la reemplazamos con la de excel) y la etiqueta meta.
--%>

<%@page errorPage="/WEB-INF/manejoErrores.jsp" %>
<%-- Con esto indicamos el JSP que manejara las excepciones (ver linea 37).
Se recomienda que estos JSP sean privados para esto tiene que estar dentro de la carpeta WEB-INF.
Todos los recursos que esten en esta carpeta no podran ser accesibles directamente desde el navegador.--%>

<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%-- Agregamos un Scriplet para indicar el nombre del archivo que vamos a generar --%>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte Excel</h1>
        <br>
        <table border="1">
            <tr> <!-- Rengl�n -->
                <th>Curso</th>
                <th>Descripci�n</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis b�sica de Java</td>
                <td><%= Conversiones.formato(new Date())%></td> <!-- Utilizamos una expresi�n de JSP -->
            </tr>
            <tr>
                <td>2. Programaci�n con Java</td>
                <td>Pondremos en pr�ctica conceptos de la programaci�n orientada a objetos.</td>
                <td><%= Conversiones.formato("500")%></td> <!-- Para probar el manejo de excepciones vamos a poner un error a proposito -->
                <!-- Para soportar este valor de 500, hay que sobrecargar el metodo formato en la clase de Conversiones -->
            </tr>
        </table>
    </body>
</html>
