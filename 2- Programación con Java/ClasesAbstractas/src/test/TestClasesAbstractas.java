package test;

import domain.*;

public class TestClasesAbstractas {

	public static void main(String[] args) {
		//No se pueden crear objetos de clases abstractas, el objetivo es trabajar con
		//las clases hijas.
		//En ocasiones se marcan clases como abstractas aunque no tengan metodos abstractos
		//solo para que no se puedan crear objetos de esta clase.
		//FiguraGeometrica figura=new FiguraGeometrica();
		
		//Utilizamos polimorfismo para definir un objeto de la clase hija.
		FiguraGeometrica figura=new Rectangulo("Rectangulo");
		figura.dibujar();
	}

}
