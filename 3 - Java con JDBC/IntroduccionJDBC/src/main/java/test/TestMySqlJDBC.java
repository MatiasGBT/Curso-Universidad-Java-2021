package test;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        //Para conectarnos a la base de datos de mysql hay que realizar
        //varios pasos:
        
        //1. escribir la cadena de conexión.
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        //localhost es la ip del servidor y 3306 el puerto.
        //test es el nombre de la base de datos que creamos en mysql workbech.
        //a partir de el simbolo de pregunta ("?"), van los parametros de conexión.
        
        //2. metodo forName, actualmente ya no es requerido pero se puede ver en muchos codigos.
        try {
            //Esto puede ser requerido en aplicaciones web. No hay necesidad en aplicaciones locales.
            //Class.forName("com.mysql.cj.jdbc.Driver"); LO COMENTO PORQUE NO ES REQUERIDO
            Connection conexion = DriverManager.getConnection(url, "root", "");
        /*} catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out); ESTA EXCEPCION VENIA CON EL CLASS.FORNAME()*/ 
        
        //3. hay que crear un objeto de tipo statement, el cual permitira ejecutar sentencias sobre
        //nuestra base de datos.
        Statement instruccion = conexion.createStatement();
        var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
        //Ahora hay que ejecutar esta instruccion.
        ResultSet resultado = instruccion.executeQuery(sql);
        //Como la sentencia de executeQuery podria devolver más de un registro, hay que usar un ciclo while.
        while (resultado.next()) { //next indica si aun tenemos un elemento a iterar.
            System.out.print("Id Persona: " + resultado.getInt("id_persona"));
            System.out.print(", Nombre: " + resultado.getString("nombre"));
            System.out.print(", Apellido: " + resultado.getString("apellido"));
            System.out.print(", Email: " + resultado.getString("email"));
            System.out.print(", Telefono: " + resultado.getString("telefono"));
            System.out.println("");
        }
        //4. IMPORTANTE: hay que cerrar los objetos que abrimos. Se hace a la inversa (primero se cierra el ultimo abierto).
        resultado.close();
        instruccion.close();
        conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
