package test;

import java.util.*;

public class TestColecciones {

	public static void main(String[] args) {
		//Tanto List como Set son clases hijas de la interface Collection,
		//que proviene del paquete java.util
		
		//Creamos un objeto que implementa la interface de List, osea, ArrayList.
		List miLista = new ArrayList();
		
		//Una lista es similiar a un array, sin embargo, puede crecer dinamicamente.
		//No hace falta indicar la cantidad de elementos que tendra.
		miLista.add("Lunes"); //Maneja objetos. Recorda que String es un objeto.
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Sabado");
		miLista.add("Domingo");
		//En el tipo Lista se pueden duplicar elementos.
		miLista.add("Domingo");
		imprimir(miLista);
		
		System.out.println();
		
		//A diferencia del set, la lista mantiene los objetos de su interior en el orden
		//en el que los agregamos.
		
		/*
		 PARA NO REPETIR CODIGO VOY A APLICAR UN METODO QUE IMPLIQUE POLIMORFISMO
		//Para recorrer la lista podemos utilizar el ciclo forEach.
		for(Object elemento: miLista) {
			System.out.println(elemento);
		}
		
		//Podemos utilizar una función lambda (o funcion flecha), funcionan igual.
		miLista.forEach(elemento -> {	
			System.out.println(elemento);
		});
		*/
		
		//Cuando imprimimos un set, este no se imprime en el orden en el que agregamos sus elementos
		//si aparece en orden es por pura coincidencia.
		Set miSet = new HashSet();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		miSet.add("Sabado");
		miSet.add("Domingo");
		//En el tipo Set NO se pueden duplicar elementos.
		miSet.add("Domingo"); //no se va a mostrar
		imprimir(miSet);
		
		System.out.println();
		
		Map miMapa = new HashMap();
		//En lugar de usar el metodo add, que es de la interface collections, se utiliza put,
		//el cual proviene de la interface Map.
		miMapa.put("Valor1", "Juan");//Agrega una llave y le asocia un valor, la llave puede ser cualquier tipo Object
		miMapa.put("Valor2", "Carla");
		miMapa.put("Valor3", "Jose");
		
		//Para acceder a los elementos de un mapa podemos hacerlo de la siguiente manera:
		String elemento=(String) miMapa.get("Valor1");
		System.out.println(elemento);
		System.out.println();
		
		//Si queremos recuperar todas las llaves utilizamos el metodo keySet()
		imprimir(miMapa.keySet());
		//Convierte a miMapa en un Set, por lo que podemos utilizar el metodo imprimir.
		System.out.println();
		
		//Para recuperar los valores usamos el metodo values()
		imprimir(miMapa.values());
	}
	
	//Recibe el tipo más generico, en este caso la interface Collections
	public static void imprimir(Collection coleccion) {
		for(Object elemento: coleccion) {
			System.out.println(elemento);
		}
	}
}
