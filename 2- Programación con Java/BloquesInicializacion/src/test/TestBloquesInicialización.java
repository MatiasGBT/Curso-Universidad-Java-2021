package test;

import domain.Persona;

public class TestBloquesInicialización {

	public static void main(String[] args) {
		//No es lo más común utilizar estos bloques, pero puede ser pregunta de
		//certificación.
		Persona p1=new Persona();
		System.out.println("Persona" + p1.getIdPersona() + " =" + p1); //p1 y p1.toString() es lo mismo
		
		System.out.println();
		
		Persona p2=new Persona();
		System.out.println("Persona" + p2.getIdPersona() + " =" + p2);
		//Ya no se ejecuta el bloque estático
	}

}
