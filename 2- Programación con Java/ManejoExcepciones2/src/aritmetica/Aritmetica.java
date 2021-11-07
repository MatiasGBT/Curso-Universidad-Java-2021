package aritmetica;

import excepciones.OperacionExcepciones;

public class Aritmetica {
	
	//Ya no tenemos que escribir la excepcion en la firma/declaración del método.
	public static int division(int numerador, int denominador) {
		if (denominador==0) {
			throw new OperacionExcepciones("División entre 0");
		}
		return numerador/denominador;
	}
}
