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
		System.out.println("Ejecuci�n bloque est�tico");
		//Solo se puede acceder a valores/atributos estaticas.
		++Persona.contadorPersonas;
	}
	
	//Bloque no est�tico, se genera cada vez que creemos un nuevo objeto Persona.
	{
		System.out.println("Ejecuci�n de bloque dinamico/no est�tico");
		this.idPersona=Persona.contadorPersonas++;
	}
	
	public Persona() {
		System.out.println("Ejecuci�n del constructor");
	}
	
	public int getIdPersona() {
		return idPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + "]";
	}
	
	
}
