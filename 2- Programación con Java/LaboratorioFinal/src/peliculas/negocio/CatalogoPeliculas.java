package peliculas.negocio;

//Contiene las operaciones necesarias de la aplicación CatalogoPeliculas
public interface CatalogoPeliculas {
	
	void agregarPelicula(String nombreArchivo);
	
	void listarPeliculas(String nombreArchivo);
	
	void buscarPelicula(String nombreArchivo);
	
	void iniciarArchivo(String nombreArchivo);
	
	void borrarPelicula(String nombreArchivo);
}
