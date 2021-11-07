package persona;

public class Persona {
	private String nombre;
	private double sueldo;
	private boolean eliminado;
	
	public Persona(String nombre, double sueldo, boolean eliminado) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.eliminado=eliminado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	
	public boolean isEliminado() { //Como es boolean, no se usa get, se usa is para preguntar si esta eliminado
		return this.eliminado;
	}
	
	public void setEliminado(boolean eliminado) {
		this.eliminado=eliminado;
	}
	
	/*METODO toSring
	 * Se usa para simplificar todos los get*/
	public String toString() {
		return "Persona [nombre: " + this.nombre +
				", sueldo: " + this.sueldo +
				", eliminado: " + this.eliminado + "]";
	}
	
}
