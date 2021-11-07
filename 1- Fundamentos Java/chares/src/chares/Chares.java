package chares;

public class Chares {

	public static void main(String[] args) {
		char varChar1='\u0021'; //Le asigna a la variable char, el caracter que tiene como codigo en la tabla unicode 0021.
		System.out.println(varChar1);
		
		char varCharDecimal1=33; //Le asigna a la variable char el caracter que tiene como codigo decimal el valor 33.
		System.out.println(varCharDecimal1);
		
		char varCharSimbolo1='!'; //Le asigna a la variable char el caracter especificado.
		System.out.println(varCharSimbolo1);
		
		/*---------*/
		
		var varChar2='\u0021';
		System.out.println(varChar2);
		/*Java detecta el uso de un caracter del tipo unicode por el "\ u" (sin espacio),
		por lo que hara una inferencia de tipo y la variable sera char*/
		
		var varCharDecimal2=33;
		System.out.println(varCharDecimal2);
		/*Java detecta el valor del resultado como un int, por lo que no sera una variable
		del tipo char, podemos convertirla poniendo (char) antes del valor*/
		
		var varCharSimbolo2='!';
		System.out.println(varCharSimbolo2);
		/*Java lo detectara como char debido a las '', si le sumamos un número lo mostrara como int
		por lo que tendremos que convertirlo a char de nuevo:*/
		varCharSimbolo2=(char)'!'+30;
		System.out.println("Segunda muestra: " + varCharSimbolo2);
	}

}
