package test;

import aritmetica.Aritmetica;

public class TestExcepciones {

	public static void main(String[] args) {	
		//Con el RuntimeException, el programa termina de manera abrupta.
		int resultado=10;
		resultado=Aritmetica.division(10, 0);
		System.out.println(resultado);
	}

}
