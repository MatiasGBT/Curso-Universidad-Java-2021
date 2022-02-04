package sga.cliente.criteria;

import java.util.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
import org.apache.logging.log4j.*;
import sga.domain.Persona;

public class PruebaApiCriteria {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        CriteriaBuilder cb = null;
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query = null;
        Persona persona = null;
        List<Persona> personas = null;
        
        //Query utilizando el API de Criteria
        
        //1. Consulta de todas las personas
        //Paso 1: el objeto EM crea una instancia de la clase CriteriaBuilder
        cb = em.getCriteriaBuilder();
        //Paso 2: se crea un objeto CriteriaQuery
        criteriaQuery = cb.createQuery(Persona.class);
        //Paso 3: creamos el objeto raíz del query
        fromPersona = criteriaQuery.from(Persona.class);
        //Paso4: seleccionamos lo necesario del from
        criteriaQuery.select(fromPersona);
        //Paso 5: creamos el tipo de query typesafe
        query = em.createQuery(criteriaQuery);
        //Paso 6: ejecutamos la consulta
        personas = query.getResultList();
        //mostrarPersonas(personas);
        
        //2-a. Consulta de la Persona con id=1
        //JPQL = "SELECT p FROM Persona p WHERE p.idPersona = 1"
        log.debug("\n2-a. Consulta de la Persona con id=1");
        cb = em.getCriteriaBuilder(); //Es necesario volver a inicializarlo debido a que ya lo utilizamos en el quey anterior
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idPersona"), 1));
        persona = em.createQuery(criteriaQuery).getSingleResult();
        log.debug(persona);
        
        //2-b. Consulta de la Persona con id=1
        log.debug("\n2-b. Consulta de la Persona con id=1");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);
        
        //Concepto de predicado. La clase Predicate nos permite agregar varios criterios dinamicamente.
        List<Predicate> criterios = new ArrayList<Predicate>();
        
        //Verificamos si hay criterios a agregar
        Integer idPersonaParam = 1;
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class, "idPersona");
        criterios.add(cb.equal(fromPersona.get("idPersona"), parameter));
        
        //Se agregar los criterios
        if(criterios==null) {
            throw new RuntimeException("Sin criterios");
        } else if(criterios.size()==1) {
            criteriaQuery.where(criterios.get(0));
        } else {
            criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }
        
        query = em.createQuery(criteriaQuery);
        query.setParameter("idPersona", idPersonaParam);
        
        //Ejecutamos el query
        persona = query.getSingleResult();
        log.debug(persona);
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for(Persona p : personas) {
            log.debug(p);
        }
    }
}
