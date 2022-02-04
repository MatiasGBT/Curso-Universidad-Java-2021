package sga.servicio;

import java.util.List;
import javax.ejb.Local;
import sga.domain.Persona;

@Local //Interface local en vez de remota
public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
