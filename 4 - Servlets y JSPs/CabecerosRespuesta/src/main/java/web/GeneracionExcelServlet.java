package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Indicamos el tipo de respuesta al navegador
        resp.setContentType("application/vnd.ms-excel"); //vnd significa Vendor Specific.
        //Agregamos un cabecero de respuesta.
        resp.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls"); //attachment significa que el contenido se va a descargar.
        //Para un uso más profesional de Excel, es mejor utilizar poi.apache.org
        
        //Le indicamos al navegador que no guarde información previa para que cada vez que demos click sobre el link
        //siempre sea información nueva y que no guarde cache el navegador.
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("Cache-Control", "no-store");
        resp.setDateHeader("Expires", -1); //-1 para que expire de manera inmediata.
        
        //Desplegamos información al cliente
        PrintWriter out=resp.getWriter();
        out.println("\tValores"); //Indicamos que vamos a agregar info a una celda (la cadena de valores)
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        // \t sirve para hacer un tabulador en excel, es decir, ir una celda a la derecha.
        out.close();
    }
}
