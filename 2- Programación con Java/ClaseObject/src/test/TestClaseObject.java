package test;

import domain.Empleado;

public class TestClaseObject {

	public static void main(String[] args) {
		Empleado empleado1=new Empleado("Juan",5000.0);
		Empleado empleado2=new Empleado("Juan",5000.0);
		
		if (empleado1==empleado2) {
			System.out.println("Tienen la misma referencia en memoria");
		} else {
			System.out.println("Tienen distinta referencia en memoria");
		}
		
		//Con el == solo lograremos preguntar por la referencia en memoria (son distintos debido al new),
		//si queremos preguntar por el contenido tenemos que usar equals (lo agrego en Empleado)
		//junto con el hashCode.
		
		//Comparamos la información de cada objeto.
		if (empleado1.equals(empleado2)) {
			System.out.println("Los objetos son iguales en contenido");
		} else {
			System.out.println("Los objetos son distintos en contenido");
		}
		
		//Comparamos con hashCode
		if (empleado1.hashCode()==empleado2.hashCode()) {
			System.out.println("El valor hashCode es igual");
		} else {
			System.out.println("El valor hashCode es distinto");
		}
		
		System.out.println();
		
		//Estos métodos no ignoran las mayúsculas/minúsculas:
		Empleado empleado3=new Empleado("juan",5000.0);
		if (empleado1.equals(empleado3)) {
			System.out.println("Los objetos son iguales en contenido");
		} else {
			System.out.println("Los objetos son distintos en contenido");
		}
		
		//Comparamos con hashCode
		if (empleado1.hashCode()==empleado3.hashCode()) {
			System.out.println("El valor hashCode es igual");
		} else {
			System.out.println("El valor hashCode es distinto");
		}
	}

}
