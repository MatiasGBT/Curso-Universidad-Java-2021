package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    //Sobreescribiremos el método doPost()
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Este método procesara los valores que nos manda el formulario y regresara una respuesta
        //al navegador con los valores de los parametros que ha proporcionado el usuario.
        
        //Leer los parametros del formulario HTML.
        String usuario=req.getParameter("usuario"); //La palabra "usuario" proviene del nombre del input de nuestro form HTML.
        String password=req.getParameter("password");
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        //Se va a mostrar en la consola de GlassFish.
        
        //Respondemos al cliente.
        PrintWriter out=resp.getWriter();
        out.print("<html>"); //print o println da igual puesto que solo reconoce código HTML.
        out.print("<body>");
        out.print("El parametro Usuario es: " + usuario);
        out.print("<br>");
        out.print("El parametro Password es: " + password);
        out.print("</body>");
        out.print("</html>");
        //Esto no se hace así, es solo para la lección.
    }
}
