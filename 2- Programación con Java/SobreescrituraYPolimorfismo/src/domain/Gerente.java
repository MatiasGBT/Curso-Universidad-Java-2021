package domain;

public class Gerente extends Empleado{
	private String departamento;
	
	public Gerente(String nombre, double sueldo, String departamento) {
		super(nombre, sueldo);
		this.departamento=departamento;
	}
	
	//Sobreescribimos el método de la clase padre
	@Override //indica que el metodo esta siendo sobreescrito
	//Cuando hacemos sobreescritura de un método, no podemos utilizar un modificador
	//más protegido, solo podemos utilizar uno igual o menos restrictivo.
	public String obtenerDetalles() {
		//Para volver a acceder al metodo de la clase padre utilizamos super
		return super.obtenerDetalles() + " Departamento: " + this.departamento;
	}
}
