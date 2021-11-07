
public class TestAutoboxingUnboxing {

	public static void main(String[] args) {
		//Cada un de los tipos primitivos tiene una clase asociada conocida como wrapper
		/*
		int - Integer
		long - Long
		float - Float
		 double - Double
		*/
		//Las clases contienen atributos y métodos
		
		//Se puede directamente crear una variable con la clase asociada.
		//La variable se convierte en un objeto.
		Integer entero1=10;
		System.out.println("Entero: " + entero1);
		//Podemos utilizar metodos.
		System.out.println("Entero en cadena: " + entero1.toString());
		System.out.println("Entero double: " + entero1.doubleValue()); //Se puede convertir el valor a otro tipo
		
		//Unboxing es el proceso de extracción el cual consiste en que el objeto
		//que almacena la literal (el dato), se le extrae esta y se la pasa a una variable
		int entero2;
		entero2=entero1;
		System.out.println("int primitivo: " + entero2);
	}

}
