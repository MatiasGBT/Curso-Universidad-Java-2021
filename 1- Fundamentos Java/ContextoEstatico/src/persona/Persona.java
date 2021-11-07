package persona;

public class Persona {
	private int idPersona;
	private String nombre;
	private static int contadorPersonas;
	//Los atributos static hacer referencia a la clase, no al objeto, por ende,
	//el mejor lugar para utilizarlos es en el constructor de la clase.
	
	public Persona(String nombre) {
		this.nombre=nombre;
		//Incrementamos el valor del contador por cada objeto creado
		Persona.contadorPersonas++;
		/*Como hace referencia a la clase y no al objeto, se utiliza el nombre de la clase
		 * no el this*/
		//Asignamos el nuevo valor a la variable idPersona
		this.idPersona=Persona.contadorPersonas;
		//Se puede hacer en una sola línea.
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

	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
	}

	@Override //Indica que estamos sobreescribiendo el metodo toString
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	
}