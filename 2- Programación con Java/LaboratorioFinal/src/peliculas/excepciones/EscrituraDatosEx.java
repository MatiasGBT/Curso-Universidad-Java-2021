package peliculas.excepciones;

public class EscrituraDatosEx extends AccesoDatosEx{

	public EscrituraDatosEx(String mensaje) {
		super(mensaje);
	}

	public static String ingresoString(String res) throws AccesoDatosEx {
		if (res.isBlank()) {
			throw new AccesoDatosEx("Error: no se ingreso ningun dato.");
		}
		return res;
	}
	
	public static int ingresoInt(int res) throws AccesoDatosEx {
		if (res<=0 || res>5) {
			throw new AccesoDatosEx("Error: acci�n no encontrada en el men�.");
		}
		return res;
	}
}
