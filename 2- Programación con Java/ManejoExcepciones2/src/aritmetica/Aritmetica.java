package aritmetica;

import excepciones.OperacionExcepciones;

public class Aritmetica {
	
	//Ya no tenemos que escribir la excepcion en la firma/declaraci�n del m�todo.
	public static int division(int numerador, int denominador) {
		if (denominador==0) {
			throw new OperacionExcepciones("Divisi�n entre 0");
		}
		return numerador/denominador;
	}
}
