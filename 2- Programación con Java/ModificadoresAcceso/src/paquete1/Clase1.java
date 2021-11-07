package paquete1;

//Esta clase puede ser utilizada por otra que este en el mismo paquete o en otro.
public class Clase1 {
	//El modificador de acceso public afecta a clases, variables, métodos y constructores.
	
	//Podremos acceder a este atributo desde cualquier otra clase, tambien se puede editar.
	public String atributoPublico="Valor atributo publico";
	
	//Se podra acceder desde otras clases a este constructor para crear objetos de esta clase.
	public Clase1() {
		System.out.println("Constructor publico");
	}
	
	//Se puede utilizar desde cualquier clase.
	public void metodoPublico() {
		System.out.println("Metodo publico");
	}
}
