package peliculas.negocio;

import peliculas.datos.*;
import peliculas.domain.Pelicula;
import peliculas.excepciones.AccesoDatosEx;
import peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas{

	//Creamos un objeto de IAccesoDatos
	private final IAccesoDatos datos;
	
	//Le agregamos un constructor
	public CatalogoPeliculasImpl() {
		this.datos = new AccesoDatosImpl();
	}

	@Override
	public void agregarPelicula(String nombrePelicula) {
		Pelicula pelicula=new Pelicula(nombrePelicula);
		boolean anexar=false;
		try {
			anexar=datos.existe(NOMBRE_ARCHIVO);
			datos.escribir(pelicula, NOMBRE_ARCHIVO, anexar);
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace(System.out);
		}
	}

	@Override
	public void listarPeliculas() {
		try {
			var peliculas=this.datos.listar(NOMBRE_ARCHIVO);
			for(var pelicula: peliculas) {
				System.out.println("Pelicula: " + pelicula);
			}
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace(System.out);
		}
		
	}

	@Override
	public void buscarPelicula(String buscar) {
		String resultado=null;
		try {
			resultado=this.datos.buscar(NOMBRE_ARCHIVO, buscar);
		} catch (AccesoDatosEx e) {
			System.out.println("Error de acceso a datos");
			e.printStackTrace(System.out);
		}
		System.out.println("Resultado: " + resultado);
	}

	@Override
	public void iniciarCatalogoPeliculas() {
		try {
			if (this.datos.existe(NOMBRE_ARCHIVO)) {
				datos.borrar(NOMBRE_ARCHIVO);
				datos.crear(NOMBRE_ARCHIVO);
			} else {
				datos.crear(NOMBRE_ARCHIVO);
			}
		} catch (AccesoDatosEx e) {
			System.out.println("Error al iniciar el catalogo de películas");
			e.printStackTrace(System.out);
		}
		
	}
	
}
