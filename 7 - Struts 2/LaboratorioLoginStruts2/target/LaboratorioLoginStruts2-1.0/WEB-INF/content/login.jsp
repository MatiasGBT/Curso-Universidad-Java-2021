<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo"/></title>
    </head>
    <body>
        <h1><s:property value="titulo"/></h1>
        <s:form>
            <s:textfield key="form.nombre" name="usuario"/>
            <s:password key="form.contrasena" name="password"/>
            <s:submit key="form.boton" name="submit"/>
        </s:form>
        
        <h4><s:property value="valores"/></h4>
        <br/>
        <s:property value="form.nombre"/> <s:property value="usuario"/>
        <br/>
        <s:property value="form.contrasena"/> <s:property value="password"/>
    </body>
</html>
