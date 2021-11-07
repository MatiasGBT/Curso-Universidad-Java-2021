package excepciones;

//Cambiamos el extends por RuntimeException
public class OperacionExcepciones extends RuntimeException{

	public OperacionExcepciones(String mensaje) {
		super(mensaje);
	}
}
