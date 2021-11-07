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
	
	//Argumentos variables se refiere a env�ar un n�mero indeterminado de argumentos a un m�todo
	//La sintaxis para esto es el tipo de dato y tres puntos, despu�s el nombre de argumento.
	//Este argumento se convertira en un array, por lo que podremos utilizar metodos como .length
	private static void imprimirNumeros(int... numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento: " + numeros[i]);
		}
		System.out.println();
	}

	//El parametro de argumentos variables tiene que ser el �ltimo que se env�a, no puede
	//ser el primero o estar en el medio
	private static void variosParametros(String nombre, int... numeros) {
		System.out.println("Nombre: " + nombre);
		imprimirNumeros(numeros);
	}
}
