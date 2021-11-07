package domain;

public class Empleado extends Persona{
	//Como esta clase no tendrá un hijo, ponemos los atributos de manera privada para mayor seguridad
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	//Utilizaremos un constructor con el nombre (que viene de la clase padre) y el sueldo
	public Empleado (String nombre, double sueldo) {
		//Para inicializar el atributo de nombre de la clase padre, tenemos que llamar el constructor de la clase padre con super
		super(nombre); //Tiene que ser la primera línea
		this.idEmpleado=++Empleado.contadorEmpleado;
		//Poner el ++ antes del atributo deja un incremento en espera, por lo que lo incrementaría cuando vuelva a pasar el código
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		//Los objetos String no pueden ser modificados, por lo que utilizamos un objeto del tipo
		//StringBuilder y a ese objeto le utilizamos el método append para concatenar.
		
		//Para crear esto automatico: alt + mayus + s, generate toString() y en code style
		//selecciono StringBuilder/StringBuffer
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", sueldo=");
		builder.append(this.sueldo);
		builder.append("]");
		
		/* Para no ir atributo por atributo, podemos concatenar todos los valores de la clase padre
		builder.append(", nombre=");
		builder.append(this.nombre);
		Así:*/
		builder.append(" ");
		builder.append(super.toString()); //Reutilizamos el método toString de la clase padre
		return builder.toString();
	}
	
	
	
}
