package servicio;

import dao.PersonaDao;
import domain.Persona;
import java.util.List;

public class ServicioPersonas {
    
    private PersonaDao personaDao;
    
    public ServicioPersonas() {
        this.personaDao = new PersonaDao();
    }
    
    public List<Persona> listarPersonas() {
        return this.personaDao.listar();
    }
}
