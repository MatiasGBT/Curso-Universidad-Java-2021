package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. Procesamos los parámetros si es que existen (en este caso no hay)
        
        //2. Creamos los JavaBeans que utilizaremos en la aplicación
        Rectangulo rec=new Rectangulo(3, 6);
        
        //3. Agregamos el JavaBean a algún alcance
        req.setAttribute("mensaje", "Saludos desde el Servlet");
        //Compartimos el JavaBean de rectangulo en el alcance de Session
        HttpSession sesion=req.getSession(); //Obtenemos la sesión de nuestra aplicación
        sesion.setAttribute("rectangulo", rec);
        
        //4. Redireccinamos a la Vista seleccionada
        RequestDispatcher rd=req.getRequestDispatcher("vista/desplegarVariables.jsp"); //El objeto RequestDispatcher apunta a la Vista que vamos a utilizar
        //Ahora hay que propagar los objetos request y response al JSP
        rd.forward(req, resp); //Esto puede tirar 2 excepciones del tipo ServletException e IOException.
    }
}
