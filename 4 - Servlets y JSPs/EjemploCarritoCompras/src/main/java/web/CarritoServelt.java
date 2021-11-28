package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServelt extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");

        //Creamos o recuperamos el objeto HttpSession
        HttpSession sesion = req.getSession();

        //Recuperamos la lista de aritulos previos si es que ya existe
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verificamos si la lista de articulos existe
        if (articulos == null) {
            //Si no existe, tenemos que inicializar la lista
            articulos = new ArrayList<>();
            //Agregamos la lista a la sesión
            sesion.setAttribute("articulos", articulos);
        }

        //Procesamos el nuevo articulo que nos envía el formulario
        String articuloNuevo = req.getParameter("articulo");

        //Revisamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) { //trim es para quitar espacios en blanco, esto es para verificar que no sea una cadena vacía.
            articulos.add(articuloNuevo);
        }

        try ( //Por automatico el IDE nos aconseja utilizar un bloque try with resources, lo que hace es que en automatico, al terminar de usarlo, lo cierra.
            //Imprimimos la lista de articulos
            PrintWriter out = resp.getWriter()) {
            out.print("<h1>Lista de articulos:</h1>");
            out.print("<br>");
            //Iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            //Agregamos un link para regresar al inicio
            out.print("<br>");
            out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
        }
    }
}
