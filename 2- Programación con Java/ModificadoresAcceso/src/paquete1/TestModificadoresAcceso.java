package paquete1;

public class TestModificadoresAcceso {

	public static void main(String[] args) {
		//Duplique la clase Test para probar el modificador default.
		
		Clase3 clase3=new Clase3();
		clase3.atributoDefault="Cambio desde la prueba";
		System.out.println("Clase3 atributo default: " + clase3.atributoDefault);
		clase3.metodoDefault();
		
		System.out.println();
		
		//El constructor vacío es privado, no se puede utilizar, por lo que cree uno publico.
		Clase4 clase4=new Clase4("publico");
		System.out.println(clase4);
		//clase4.atributoPrivado; //No se puede utilizar directamente el arg
		clase4.setAtributoPrivado("Cambio valor atributo");
		System.out.println("Atributo privado: " + clase4.getAtributoPrivado());
	}

}
