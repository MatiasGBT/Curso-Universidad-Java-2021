package peliculas.datos;

import peliculas.domain.*;

//Contiene las operaciones a ejecutar en el archivo de películas.txt
public interface AccesoDatos {
	
	void existe(String nombreArchivo);
	
	void listar(Pelicula catalogo[]);
	
	void escribir(Pelicula pelicula, String nombreArchivo);
	
	void buscar(String nombreArchivo, Pelicula catalogo[]);
	
	public static void crear(String nombreArchivo) {}
	
	void borrar(String nombreArchivo);
	
	void abrir(String nombreArchivo);
	
	void borrarLinea(String nombreArchivo, Pelicula catalogo[], int id);
	
	public static void sobreescribirArchivo() {}
}
