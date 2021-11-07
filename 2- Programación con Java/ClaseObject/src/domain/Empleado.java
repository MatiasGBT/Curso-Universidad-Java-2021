package domain;

public class Empleado {
	protected String nombre;
	protected double sueldo;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre=nombre;
		this.sueldo=sueldo;
	}
	
	public String obtenerDetalles() {
		return "Nombre: " + this.nombre + " Sueldo: " + this.sueldo;
	}
	
	//Getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	//No importa como se realiza en calculo hashCode ya que cambia de IDE a IDE, lo que importa
	//es que genera un valor entero único para el objeto, utilizando los valores de los atributos.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sueldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	//Equals regresa true o false. Realiza varias comprobaciones para comprobar si el objeto
	//que queremos comparar (this), es igual al objeto con el que queremos comparar.
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //Pregunta si tienen la misma referencia en memoria.
			return true;
		if (obj == null) //Pregunta si el objeto es nulo, sí lo es, son distintos ya que this no lo es.
			return false;
		if (getClass() != obj.getClass()) //Pregunta si el tipo de las clases es igual.
			return false;
		//Si ambos tipos son iguales, convierte al objeto a la clase hija (Empleado)
		//y compara sus atributos.
		Empleado other = (Empleado) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
			return false;
		return true;
	}
	
	
}
