package sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import sga.domain.Persona;

//Por el momento no se utilizara esta interface en este ejercicio
@Remote
public interface PersonaServiceRemote {
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
