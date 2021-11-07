package aritmetica;

import excepciones.OperacionExcepciones;

public class Aritmetica {
	
	//Vamos a crear nuestras propias excepciones
	//throws OperacionExcepciones indica que este método posiblemente arroje una excepcion
	public static int division(int numerador, int denominador) throws OperacionExcepciones {
		if (denominador==0) {
			//Throw (arrojar en inglés) indica que vamos a crear un nuevo
			//objeto de tipo excepcion
			throw new OperacionExcepciones("División entre 0");
		}
		return numerador/denominador;
	}
}
