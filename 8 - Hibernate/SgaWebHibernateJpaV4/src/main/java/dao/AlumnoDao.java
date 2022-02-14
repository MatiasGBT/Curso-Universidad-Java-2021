package dao;

import static dao.GenericDao.em;
import domain.Alumno;
import java.util.List;
import javax.persistence.Query;

public class AlumnoDao extends GenericDao {
    
    public List<Alumno> listar() {
        String consulta = "SELECT a FROM Alumno a";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public void actualizar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(alumno);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public void eliminar(Alumno alumno) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(alumno));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public Alumno buscarPorId(Alumno alumno) {
        em = getEntityManager();
        return em.find(Alumno.class, alumno.getIdAlumno());
    }
}
