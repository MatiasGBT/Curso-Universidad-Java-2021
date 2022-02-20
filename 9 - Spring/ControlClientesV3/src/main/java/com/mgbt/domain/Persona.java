package com.mgbt.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
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
    
    @NotEmpty //Validaciones. El campo nombre ya no puede ser vacío (con cadenas se utiliza NotEmpty, con otros valores es NotNull)
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty
    @Email //Valida si tiene un formato de email valido
    private String email;
    
    //Para confirmar vamos a dejar vacío este campo de validaciones
    private String telefono;
}