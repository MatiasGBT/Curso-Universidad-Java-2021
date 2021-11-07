package test;

import genericos.ClaseGenerica;

public class TestGenerics {
	public static void main(String[] args) {
		//El tipo con el que vamos a trabajar debe estar entre <>. Tiene que ser un objeto.
		ClaseGenerica<Integer> objetoInt=new ClaseGenerica(15);
		objetoInt.obtenerTipo();
		
		ClaseGenerica<String> objetoString=new ClaseGenerica("Juan");
		objetoString.obtenerTipo();
		
		//El tipo que indicamos (el que esta encerrado entre <>) tiene que ser compatible con el
		//tipo que proporcionamos (en el caso de arriba sería "Juan").
		//El tipo que indicamos puede ser una clase padre y el que proporcionamos puede ser
		//de clases hijas. También puede ser una interface y un tipo que haya utilizado
		//dicha interface.
	}
}
