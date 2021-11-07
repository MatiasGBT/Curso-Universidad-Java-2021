package domain;

//Hay 2 tipos de bloque de inicializacion, estaticos y no estaticos.
//Ambos tipos se ejecutan antes del constructor.
public class Persona {
	private final int idPersona;
	private static int contadorPersonas;
	
	//Bloque de inicializacion estatico, se ejecuta antes del constructor y de cualquier
	//bloque de inicializacion no estatico.
	//Se genera solo la primera vez que se carga en memoria la clase Persona.
	static {
		System.out.println("Ejecución bloque estático");
		//Solo se puede acceder a valores/atributos estaticas.
		++Persona.contadorPersonas;
	}
	
	//Bloque no estático, se genera cada vez que creemos un nuevo objeto Persona.
	{
		System.out.println("Ejecución de bloque dinamico/no estático");
		this.idPersona=Persona.contadorPersonas++;
	}
	
	public Persona() {
		System.out.println("Ejecución del constructor");
	}
	
	public int getIdPersona() {
		return idPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + "]";
	}
	
	
}
