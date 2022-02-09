<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<!--
Este  JSP no hace un mapeo directo con una acción, ya que utilizaremos la misma clase PersonasAction
para procesar los valores que utilizará la vista persona.jsp.
Este es el segundo JSP que crearemos, y lo utilizaremos para mostrar el detalle de un objeto de 
tipo persona. Y lo usaremos tanto para agregar o modificar un objeto de tipo persona.
La única diferencia entre agregar y modificar una persona es el valores de idPersona, si es igual a nulo quiere 
decir que aún no tiene una representación en la base de datos y por lo tanto se hace un insert, es decir, se 
agrega a la base de datos. Por otro lado, si el valor es distinto a nulo, quiere decir que ya hay una representación 
en base de datos de ese objeto de tipo Persona, entonces estamos modificando el objeto (update).
-->

<html>
    <head>
        <title><s:text name="pform.detalle" /></title>
    </head>
    <body>
        <h1><s:text name="pform.detalle" /></h1>
        <a href="<s:url action="listar"/>"><s:text name="pform.listado" /></a>

        <s:form action="guardarPersona">
            <!--Es importante observar el uso de <ese:hidden> para incluir el campo de idPersona. Así que aunque no observemos 
            este valor en el formulario, sí se está enviando al navegador como campo oculto, pudiendo tener un valor nulo si 
            es un nuevo registro, o un valor distinto de nulo si es un registro que se está modificando.
            -->
            <s:hidden name="persona.idPersona" />
            <s:textfield name="persona.nombre" key="p.nombre" />
            <s:textfield name="persona.apellidoPaterno" key="p.apePat" />
            <s:textfield name="persona.apellidoMaterno" key="p.apeMat" />
            <s:textfield name="persona.email" key="p.email" />
            <s:submit action="guardarPersona" key="pform.enviar"/>
        </s:form>
    </body>
</html>