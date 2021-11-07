package forEach;

import domain.Persona;

public class TestForEach {

	public static void main(String[] args) {
		//Es un for "mejorado".
		int edades[]= {5,6,7,8};
		/*
		En este tipo de for, tenemos que definir una variable del mismo tipo de los datos del array.
		Esta variable apuntara a todos los datos guardados en el array y los almacenara.
		En este caso la variable es edad, en el de abajo es p.
		Después de los dos puntos tenemos que poner el nombre del array que queremos iterar.
		*/
		for(int edad: edades) {
			System.out.println("Edad = " + edad);
		}
		//La desventaja de este for es que no utilizamos una variable contador que
		//nos permita utilizar como indice.
		
		Persona personas[]= {new Persona("Juan"), new Persona("Carla"), new Persona("Agustín")};
		for (Persona p: personas) {
			System.out.println("Persona = " + p);
		}
	}

}
