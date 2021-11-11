package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestUsuario {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        Usuario usuarioNuevo1=new Usuario("Pepe", "1234");
        Usuario usuarioNuevo2=new Usuario("Juan", "4321");
        Usuario usuarioNuevo3=new Usuario("José", "1324");
        usuarioDao.insertar(usuarioNuevo1);
        usuarioDao.insertar(usuarioNuevo2);
        usuarioDao.insertar(usuarioNuevo3);
         
        imprimir(usuarioDao);
        
        Usuario usuarioModificar=new Usuario(2, "Juan Carlos", "4231");
        usuarioDao.actualizar(usuarioModificar);
        
        imprimir(usuarioDao);
        
        Usuario usuarioEliminar=new Usuario(3);
        usuarioDao.eliminar(usuarioEliminar);
        
        imprimir(usuarioDao);
    }

    private static void imprimir(UsuarioDAO usuarioDao) {
        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(persona -> {
            System.out.println("Persona: " + persona);
        });
    }
}
