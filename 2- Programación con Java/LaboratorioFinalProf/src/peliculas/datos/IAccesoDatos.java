package peliculas.datos;

import java.util.List;

import peliculas.domain.Pelicula;
import peliculas.excepciones.*;

public interface IAccesoDatos {
	//Este método puede generar una excepcion, por ende hay que poner el throws.
	boolean existe(String nombreArchivo) throws AccesoDatosEx;
	
	List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
	
	void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
	
	String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
	
	void crear(String nombreArchivo) throws AccesoDatosEx;
	
	void borrar(String nombreArchivo) throws AccesoDatosEx;
}
