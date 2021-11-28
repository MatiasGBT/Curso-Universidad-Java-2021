package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        String tecnologias[] = req.getParameterValues("tecnologia"); //getParameterValues puede regresar varios valores.
        String genero = req.getParameter("genero");
        String ocupacion = req.getParameter("ocupacion");
        String musicas[] = req.getParameterValues("musica");
        String comentario = req.getParameter("comentarios");

        //No se hace así, es solo para la lección.
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet");
        out.print("</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el Servlet");
        out.print("</h1>");
        out.print("<table border='1'>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologías");
        out.print("</td>");
        out.print("<td>");
        for (String tecnologia : tecnologias) {
            out.print(tecnologia);
            out.print(" / ");
        }
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Género");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupación");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupacion);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Músicas");
        out.print("</td>");
        out.print("<td>");
        if (musicas != null) {
            for (String musica : musicas) {
                out.print(musica);
                out.print(" / ");
            }
        } else {
            out.print("Valor no proporcionado");
        }
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Comentarios");
        out.print("</td>");
        out.print("<td>");
        out.print(comentario);
        out.print("</td>");
        out.print("</tr>");

        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
    }
}
