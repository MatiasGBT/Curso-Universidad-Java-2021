package peliculas.domain;

public class Pelicula {
	private String nombre;
	
	public Pelicula() {
		
	}
	
	public Pelicula(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.nombre;
		//Editamos el m�todo toString ya que cuando utilicemos el m�todo buscar
		//tendremos que buscar una cadena dentro de otra y se complicara.
	}
}
