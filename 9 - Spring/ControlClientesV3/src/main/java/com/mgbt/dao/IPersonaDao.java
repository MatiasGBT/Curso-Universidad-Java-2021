package com.mgbt.dao;

import com.mgbt.domain.Persona;
import org.springframework.data.repository.CrudRepository;

//Para ahorrar código solo hay que extender de la clase CrudRepository marcando la clase que vamos a utilizar (Persona)
//y el tipo de variable del id (idPersona es de tipo Long)
//Gracias a esto ya no es necesario crear una implementación
public interface IPersonaDao extends CrudRepository<Persona, Long> {
    //Se pueden crear métodos personalizados también.
}
