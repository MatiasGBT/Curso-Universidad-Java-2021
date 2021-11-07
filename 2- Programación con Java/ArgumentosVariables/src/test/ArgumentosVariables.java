package test;

public class ArgumentosVariables {

	public static void main(String[] args) {
		imprimirNumeros(1,2);
		imprimirNumeros(3,4,5);
		imprimirNumeros(6,7,8,9);
		imprimirNumeros(10);
		System.out.println();
		variosParametros("Pedro",5,6,7,8,9);
	}
	
	//Argumentos variables se refiere a envíar un número indeterminado de argumentos a un método
	//La sintaxis para esto es el tipo de dato y tres puntos, después el nombre de argumento.
	//Este argumento se convertira en un array, por lo que podremos utilizar metodos como .length
	private static void imprimirNumeros(int... numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento: " + numeros[i]);
		}
		System.out.println();
	}

	//El parametro de argumentos variables tiene que ser el último que se envía, no puede
	//ser el primero o estar en el medio
	private static void variosParametros(String nombre, int... numeros) {
		System.out.println("Nombre: " + nombre);
		imprimirNumeros(numeros);
	}
}
