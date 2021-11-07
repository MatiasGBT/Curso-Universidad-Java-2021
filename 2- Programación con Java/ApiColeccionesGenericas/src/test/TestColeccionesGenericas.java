package test;

import java.util.*;

public class TestColeccionesGenericas {

	public static void main(String[] args) {
		//Todo el API de collections soporta tipos genericos, por eso se puede utilizar <String>.
		
		List<String> miLista = new ArrayList<>(); //Escribir de nuevo el tipo es reduntante, por eso se omite.
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Sabado");
		miLista.add("Domingo");
		//imprimir(miLista);
		//Además de la ventaja de validación al agregar elementos, no se tiene que utilizar
		//la conversión de object al tipo que deseemos.
		String elemento1=miLista.get(0); //Ya no se tiene que poner (String).
		System.out.println(elemento1);
		
		System.out.println();
		
		Set<String> miSet = new HashSet<>();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		miSet.add("Sabado");
		miSet.add("Domingo");
		imprimir(miSet);
		
		System.out.println();
		
		Map<String, String> miMapa = new HashMap<>();
		miMapa.put("Valor1", "Juan");
		miMapa.put("Valor2", "Carla");
		miMapa.put("Valor3", "Jose");
		
		String elemento2=miMapa.get("Valor1");
		System.out.println(elemento2);
		System.out.println();
		
		imprimir(miMapa.keySet());
		System.out.println();
		
		imprimir(miMapa.values());
	}
	
	public static void imprimir(Collection<String> coleccion) {
		for(String elemento: coleccion) { //El tipo de elemento no es Object, ahora es String
			System.out.println(elemento);
		}
	}
}
