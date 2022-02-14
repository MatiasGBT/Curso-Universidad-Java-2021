<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Modificar alumno</title>
    </head>
    <body>
        <form action="/SgaWebHibernateJpaV4/ServletVer" method="POST">
            <input type="hidden" name="idAlumno" value="${alumno.idAlumno}" />
            
            <label for="nombre">Nombre: </label>
            <input type="text" name="nombre" value="${alumno.nombre}"/>
            <br/>
            <label for="apellido">Apellido: </label>
            <input type="text" name="apellido" value="${alumno.apellido}"/>
            
            <br/>
            <br/>
            <p>Datos Domicilio:</p>
            <label for="calle">Calle: </label>
            <input type="text" name="calle" value="${alumno.domicilio.calle}">
            <br/>
            <label for="noCalle">No. Calle: </label>
            <input type="text" name="noCalle" value="${alumno.domicilio.noCalle}"/>
            <br/>
            <label for="pais">País: </label>
            <input type="text" name="pais" value="${alumno.domicilio.pais}"/>
            
            <br/>
            <br/>
            <p>Datos de Contacto:</p>
            <label for="email">Email: </label>
            <input type="email" name="email" value="${alumno.contacto.email}">
            <br/>
            <label for="telefono">Teléfono: </label>
            <input type="tel" name="telefono" value="${alumno.contacto.telefono}">
            <br/>
            <input type="submit" name="modificar" value="Modificar">
            <input type="submit" name="eliminar" value="Eliminar">
        </form>
    </body>
</html>
