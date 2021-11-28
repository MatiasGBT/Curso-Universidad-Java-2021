<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del JavaBean</title>
    </head>
    <body>
        <h1>JSP que lee los valores del JavaBean</h1>
        <%--Utilizaremos una acción para intentar leer un objeto de tipo rectangulo en el alcance de session.
        Si ya existe, lo va a recuperar, si no, va a crear uno nuevo.--%>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        
        <%--Recuperamos la información del JavaBean--%>
        <br>
        Valor base: <jsp:getProperty name="rectangulo" property="base"/>  <%--Esto va a llamar automaticamente al método getBase--%>
        <br>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura"/>
        <%--Una de las caracteristicas que poseen los JSP es que podemos llamar metodos que
        no estén mapeados a una propiedad de un JavaBean, por ejemplo, el metodo getArea.--%>
        <br>
        Valor area: <jsp:getProperty name="rectangulo" property="area"/>
        <br>
        <br>
        <a href="index.jsp">Volver al incio</a>
    </body>
</html>
