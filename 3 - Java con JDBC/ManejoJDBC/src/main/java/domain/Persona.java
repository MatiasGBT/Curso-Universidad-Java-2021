package domain;

public class Persona {
    //Esta clase va a ser una clase entidad, es decir, un objeto de esta clase
    //representa un registro en la base de datos.
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    //Ahora vamos a agregar los constructores. Podemos tener la necesidad de crear objetos
    //Persona de distintas maneras.
    public Persona() {
    }
    
    //Podemos crear un constructor solo con el id ya que para eliminar un objeto
    //Persona solo se necesita el idPersona para borrarlo entero.
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    //Para insertar registros no se necesita el idPesona ya que se autoincrementa.
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    //Si queremos modificar un registro necesitamos un constructor con todos los atributos
    //así modificamos todo de golpe.
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    //Si necesitamos modificar un atributo de manera individual usaremos getters y setters.
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
    
    //toString() para poder ver el estado del objeto en todo momento.
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}
