<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo"/></title> <%--Esto llamara automaticamente al método getTitulo()--%>
    </head>
    <body>
        <h1><s:property value="titulo"/></h1>
        <s:form>
            <%--nombre es por el atributo definido en la clase Action--%>
            <s:textfield name="nombre"/>
            <s:submit key="persona.boton" name="submit"/>
        </s:form>
        <div>
            <s:property value="valor"/>
            <s:property value="nombre"/>
        </div>
        <%--Como no especificamos el Action a ejecutar, por convención se ejecuta el que tenga el mismo nombre
        es decir, MostrarPersonaAction--%>
    </body>
</html>
