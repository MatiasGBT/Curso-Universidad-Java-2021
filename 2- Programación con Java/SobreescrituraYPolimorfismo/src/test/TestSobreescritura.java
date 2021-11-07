package test;

import domain.*;

public class TestSobreescritura {

	public static void main(String[] args) {
		Gerente g1=new Gerente("Juan",5000.0,"Sistemas");
		System.out.println("Gerente 1: " + g1.obtenerDetalles());
		System.out.println();
		
		
		
		//Polimorfismo
		/*
		Para el polimorfismo se necesita antes haber sobreescrito un m�todo de la clase padre.
		Polimorfismo significa multiples comportamientos. Este comportamiento solo
		Se visualiza en tiempo de ejecuci�n.
		*/
		Empleado empleado=new Empleado("Juan", 5000);
		imprimir(empleado);
		
		//Se puede reutilizar una variable padre y convertirla en una clase hija:
		empleado=new Gerente("Carla", 10000, "Contabilidad");
		imprimir(empleado);
		/*
		 Tambi�n se puede:
		 Gerente gerente=new Gerente("Carla", 10000, "Contabilidad");
		 imprimir(gerente); va a funcionar igual
		*/
	}

	//Definimos un m�todo el cual va a tener multiples comportamientos dependiendo del
	//tipo de objeto al que apunta en memoria.
	public static void imprimir(Empleado empleado) { 
		//Se utiliza el tipo de la clase padre, sin embargo la variable puede comportarse como un hijo.
		System.out.println("Empleado: " + empleado.obtenerDetalles());
	}
	//El principio del polimorfismo es poder tener un metodo m�s generico
}
