package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Suponemos que el usuario visita por primera vez el sitio.
        boolean nuevoUsuario=true;
        
        //Obtenemos el arreglo de Cookies
        Cookie cookies[]=req.getCookies();
        
        //Ahora buscamos si ya existe una cookie que ya hayamos agregado anteriormente al navegador.
        //esta cookie la llamaremos visitanteRecurrente
        if(cookies!=null) {
            for(Cookie c:cookies) {
              if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                  //Si ya existe la cookie, el usuario es recurrente.
                  nuevoUsuario=false;
                  break; //Rompemos el ciclo ya que encontramos la cookie que buscamos.
              }
            }
        }
        
        String mensaje=null;
        if(nuevoUsuario) {
            Cookie visitanteCookie=new Cookie("visitanteRecurrente", "si");
            resp.addCookie(visitanteCookie);
            mensaje="¡Gracias por visitar nuestro sitio por primera vez!";
        } else {
            mensaje="¡Gracias por visitar nuevamente nuestro sitio!";
        }
        resp.setContentType("text/html=UTF-8");
        PrintWriter out=resp.getWriter();
        out.print(mensaje);
        out.close();
    }
}
