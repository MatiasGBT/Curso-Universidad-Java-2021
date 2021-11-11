package personas.dto;

public class PersonaDTO {
    private int idPersona;
    private String nombre;
    private String apellido;

    //Constructores
    public PersonaDTO() {
    }
    
    //Constructor para eliminar
    public PersonaDTO(int idPersona) {
        this.idPersona = idPersona;
    }
    
    //Constructor para crear/insertar
    public PersonaDTO(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Constructor para actualizar
    public PersonaDTO(int idPersona, String nombre, String apellido) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Getters y setters
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
    
    //toString()
    @Override
    public String toString() {
        return "PersonaDTO{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}
