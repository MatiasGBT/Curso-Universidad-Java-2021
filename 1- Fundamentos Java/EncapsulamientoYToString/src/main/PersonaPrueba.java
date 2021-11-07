package main;

import persona.Persona;

public class PersonaPrueba {

	public static void main(String[] args) {
		Persona p1=new Persona("Juan",500.05,false);
		System.out.println(p1.getNombre());
		p1.setNombre("Juan Carlos");
		System.out.println(p1.getNombre());
		
		System.out.println(p1.toString());
	}

}
