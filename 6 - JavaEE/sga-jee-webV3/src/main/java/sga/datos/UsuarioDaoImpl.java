package sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import sga.domain.Usuario;

@Stateless
public class UsuarioDaoImpl implements UsuarioDao{

    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;
    
    @Override
    public List<Usuario> findAllUsuarios() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioByUsername(Usuario usuario) {
        return (Usuario) em.createNamedQuery("Usuario.findByUsername").getSingleResult();
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void deleteUsuiario(Usuario usuario) {
        em.remove(em.merge(usuario));
    }
    
}
