
public class OperadorTernario {
	public static void main(String[] args) {
		var num1=1;
		var num2=2;
		var num3=3;
		
		//El operador ternario no se recomienda para problemas complejos
		
		var resultado = (num3>num2) ? "verdadero" : "falso" ;
		System.out.println(resultado);
		//Después del ? va lo que pasaría si la expresion es verdadera, despues de los : lo que va si es falsa.
		
		resultado = (num1>num2) ? "verdadero" : "falso" ;
		System.out.println(resultado);
		
		//Sirve para simplicar el if else
		
		var numero=8;
		resultado=(numero%2==0) ? "numero par" : "numero impar";
		System.out.println(resultado);
		//El caracter % da como resultado el resto de la división entre 2 numeros
	}
}
