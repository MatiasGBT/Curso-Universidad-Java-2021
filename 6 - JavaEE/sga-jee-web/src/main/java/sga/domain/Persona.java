package sga.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
//En las clases de entidad tambien se pueden definir queries, esto se conoce como name queries.
@NamedQueries({
    @NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p ORDER BY p.idPersona") //Query para seleccionar todos los datos.
    //Esto no es SQL, es JPQL. Recupera objetos no columnas.
})
@Table(name="persona") //En la base de datos la tabla esta en minusculas, por eso hay que poner la anotación.
public class Persona implements Serializable {
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_persona") //Nombre en la base de datos
    private int idPersona;
    
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
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