<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--Vamos a poner en práctica el concepto de Tags de Struts, para eso tenemos que agregar el siguiente taglib--%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludos desde Struts 2</title>
    </head>
    <body>
        <h1><s:property value="saludosAtr"></s:property></h1> <%--Se mandara a llamar el método getSaludoAtr--%>
    </body>
</html>
