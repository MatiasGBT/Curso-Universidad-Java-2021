package practicaScanner;

import java.util.Scanner;

public class PracticaScanner {

	public static void main(String[] args) {
		System.out.println("Escribe tu nombre:");
		Scanner consola = new Scanner(System.in); //creamos un objeto de la clase Scanner el cual tendrá un atributo System.in (input)
		var nombre=consola.nextLine(); //igualamos una variable al objeto creado con el metodo nextLine (puede ser nextInt, nextString, etc)
		System.out.println("nombre: " + nombre);
		System.out.println("Escribe el titulo:");
		var titulo=consola.nextLine();
		System.out.println("Resultado: " + titulo + " " + nombre);
	}

}
