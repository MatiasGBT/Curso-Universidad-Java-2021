package com.mgbt.dao;

import com.mgbt.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

//Para ahorrar código solo hay que extender de la clase JpaRepository marcando la clase que vamos a utilizar (Persona)
//y el tipo de variable del id (idPersona es de tipo Long)
//Gracias a esto ya no es necesario crear una implementación
public interface IPersonaDao extends JpaRepository<Persona, Long> {
    //Se pueden crear métodos personalizados también.
}
