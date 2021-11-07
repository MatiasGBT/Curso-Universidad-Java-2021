package peliculas.domain;

//Representa los objetos película utilizados en la aplicación catálogo películas.
public class Pelicula {
	private String nombre;
	private String director;
	private double duracion;
	private String genero;
	private int idPelicula;
	private static int contadorPelicula;
	
	public Pelicula() {
		this.idPelicula=Pelicula.contadorPelicula++;
	}

	public Pelicula(String nombre, String director, double duracion, String genero) {
		this();
		this.nombre = nombre;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
	}
	
	

	public int getIdPelicula() {
		return idPelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + ", nombre=" + nombre +", director=" + director
				+ ", duracion=" + duracion + ", genero=" + genero + "]";
	}
}
