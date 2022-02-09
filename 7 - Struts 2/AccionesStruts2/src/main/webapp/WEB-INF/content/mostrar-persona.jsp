<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar persona con Struts 2</title>
    </head>
    <body>
        <h1>Personas con Struts 2</h1>
        <s:form>
            <%--nombre es por el atributo definido en la clase Action--%>
            <s:textfield name="nombre"/>
            <s:submit value="Enviar"/>
        </s:form>
        <div>
            Nombre proporcionado: <s:property value="nombre"/>
        </div>
        <%--Como no especificamos el Action a ejecutar, por convención se ejecuta el que tenga el mismo nombre
        es decir, MostrarPersonaAction--%>
    </body>
</html>
