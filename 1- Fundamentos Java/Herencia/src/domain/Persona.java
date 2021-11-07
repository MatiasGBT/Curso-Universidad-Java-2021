package domain;

public class Persona {
	//protected hace que las clases hijas puedan seguir utilizando los atributos de la clase padre
	//independientemente del paquete en el que estan.
	protected String nombre;
	protected char genero;
	protected int edad;
	protected String direccion;
	//Si ponemos los atributos private, si se heredaran, pero no podrán usarse sin métodos
	//get y set.
	
	public Persona() {
		
	}
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}

	public Persona(String nombre, char genero, int edad, String direccion) {
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", direccion de memoria=");
		builder.append(super.toString());
		//La clase padre de la clase persona por defecto es la clase object, por ende,
		//el método toString de object mostrara la direccion de memoria.
		builder.append("]");
		return builder.toString();
	}
	
	
}
