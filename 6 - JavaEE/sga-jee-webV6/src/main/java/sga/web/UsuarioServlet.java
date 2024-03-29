package sga.web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import sga.domain.Usuario;
import sga.servicio.UsuarioService;

@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet{
    
    @Inject
    UsuarioService usuarioService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        System.out.println("Usuarios: " + usuarios);
        req.setAttribute("usuarios", usuarios);
        req.getRequestDispatcher("listadoUsuarios.jsp").forward(req, resp);
    }
}
