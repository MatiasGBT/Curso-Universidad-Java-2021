package test;

import domain.Persona;

public class TestBloquesInicializaci�n {

	public static void main(String[] args) {
		//No es lo m�s com�n utilizar estos bloques, pero puede ser pregunta de
		//certificaci�n.
		Persona p1=new Persona();
		System.out.println("Persona" + p1.getIdPersona() + " =" + p1); //p1 y p1.toString() es lo mismo
		
		System.out.println();
		
		Persona p2=new Persona();
		System.out.println("Persona" + p2.getIdPersona() + " =" + p2);
		//Ya no se ejecuta el bloque est�tico
	}

}
