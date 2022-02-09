<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="form.titulo"/></title>
        <s:head/> <%--Para que se agreguen los estilos de Strus de manera automática--%>
    </head>
    <body>
        <h1><s:text name="form.titulo"/></h1>
        
        <%--Los campos que ya poseen un nombre asociado a un mensaje de error como el usuario y el password no
        requieren ninguna configuración extra para mostrar dichos mensajes, pero los mensajes de error genericos
        requieren lo siguiente:--%>
        <s:actionerror/>
        
        <s:form action="validarUsuario">
            <s:textfield key="form.usuario" name="usuario"/>
            <s:password key="form.password" name="password"/>
            <s:submit key="form.boton" name="submit"/>
        </s:form>
    </body>
</html>
