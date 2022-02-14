package test;

import dao.PersonaDao;
import domain.Persona;

public class OperacionesHibernateJpa {
    public static void main(String[] args) {
        PersonaDao personaDao = new PersonaDao();
        
        personaDao.listar();
        
        Persona persona = new Persona();
        persona.setIdPersona(18);
        
        persona = personaDao.buscarPersonaPorId(persona);
        
        //persona.setNombre("Carlos");
        //persona.setApellido("Esparza");
        //persona.setEmail("cesparza@mail.com");
        //persona.setTelefono("4553123");
        
        //personaDao.insertar(persona); el id no hace falta con este método
        //personaDao.modificar(persona);
        personaDao.eliminar(persona);
        personaDao.listar();
    }
}
