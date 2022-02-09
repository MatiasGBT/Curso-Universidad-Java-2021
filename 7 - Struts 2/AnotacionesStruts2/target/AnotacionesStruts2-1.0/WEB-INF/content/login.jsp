<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="form.titulo"/></title>
    </head>
    <body>
        <h1><s:text name="form.titulo"/></h1>
        <s:form action="validarUsuario"> <!--Para que ejecute la acción validarUsuario definida en ValidarUsuarioAction.java-->
            <s:textfield key="form.usuario" name="usuario"/>
            <s:password key="form.password" name="password"/>
            <s:submit key="form.boton" name="submit"/>
        </s:form>
    </body>
</html>
