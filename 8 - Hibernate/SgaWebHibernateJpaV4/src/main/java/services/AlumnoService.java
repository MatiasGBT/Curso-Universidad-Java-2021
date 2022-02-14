package services;

import dao.AlumnoDao;
import domain.Alumno;
import java.util.List;

public class AlumnoService {
    private AlumnoDao alumnoDao = new AlumnoDao();
    
    public List<Alumno> listarAlumnos(){
        return alumnoDao.listar();
    }
    
    public void guardarAlumno(Alumno alumno){
        if( alumno != null && alumno.getIdAlumno() == null){
            alumnoDao.insertar(alumno);
        }
        else{
            alumnoDao.actualizar(alumno);
        }
    }
    
    public void eliminarAlumno(Alumno alumno){
        alumnoDao.eliminar(alumno);
    }
    
    public Alumno encontrarAlumno(Alumno alumno){
        return alumnoDao.buscarPorId(alumno);
    }
}
