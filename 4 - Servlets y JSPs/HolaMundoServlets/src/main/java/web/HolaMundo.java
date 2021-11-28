package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo") //Con esta anotación lo podremos identificar desde el navegador.
//Lo que esta entre parentesis es un path con el que se podra acceder a este Servlet. Puede tener cualquier nombre.
public class HolaMundo extends HttpServlet{ //Para que una clase sea un servlet, hay que extenderla de la clase HttpServlet
    
    //Existen 2 métodos para utilizar, el doGet y el doPost. En este caso usaremos el doGet.
    //Si le damos ctrl + click al nombre de la clase padre (HttpServlet) podremos ver el método y como esta constituído.
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Preferentemente no se manejara código HTML en los Servlets, sino en los JSP´s.
        //Los Servlets pueden responder contenido HTML al navegador.
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter(); //Puede tirar una excepción
        out.println("Hola Mundo desde Servlets");
        
        //Después de esto hay que hacer un Clean and Build. Para esto hay que tener detenido el servicio de GlassFish.
    }
}
