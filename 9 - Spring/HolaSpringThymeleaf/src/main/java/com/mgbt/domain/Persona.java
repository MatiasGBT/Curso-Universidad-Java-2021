package com.mgbt.domain;

import lombok.Data;

//Normalmente al crear clases puras de Java tenemos que hacer los getter/setter, toString, hashcode, etc
//pero lombok nos permite ahorrarnos todo eso
@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}

//Con esto nos ahorramos: Constructor vació, getters/setters, hashCode y toString, es decir, deja la clase como un Java Bean