package paquete2;

import paquete1.Clase2;

public class ClaseHija extends Clase2{
	
	
	public ClaseHija() {
		super(); //utilizamos al constructor de la clase padre
		
		//Podremos acceder al atributo de la clase padre.
		this.atributoProtected="Modificacion atributo protected";
		System.out.println("Atributo protegido: " + this.atributoProtected);
		
		//Podremos hacer uso del metodo de la clase padre.
		this.metodoProtected();
	}
}
