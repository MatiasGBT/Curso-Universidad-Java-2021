package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaServlet")
public class HolaServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Mandamos información al navegador indicando que vamos a refrescar la info del navegador cada segundo.
        resp.setContentType("text/html=UTF-8");
        resp.setHeader("refresh", "1"); //1 de 1 segundo.
        
        //Obtenemos la fecha actual y le damos un formato para obtener la hora:
        Date fecha=new Date();
        SimpleDateFormat formateador=new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
        //Esta variable nos ayudara a darle forma a la fecha segun deseemos.
        // HH:mm:ss es un formato que da la hora, los minutos y luego los segundos.
        //Link para más info: https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/text/SimpleDateFormat.html
        String horaConFormato=formateador.format(fecha);
        
        //Ahora respondemos al cliente
        PrintWriter out=resp.getWriter();
        out.print(horaConFormato);
        out.close();
    }
}
