package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. Procesamos los parámetros si es que existen
        String accion=req.getParameter("accion");
        
        //2. Creamos los JavaBeans que utilizaremos en la aplicación
        Rectangulo recRequest=new Rectangulo(1,2);
        Rectangulo recSesion=new Rectangulo(3,4);
        Rectangulo recApplication=new Rectangulo(5,6);
        
        //3. Agregamos el JavaBean a algún alcance
        //revisamos la acción proporcionada
        if("agregaVariables".equals(accion)) {
            //Alcance de request
            req.setAttribute("rectanguloRequest", recRequest);
            //Alcance de sesion
            HttpSession sesion=req.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            //Alcance application
            ServletContext application=this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recApplication);
            //Agregamos un mensaje
            req.setAttribute("mensaje", "Las variables fueron agregadas");
            
            //4. Redireccionamos al JSP de index
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else if("listarVariables".equals(accion)) {
            //4. Redireccionamos al JSP que despliega las variables
            req.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(req, resp);
            
        } else {
            //4. Redireccionamos a la página de inicio
            req.setAttribute("mensaje", "Acción no proporcionada o desconocida");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            //resp.sendRedirect("index.jsp"); esto también sirve, sin embargo, no podemos propagar el mensaje
        }
        

    }
}
