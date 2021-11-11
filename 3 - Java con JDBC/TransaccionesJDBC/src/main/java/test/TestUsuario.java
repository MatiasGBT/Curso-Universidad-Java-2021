package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestUsuario {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit() == true) { //El método get y set son de la clase connection, no los cree.
                conexion.setAutoCommit(false);
            }

            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            Usuario usuarioNuevo = new Usuario();
            usuarioNuevo.setUser("Ricardo");
            usuarioNuevo.setPassword("5162");
            usuarioDao.insertar(usuarioNuevo);

            List<Usuario> usuarios=usuarioDao.seleccionar();
            for(Usuario usuario: usuarios) {
                System.out.println(usuario);
            }
            
            usuarioDao.eliminar(usuarioNuevo);

            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
