package sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import sga.domain.Persona;

@Stateless //Esta clase debe de ser un EJB para que pueda inyectarse el EntityManager de JPA
public class PersonaDaoImpl implements PersonaDao{
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList(); //getResultList para que devuelva una lista
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        //Se puede hacer como el anterior método (findPërsonaById) pero vamos a crear una Query para ver
        //También se puede crear como una NamedQuery
        Query query = em.createQuery("SELECT p FROM Persona p WHERE p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult(); //SingleResult debido a que en la base de datos lo definimos como unico
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(em.merge(persona)); //Primero se tiene que actualizar el estado del objeto
    }
}
