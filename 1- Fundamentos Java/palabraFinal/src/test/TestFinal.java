package test;

import domain.Persona;

public class TestFinal {

	public static void main(String[] args) {
		//La palabra final en variables hace que no se le pueda modificar el valor
		//una vez puesto.
		final int miVariable=10;
		System.out.println(miVariable);
		miVariable=5;
		
		Mi_Constante.MI_CONSTANTE=2;
		
		//Si a un objeto le agregamos el final, no podemos asignarlo a otra porción de la memoria.
		final Persona p1=new Persona();
		p1=new Persona();
		//Sin embargo, podemos seguir modificando sus atributos.
		p1.setNombre("Juan");
		System.out.println(p1.getNombre());
	}
}
