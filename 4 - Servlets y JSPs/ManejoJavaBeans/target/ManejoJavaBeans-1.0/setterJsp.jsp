<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica a un JavaBean</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBean</h1>
        <%--Creamos una variable cuyo nombre indicamos con el id--%>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        
        <%--Usamos los métodos set de este JavaBean--%>
        Modificamos los atributos:
        <br>
        <%
          int baseValor=5;
          int alturaValor=10;
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>"/>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>"/>
        
        Nuevo valor base: <%=baseValor%>
        <br>
        Nuevo valor altura: <%=alturaValor%>
        <br>
        <br>
        <a href="index.jsp">Volver al incio</a>
    </body>
</html>
