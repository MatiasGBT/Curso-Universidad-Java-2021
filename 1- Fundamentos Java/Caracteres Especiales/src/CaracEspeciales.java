
public class CaracEspeciales {

	public static void main(String[] args) {
		var nombre="Karla";
		/*var es un tipo de variable que detecta automaticamente que tipo de
		variable es seg�n su valor, como su valor es una cadena, var lo entendera como String*/

		System.out.println("Nueva l�nea: \n" + nombre); //Lo muestra en la l�nea de abajo.
		System.out.println("Tabulador: \t" + nombre); //Lo muestra dsp de un tabulado.
		System.out.println("Retroceso: \b" + nombre); //Borra un caracter anterior a la concatenaci�n, podemos poner varias \b. (No funciona en Eclipse)
		System.out.println("Comillas simples: \'" + nombre + "\'"); //Encierra la cadena entre comillas simples.
		System.out.println("Comilla doble: \"" + nombre + "\""); //Encierra la cadena entre comillas dobles.
	}

}
