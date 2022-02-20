package com.mgbt.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

//Normalmente al crear clases puras de Java tenemos que hacer los getter/setter, toString, hashcode, etc
//pero lombok nos permite ahorrarnos todo eso
@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}

//Con esto nos ahorramos: Constructor vació, getters/setters, hashCode y toString, es decir, deja la clase como un Java Bean