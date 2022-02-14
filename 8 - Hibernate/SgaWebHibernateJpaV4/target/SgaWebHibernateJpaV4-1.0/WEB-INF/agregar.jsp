<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Agregar alumno</title>
    </head>
    <body>
        <h1>Agregar alumno</h1>
        
        <form method="POST" action="/SgaWebHibernateJpaV4/ServletAgregar">
            <label for="nombre">Nombre: </label>
            <input type="text" name="nombre" required="true"/>
            <br/>
            <label for="apellido">Apellido: </label>
            <input type="text" name="apellido" required="true"/>
            
            <br/>
            <br/>
            <p>Datos domicilio:</p>
            <label for="calle">Calle: </label>
            <input type="text" name="calle" required="true"/>
            <br/>
            <label for="nocalle">No. Calle: </label>
            <input type="text" name="nocalle" required="true"/>
            <br/>
            <label for="pais">País: </label>
            <input type="text" name="pais" required="true"/>
            
            <br/>
            <br/>
            <p>Datos contacto:</p>
            <label for="email">Email: </label>
            <input type="text" name="email" required="true"/>
            <br/>
            <label for="telefono">Teléfono: </label>
            <input type="tel" name="telefono" required="true"/>
            
            <br/>
            <input type="submit" value="Agregar"/>
        </form>
    </body>
</html>
