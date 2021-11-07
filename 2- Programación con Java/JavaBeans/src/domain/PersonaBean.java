package domain;

import java.io.Serializable;

/*
  Para que una clase en Java se considere un javabean, debe cumplir ciertas caracteristicas:
  -Debe tener un constructor vacío.
  -Cada atributo que definamos dentro de ese JavaBean debe ser un atributo privado.
  -Cada atributo debe tener getter y setter.
  -Debe tener una interface llamada "Serializable",
   la cual permite enviar nuestra clase entre distintos equipos.
*/

//Para que esta clase sea un JavaBean, tiene que implementar la clase Serializable
public class PersonaBean implements Serializable{
	private String nombre;
	private String apellido;
	
	//Un JavaBean tiene que tener un constructor vacío, pero puede tener otros
	//además de este.
	public PersonaBean() {
		
	}
	
	public PersonaBean(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
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

	//Se puede agregar los métodos toString, equals y hashCode, aunque no es requerido.
	@Override
	public String toString() {
		return "PersonaBean [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
