package sga.web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import sga.domain.Persona;
import sga.servicio.PersonaService;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Persona> personas = personaService.listarPersonas();
        System.out.println("Personas: " + personas);
        req.setAttribute("personas", personas);
        req.getRequestDispatcher("listadoPersonas.jsp").forward(req, resp);
    }
    
}
