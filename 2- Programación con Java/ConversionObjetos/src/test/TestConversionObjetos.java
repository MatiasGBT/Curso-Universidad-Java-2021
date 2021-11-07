package test;

import domain.*;

public class TestConversionObjetos {

	public static void main(String[] args) {
		Empleado empleado;
		
		empleado= new Escritor("Juan", 5000.0, TipoEscritura.CLASICO);
		//System.out.println("Empleado: " + empleado);
		System.out.println(empleado.obtenerDetalles());
		
		System.out.println();

		//Downcasting
		//((Escritor)empleado).getTipoEscritura();
		Escritor escritor=(Escritor) empleado;
		System.out.println(escritor.getTipoEscritura());
		
		//Upcasting
		Empleado empleado2=escritor;
		System.out.println(empleado2.obtenerDetalles());
	}

}
