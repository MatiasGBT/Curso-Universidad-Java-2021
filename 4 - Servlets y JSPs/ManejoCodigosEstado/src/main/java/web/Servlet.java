package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Simulamos valores correctos
        String usuarioOk="Juan";
        String passwordOk="123";
        
        //Le pedimos lo que ingreso el usuario
        String usuario=req.getParameter("usuario");
        String password=req.getParameter("password");
        
        PrintWriter out=resp.getWriter();
        
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)) {
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>Password: " + password);
            out.print("</h1>");
        } else {
            resp.sendError(resp.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
            //Si escribimos SC y le damos a ctrl + espacio salen todos los que hay.
        }
    }
}
