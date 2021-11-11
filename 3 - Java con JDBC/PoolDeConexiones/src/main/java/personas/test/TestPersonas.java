package personas.test;

import personas.jdbc.*;
import personas.dto.*;
import java.sql.*;
import java.util.List;

public class TestPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()==true) {
                conexion.setAutoCommit(false);
            }
            
            IPersonaDAO personaDao = new PersonaDAO(conexion);
            
            List<PersonaDTO> personas=personaDao.select();
            for(PersonaDTO persona:personas) {
                System.out.println("Persona DTO: " + persona);
            }
            
            conexion.commit(); //Como solo usamos el select no es necesario hacer un commmit pero lo dejo para que quede el código.
            System.out.println("Se ha hecho commit de la transacción.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback.");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
