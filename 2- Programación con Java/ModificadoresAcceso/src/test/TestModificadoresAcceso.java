package test;

import paquete1.*;
import paquete2.*;

public class TestModificadoresAcceso {

	public static void main(String[] args) {
		//Si la clase es public, podremos crear objetos de esa clase desde otra
		Clase1 clase1=new Clase1(); //Constructor: Clase1();
		System.out.println(clase1);
		System.out.println(clase1.atributoPublico);
		clase1.metodoPublico();
		
		System.out.println();
		
		//No se podran crear objetos de la clase protected fuera de su paquete si el constructor
		//es protected
		Clase2 clase2=new Clase2("publico"); //Para utilizarlo cree un constructor public
		System.out.println(clase2);
		
		System.out.println();
		
		ClaseHija claseHija=new ClaseHija();
		System.out.println(claseHija);
		
		//La clase default no se puede utilizar ya que test no esta en el mismo paquete.
		//Si lo estuviera ya podría crear objetos (pruebas en copia de clase Test).
	}

}
