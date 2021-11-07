package paquete1;

//El modificador de acceso default simboliza la falta de modificador.

//Una clase con el modificador default no puede ser utilizada fuera de su paquete
class Clase3 {
	//El modificador de acceso default afecta a clases, variables, métodos y constructores.
	
	//Tanto los atributos, como el constructor y los metodos solo se podrán acceder
	//en una clase que este en el mismo paquete.
	String atributoDefault="Valor atributo default";
	
	Clase3() {
		System.out.println("Constructor default");
	}
	
	void metodoDefault() {
		System.out.println("Metodo default/package");
	}
}
