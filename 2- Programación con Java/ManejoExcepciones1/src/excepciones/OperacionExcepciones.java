package excepciones;

//Como hereda de la clase Exception, va a ser una excepcion del tipo check
//osea que se tendra que utilizar un bloque try y catch.
public class OperacionExcepciones extends Exception{

	//Lo que normalmente se hace cuando heredamos de la clase Exception es que mandamos un
	//mensaje que debemos propagar hacia la clase padre.
	public OperacionExcepciones(String mensaje) {
		super(mensaje); //Con el super propagamos el mensaje a la clase padre.
	}
}

/*
 Actualmente se recomienda utilizar la clase RuntimeException porque permite un código más limpio
 y solo usar la clase Exception cuando estamos seguros que ocurrira una excepcion.
 En el proyecto ManejoExcepciones2 realizo el mismo código pero extendiendo de la clase
 RuntimeException.
*/
