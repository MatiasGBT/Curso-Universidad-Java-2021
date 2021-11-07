package test;

import aritmetica.Aritmetica;

public class TestExcepciones {

	public static void main(String[] args) {
		//Si no manejamos las excepciones y ocurre un error, nuestro programa
		//termina de forma abrupta.
		
		//int resultado=10/0;
		//System.out.println(resultado); esto da error
		
		//Para manejar excepciones se utiliza el bloque try y catch.
		//Las variables se tienen que definir fuera de este bloque.
		int division=0, resultado=0;
		try {
			division=10/0;
			System.out.println(division);
		} catch (Exception e) {
			System.out.println("Ocurrio una excepci�n:");
			e.printStackTrace(System.out); //Imprime la pila de excepciones
			//Una excepcion puede causar varias excepciones, a esto se lo conoce como
			//pila de excepciones.
		}
		
		System.out.println();
		
		//USO LA EXCEPCI�N QUE YO HICE
		try {
			resultado=Aritmetica.division(10, 0);
		} catch (Exception e) {
			System.out.println("Ocurrio una excepci�n:");
			e.printStackTrace(System.out);
			System.out.println(e.getMessage()); //Esto sirve para solo env�ar el mensaje de
			//la excepcion sin mandar la pila, puede servir para mostrarselo al usuario.
		}
		finally { //Indica que, aunque tengamos una excepcion, siempre se ejecutara este bloque de c�digo
			System.out.println("Se reviso la divisi�n entre 0");
		}
		//Se usa generalmente para cerrar recursos.
		System.out.println(resultado);
		
		/*
		 Un bloque de try puede atajar varias excepciones, se recomienda primero empezar
		 por las de menor jerarqu�a.
		 
		 try {
			resultado=Aritmetica.division(10, 0);
		 } catch (OperacionExcepciones e) {
			System.out.println("Ocurrio una excepci�n de tipo OperacionExcepciones:");
			System.out.println(e.getMessage());
		 }
		 } catch (Exception e) {
			System.out.println("Ocurrio una excepci�n de tipo Exception:");
			System.out.println(e.getMessage());
		 }
		 
		*/
	}

}
