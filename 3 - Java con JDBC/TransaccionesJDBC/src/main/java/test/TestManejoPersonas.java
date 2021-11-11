package test;

import datos.*;
import domain.Persona;
import java.sql.*;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null; //Si no definimos este objeto fuera del try, no lo podremos usar en el catch.
        
        try {
            //Ahora tenemos que crear un objeto de la clase conecction.
            conexion = Conexion.getConnection();
            //Posteriormente, tenemos que revisar si la conexion esta en modo autocommit.
            if(conexion.getAutoCommit()==true) { //El método get y set son de la clase connection, no los cree.
                conexion.setAutoCommit(false);
            }
            
            //Creamos un objeto PersonaDAO con la conexion que creamos. Si no hacemos esto,
            //se ejecutaran las sentencias SQL sin la posibilidad de hacer rollback y demás.
            PersonaDAO personaDao = new PersonaDAO(conexion);
            Persona personaActualizar=new Persona();
            personaActualizar.setIdPersona(3);
            personaActualizar.setNombre("Carla");
            personaActualizar.setApellido("Gomez");
            personaActualizar.setEmail("cgomez@mail.com");
            personaActualizar.setTelefono("2345345623");
            personaDao.actualizar(personaActualizar);
            
            Persona personaNueva=new Persona();
            personaNueva.setNombre("Carlos");
            //Forzamos error usando una cadena de más de 45, esto solo para probar.
            personaNueva.setApellido("Ramirezlllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll");
            personaDao.insertar(personaNueva);
            
            //Si todo funciona ahora hay que hacer commit de la transacción utilizando el objeto conexion.
            conexion.commit(); //Guarda los cambios.
            
            //POR ÚLTIMO. Dentro de los métodos insertar, actualizar, eliminar, etc, tenemos que
            //quitar el manejo de excepciones que agregamos porque si no, no se arrojara la
            //excepcion de este bloque y no se podra hacer rollback.
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            try { //EL MÉTODO ROLLBACK PUEDE GENERAR UNA EXCEPCION.
                //Si falla, hay que hacer rollback.
                conexion.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
