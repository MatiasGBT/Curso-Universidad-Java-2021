package domain;

import javax.xml.bind.annotation.XmlRootElement;

/*
Esta clase solo esta para poder recibir y envíar información de este objeto Persona, ya
que se convertira de objeto Java a XML y viceversa.
*/

@XmlRootElement //Para que se pueda convertir a XML y hacer el proceso de marshaling y unmarshaling
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
        
    }
    
    public Persona (int idPersona) {
        this.idPersona = idPersona;
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
}