package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        
        //Procesamos los cabeceros relacionados con la info de la petición.
        String metodoHttp=req.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("Metodo HTTP: " + metodoHttp);
        
        String uri=req.getRequestURI();
        out.print("<br>");
        out.print("URI seleccionada: " + uri);
        out.print("<br>");
        
        //Imprimimos todos los cabeceros disponibles
        Enumeration cabeceros=req.getHeaderNames();
        while(cabeceros.hasMoreElements()) { //hasMoreElements() pregunta si hay más elementos a iterar.
            //Regresara el nombre del cabecero que se esta iterando en este momento.
            //Como nextElement() regresa un tipo Object, hay que hacer un cast: (String);
            String nombreCabecero=(String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + "</b>: ");
            out.print(req.getHeader(nombreCabecero)); //Obtiene el valor del cabecero proporcionado.
            out.print("<br>");
        }
        
        out.print("</body>");
        out.print("</html>");
        out.close(); //Cuando termine el metodo doGet() se cerrara solo, pero es buena practica agregarlo al final.
    }
}
