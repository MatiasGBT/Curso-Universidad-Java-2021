package sga.cliente.jpql;

import java.util.*;
import javax.persistence.*;
import org.apache.logging.log4j.*;
import sga.domain.*;

public class PruebaJPQL {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null; //Lo usaremos para iterar los elementos de una colección
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        //Como solo seran consultas no hace falta iniciar una transacción
        //1. Consulta de todos los objetos de tipo Persona:
        log.debug("\n1. Consulta de todas las personas: ");
        jpql = "SELECT p FROM Persona p";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //2. Consulta de la Persona con id = 1
        log.debug("\n2. Consulta de la Persona con id = 1: ");
        jpql = "SELECT p FROM Persona p WHERE p.idPersona = 1";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
        //log.debug(persona);
        
        //3. Consulta de la Persona por nombre
        log.debug("\n3. Consulta de la Persona con nombre = 'Carla': ");
        jpql = "SELECT p FROM Persona p WHERE p.nombre = 'Carla'";
        //Este método podría devolver una lista si es que hay más de una Persona en la base de datos con nombre Carla
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //4. Consulta de datos individuales, se crea una arreglo (tupla) de tipo Object con 3 columnas
        log.debug("\n4. Consulta de datos individuales: ");
        jpql = "SELECT p.nombre as Nombre, p.apellido as Apellido, p.email as Email from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator(); //Pedimos el iterador para poder iterar cada uno de los objetos que retorn la consulta
        while(iter.hasNext()) {
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            //log.debug("Nombre: " + nombre + ", apellido: " + apellido + ", email: " + email);
        }
        
        //5. Obtiene el objeto Persona y el id, se crea un arreglo de tipo Object con 2 columnas
        log.debug("\n5. Obtiene el objeto Persona y el id, se crea un arreglo de tipo Object con 2 columnas: ");
        jpql = "SELECT p, p.idPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()) {
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
            //log.debug("Objeto Persona: " + persona);
            //log.debug("Id persona: " + idPersona);
        }
        
        //6. Consulta de todas las personas
        log.debug("\n6. Obtiene el listado de objetos Persona solo con el id: ");
        jpql = "SELECT new sga.domain.Persona(p.idPersona) FROM Persona p"; //Creamos nuevos objetos de tipo persona solo con el id
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //7. Consultas que regresan el valor mínimo y máximo del idPersona (Scalar results)
        log.debug("\n7. Valor mínimo y máximo del idPersona: ");
        jpql = "SELECT min(p.idPersona) as MinId, max(p.idPersona) as MaxId, count(p.idPersona) as Contador FROM Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()) {
            tupla = (Object[]) iter.next();
            Integer idMin = (Integer) tupla[0];
            Integer idMax = (Integer) tupla[1];
            Long count = (Long) tupla[2];
            //log.debug("Id mínimo: " + idMin);
            //log.debug("Id máximo: " + idMax);
            //log.debug("Contador: " + count);
        }
        
        //8. Consulta la cantidad de nombres de personas distintas
        log.debug("\n8. Cantidad de personas con nombre distinto: ");
        jpql = "SELECT count(distinct p.nombre) as Contador FROM Persona p";
        Long contador = (Long) em.createQuery(jpql).getSingleResult();
        log.debug("Número de personas con nombre distinto: " + contador);
        
        //9. Concatena el nombre y apellido
        log.debug("\n9. Concatena nombre y apellido: ");
        jpql = "SELECT CONCAT(p.nombre, ' ', p.apellido) as Nombre FROM Persona p";
        nombres = em.createQuery(jpql).getResultList();
        for(String nombreCompleto : nombres) {
            //log.debug("Nombre completo: " + nombreCompleto);
        }
        
        //10. Obtener el objeto persona con id = parámetro proporcionado
        log.debug("\n10. Obtener el objeto Persona con id = parámetro proporcionado: ");
        int idPersona = 1;
        jpql = "SELECT p FROM Persona p WHERE p.idPersona = :id";
        q = em.createQuery(jpql);
        q.setParameter("id", idPersona);
        persona = (Persona) q.getSingleResult();
        //log.debug("Persona recuperada: " + persona);
        //Estas consultas son útiles para formularios
        
        //11. Obtener personas que contengan una letra A en el nombre (sin importar mayúsculas o minúsculas)
        log.debug("\n11. Obtener personas que contengan una letra A en el nombre: ");
        jpql = "SELECT p FROM Persona p WHERE UPPER(p.nombre) LIKE UPPER(:parametro)";
        //LIKE para que no importe donde esta la letra, si al inicio, entre medio o al final de la palabra
        String parametroString = "%a%"; //Los % son debido al LIKE
        q = em.createQuery(jpql);
        q.setParameter("parametro", parametroString);
        personas = q.getResultList();
        //mostrarPersonas(personas);
        
        //12. Uso de between
        log.debug("\n12. Uso de BETWEEN: ");
        jpql = "SELECT p FROM Persona p WHERE p.idPersona BETWEEN 1 AND 3";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //13. Uso del ordenamiento
        log.debug("\n13. Uso del ordenamiento: ");
        jpql = "SELECT p FROM Persona p WHERE p.idPersona > 1 ORDER BY p.nombre DESC, p.apellido DESC"; //DESC=descendiente
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //14. Uso de subqueries (depende de la BD, algunas no las soportan, MySQL y Oracle sí)
        //Un subquery es un query dentro de otro
        log.debug("\n14. Uso de subquery: ");
        jpql = "SELECT p FROM Persona p WHERE p.idPersona IN(SELECT min(p1.idPersona) FROM Persona p1)";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //15. Uso de JOIN con lazy loading
        log.debug("\n15. Uso de JOIN con lazy loading: ");
        jpql = "SELECT u FROM Usuario u JOIN u.persona p"; //Por default la carga ya es retardada
        usuarios = em.createQuery(jpql).getResultList();
        //mostrarUsuarios(usuarios);
        
        //16. Uso de LEFT JOIN con eager loading
        log.debug("\n16. Uso de LEFT JOIN con eager loading: ");
        jpql = "SELECT u FROM Usuario u LEFT JOIN FETCH u.persona p"; //FETCH para indicar eager loading
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for(Persona p : personas) {
            log.debug("Persona: " + p);
        }
    }

    private static void mostrarUsuarios(List<Usuario> usuarios) {
        for(Usuario u : usuarios) {
            log.debug("Usuario: " + u);
        }
    }
}
