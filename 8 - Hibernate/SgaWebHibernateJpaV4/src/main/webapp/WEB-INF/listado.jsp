<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de alumnos</title>
    </head>
    <body>
        <h1>Listado de alumnos</h1>
        <a href="/SgaWebHibernateJpaV4/ServletAgregar">Agregar</a>
        
        <table border="1">
            <tr>
                <th>ID Alumno</th>
                <th>Nombre</th>
                <th>Domicilio</th>
                <th>Email</th>
                <th>Teléfono</th>
            </tr>
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td>
                        <a href="/SgaWebHibernateJpaV4/ServletVer?idAlumno=${alumno.idAlumno}">
                            ${alumno.idAlumno}
                        </a>
                    </td>
                    <td>${alumno.nombre} ${alumno.apellido}</td>
                    <td>${alumno.domicilio.calle} ${alumno.domicilio.noCalle} ${alumno.domicilio.pais}</td>
                    <td>${alumno.contacto.email}</td>
                    <td>${alumno.contacto.telefono}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
