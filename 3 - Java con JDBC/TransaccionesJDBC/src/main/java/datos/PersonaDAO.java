package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {
    //En cada método se esta abriendo y cerrando una conexión. Cuando manejamos una transacción podemos
    //manejar diversas sentencias (insert, update, etc) sobre una base de datos, no necesariamente de una
    //tabla en particular. Una transacción puede hacer rollback de todas esas sentencias a la vez.
    //Para que una transaccion pueda manejar el rollback y el commit de todas estas sentencias, necesita
    //una misma conexión.

    //Extraemos la conexión.
    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    //Para recibir la conexión, tenemos que definir un constructor.
    public PersonaDAO() {

    }

    //También definimos un constructor que reciba el objeto conexión externo a esta clase.
    public PersonaDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    //COMO LO INDICA LA LINEA 41 DEL TEST DE MANEJO EXCEPCIONES, TENEMOS QUE QUITAR EL MANEJO DE EXCEPCIONES
    //DE LOS METODOS. Quitamos el bloque catch y agregamos el throws SQLException.
    
    //AHORA MODIFICAMOS TODOS LOS MÉTODOS PARA NO CREAR UNA NUEVA CONEXIÓN.
    public List<Persona> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            //Traducción de esta línea: si conexionTransaccional es diferente de nulo, lo utilizamos, si no, hacemos una nueva.
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            //Esta conexión NO se tiene que cerrar a menos que se haya tenido que crear una nueva (ver línea 65).
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                //Dependiendo de la necesidad es el constructor que vamos a usar.
                //En este caso vamos a llenar un objeto de tipo persona con todos los atributos
                //así que usaremos el constructor con todos ellos.
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }
        } finally { //Usamos finally para cerrar los objetos abiertos.
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) { //Cerramos la conexión si es que no se pudo utilizar la transaccional.
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
    }

    //Metodo INSERT. Devuelve int porque indica cuantos registros se han modificado.
    public int insertar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate(); //execureUpdate significa que va a hacer cambios en la base de datos.
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre()); //El número al principio indica el primer carácter comodín utilizado en la sentencia SQL.
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            registros = stmt.executeUpdate(); //execureUpdate significa que va a hacer cambios en la base de datos.
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(Persona persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            registros = stmt.executeUpdate(); //execureUpdate significa que va a hacer cambios en la base de datos.
        } finally {
            try {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
