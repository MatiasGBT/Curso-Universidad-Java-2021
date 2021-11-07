package peliculas.excepciones;

import peliculas.domain.Pelicula;

public class LecturaDatosEx extends AccesoDatosEx{
	
	public LecturaDatosEx(String mensaje) {
		super(mensaje);
	}

	public static Pelicula lecturaString(Pelicula res) throws AccesoDatosEx {
		if (res==null) {
			throw new AccesoDatosEx("Error: el valor de este campo es nulo.");
		}
		return res;
	}
}
