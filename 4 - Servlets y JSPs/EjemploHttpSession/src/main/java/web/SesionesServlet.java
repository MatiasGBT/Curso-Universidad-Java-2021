package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //Obtenemos la sesion, el metodo get, si es que no hay una sesion iniciada, crea una.
        HttpSession sesion=req.getSession();
        String titulo=null;
        
        //Pedimos el atributo contadorVisitas a la sesion
        Integer contadorVisitas=(Integer) sesion.getAttribute("contadorVisitas");
        //Ahora preguntamos si es nulo, si lo es, significa que es la primera vez que iniciamos a la aplicación
        if(contadorVisitas==null) {
            contadorVisitas=1;
            titulo="Bienvenido por primera vez";
        } else {
            contadorVisitas++;
            titulo="Bienvenido nuevamente";
        }
        
        //Agregamos el nuevo valor a la sesion
        //Internamente los valores de una sesión se guardan como un mapa, por lo que tenemos la llave y el valor asociado.
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        //Si existe, se reemplazara con el nuevo valor, si no, se agregara la nueva llave con el valor indicado.
        
        //Mandamos la respuesta al cliente
        PrintWriter out=resp.getWriter();
        out.print(titulo);
        out.print("<br>");
        out.print("Numero de accesos al recurso: " + contadorVisitas);
        out.print("<br>");
        out.print("Id de la sesión: " + sesion.getId()); //Este id se asigna de manera automatica por el contenedor (el servidor de aplicaciones).
        out.close();
        
        //NOTA: Ver el archivo web.xml en la carpeta Web Pages/WEB-INF.
    }
}
