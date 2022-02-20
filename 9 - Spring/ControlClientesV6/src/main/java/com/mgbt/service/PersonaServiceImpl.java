package com.mgbt.service;

import com.mgbt.dao.IPersonaDao;
import com.mgbt.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //Para que Spring reconozca esta clase como una clase de servicio
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;
    
    //Las clases DAO implementan métodos transaccionales, por lo que hay que aclararlo en nuestros métodos de servicio
    //para que se pueda hacer commit o rollback según se necesite. Esto se aplica utilizando @Transactional
    
    @Override
    @Transactional(readOnly = true) //readOnly porque el método únicamente leera info de la BD
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional //Este método si puede hacer commit o rollback por lo que no es de solo lectura
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
        //orElse significa que si no entuentra el objeto buscado regrese null (o lo que pongamos).
        //hay otros métodos de or como regresar excepciones y demás.
    }
    
}
