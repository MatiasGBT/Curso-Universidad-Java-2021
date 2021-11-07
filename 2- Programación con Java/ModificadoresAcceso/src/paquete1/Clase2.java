package paquete1;

public class Clase2 {
	//El modificador de acceso protected NO afecta a clases,
	//pero si a variables, métodos y constructores.
	
	//Podremos acceder a este atributo desde clases hijas. También se podra acceder a este atributo
	//si estamos dentro del mismo paquete.
	protected String atributoProtected="Valor atributo protected";
	
	//Los constructores protected se podran usar desde clases hijas, no se puede heredar un constructor
	//pero se puede utilizar la palabra super para llamarlo desde una clase hija.
	protected Clase2() {
		System.out.println("Constructor protected");
	}
	
	public Clase2(String arg) {
		System.out.println("Constructor publico (en la clase 2)");
	}
	
	//Ya no se podra acceder a este metodo desde otra clase si no es una subclase.
	protected void metodoProtected() {
		System.out.println("Metodo protected");
	}
}
