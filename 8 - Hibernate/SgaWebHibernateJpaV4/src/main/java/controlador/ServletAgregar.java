package controlador;

import domain.*;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import services.AlumnoService;

@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/agregar.jsp").forward(req, resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AlumnoService alumnoService = new AlumnoService();
        
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        
        String calle = req.getParameter("calle");
        String noCalle = req.getParameter("nocalle");
        String pais = req.getParameter("pais");
        
        String email = req.getParameter("email");
        String telefono = req.getParameter("telefono");
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setNoCalle(noCalle);
        domicilio.setPais(pais);
        
        Contacto contacto = new Contacto();
        contacto.setEmail(email);
        contacto.setTelefono(telefono);
        
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        alumnoService.guardarAlumno(alumno);
        
        List<Alumno> alumnos = alumnoService.listarAlumnos();
        req.setAttribute("alumnos", alumnos);
        
        req.getRequestDispatcher("/WEB-INF/listado.jsp").forward(req, resp);
    }
}
