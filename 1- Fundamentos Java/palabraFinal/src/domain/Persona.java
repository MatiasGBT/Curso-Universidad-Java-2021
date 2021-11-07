package domain;

public final class Persona {
	//Cuando trabajamos con clases, la palabra final hace que una clase no pueda tener
	//clases hijas.
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
