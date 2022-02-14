package controlador;

import domain.*;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import services.AlumnoService;

@WebServlet("/ServletVer")
public class ServletVer extends HttpServlet {

    AlumnoService alumnoService = new AlumnoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idAlumno;
        idAlumno = req.getParameter("idAlumno");

        Alumno alumno = new Alumno(Integer.parseInt(idAlumno));
        alumno = alumnoService.encontrarAlumno(alumno);

        HttpSession sesion = req.getSession();
        sesion.setAttribute("alumno", alumno);
        req.getRequestDispatcher("/WEB-INF/ver.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sesion = req.getSession();
        
        if (req.getParameter("modificar") != null) {
            sesion = req.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");

            String nombre = req.getParameter("nombre");
            String apellido = req.getParameter("apellido");

            String calle = req.getParameter("calle");
            String noCalle = req.getParameter("nocalle");
            String pais = req.getParameter("pais");

            String email = req.getParameter("email");
            String telefono = req.getParameter("telefono");

            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNoCalle(noCalle);
            alumno.getDomicilio().setPais(pais);
            alumno.getContacto().setEmail(email);
            alumno.getContacto().setTelefono(telefono);

            alumnoService.guardarAlumno(alumno);

            listar(req, resp);
        } else {
            sesion = req.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");
            alumnoService.eliminarAlumno(alumno);

            listar(req, resp);
        }
    }

    private void listar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Alumno> alumnos = alumnoService.listarAlumnos();
        req.setAttribute("alumnos", alumnos);
        req.getRequestDispatcher("/WEB-INF/listado.jsp").forward(req, resp);
    }
}
