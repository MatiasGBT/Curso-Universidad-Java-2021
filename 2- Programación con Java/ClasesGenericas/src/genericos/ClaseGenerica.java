package genericos;

//Un tipo generico en Java es como un comodín. Cuando definimos nuestra clase,
//no indicamos el tipo de dato que almacenara nuestra clase,
//si no que se especificara cuando creemos un objeto.

/*
 Tipos genericos:
 -E: Element (es utilizado normalmente por el framework Collections en Java).
 -K: Key (se utiliza generalmente en mapas).
 -N: Number (utilizado para numeros).
 -T: Type (representa un tipo, osea, una clase).
 -V: Value (Representa un valor, también se usa en mapas).
*/

//Utilizamos <T> para indicar que es un tipo generico.
public class ClaseGenerica<T> {
	private T objeto;
	
	public ClaseGenerica(T objeto) {
		this.objeto=objeto;
	}
	
	public void obtenerTipo() {
		System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
		//Con el método getClass y getSimpleName obtendremos el tipo que se utilizo
		//para crear un objeto de esta clase.
	}
}
