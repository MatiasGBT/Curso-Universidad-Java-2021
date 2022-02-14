package controlador;

import domain.Alumno;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import services.AlumnoService;

@WebServlet("/ServletListado")
public class ServletListado extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AlumnoService alumnoService = new AlumnoService();
        List<Alumno> alumnos = alumnoService.listarAlumnos();
        HttpSession sesion = req.getSession();
        sesion.setAttribute("alumnos", alumnos);
        req.getRequestDispatcher("/WEB-INF/listado.jsp").forward(req, resp);
    }
}
