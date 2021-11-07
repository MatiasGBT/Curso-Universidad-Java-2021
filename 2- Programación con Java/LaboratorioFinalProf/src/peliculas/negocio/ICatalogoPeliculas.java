package peliculas.negocio;

public interface ICatalogoPeliculas {
	//El nombre del archivo/recurso lo ponemos como una constante dentro de la interface.
	String NOMBRE_ARCHIVO="Catalogo.txt";
	
	void agregarPelicula(String nombrePelicula);
	
	void listarPeliculas();
	
	void buscarPelicula(String buscar);
	
	void iniciarCatalogoPeliculas();
}
