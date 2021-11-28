package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Indicaremos la cantidad de veces que el usuario a entrado en el sitio.
        int contador=0;
        
        //Revisamos en el array de Cookies si ya existe la cookie llamada contadorVisitas
        Cookie cookies[]=req.getCookies();
        if(cookies!=null) {
            for(Cookie c:cookies) {
                if(c.getName().equals("contadorVisitas")) {
                    //Si la cookie existe, obtenemos el valor de cookies actual.
                    contador=Integer.parseInt(c.getValue());
                }
            }
        }
        
        //Incrementamos el contador en 1 después de obtener el valor de la cookie.
        contador++;
        
        //Ahora agregamos esta cookie de vuelta al navegador con el nuevo valor.
        Cookie c=new Cookie("contadorVisitas", Integer.toString(contador)); //Convertimos la variable Integer con toString().
        //Esta variable no la definiremos por tiempo indefinido, la almacenaremos por 1 hora (3600segs).
        c.setMaxAge(3600);
        resp.addCookie(c); //Si ya esta definida la sobreescribe con el nuevo valor
        
        //Mandamos el mensaje al navegador.
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
    }
}
