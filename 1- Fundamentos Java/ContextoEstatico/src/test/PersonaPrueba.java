package test;

import persona.Persona;

public class PersonaPrueba {

	public static void main(String[] args) {
		Persona p1=new Persona("Jose");
		System.out.println("Persona 1: " + p1); 
		//Automaticamente imprimira el método toString y no la persona
		
		Persona p2=new Persona("Carla");
		System.out.println("Persona 2: " + p2);
	}

}
