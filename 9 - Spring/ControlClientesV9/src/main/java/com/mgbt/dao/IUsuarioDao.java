package com.mgbt.dao;

import com.mgbt.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    //Para comfigurar la seguridad que va a utilizar Spring con nuestra clase de IUsuarioDao, necesitamos
    //definir el método findByUsername
    Usuario findByUsername(String username);
}
