package peliculas.negocio;

import javax.swing.JOptionPane;

import peliculas.datos.AccesoDatosImpl;
import peliculas.domain.Pelicula;

public class CatalogoPeliculasImpl implements CatalogoPeliculas{
	
	private Pelicula catalogo[]=new Pelicula[100];
	
	@Override
	public void agregarPelicula(String nombreArchivo) {
		int i=0;
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre de la peli para agregar");
		String director=JOptionPane.showInputDialog("Ingrese el nombre del director de la peli para agregar");
		double duracion=0;
		try {
			duracion=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la duraci�n de la peli para agregar"));
		} catch (NumberFormatException e) {
			System.out.println("Error, debe ingresar un n�mero. Si tiene decimales utilice '.' y no ','.");
			e.printStackTrace(System.out);
		}
		String genero=JOptionPane.showInputDialog("Ingrese el genero de la peli para agregar");
		
		for (i = 0; i < catalogo.length && catalogo[i]!=null; i++);
		if (i<catalogo.length) {
			catalogo[i]=new Pelicula(nombre,director,duracion,genero);
			AccesoDatosImpl acceso=new AccesoDatosImpl();
			acceso.escribir(catalogo[i], nombreArchivo);
		}
	}

	@Override
	public void listarPeliculas(String nombreArchivo) {
		AccesoDatosImpl acceso=new AccesoDatosImpl();
		acceso.listar(catalogo);
	}

	@Override
	public void buscarPelicula(String nombreArchivo) {
		AccesoDatosImpl acceso=new AccesoDatosImpl();
		acceso.buscar(nombreArchivo, catalogo);
	}

	//Este m�todo crea el archivo y lo abre.
	@Override
	public void iniciarArchivo(String nombreArchivo) {
		AccesoDatosImpl acceso=new AccesoDatosImpl();
		acceso.existe(nombreArchivo);
	}

	@Override
	public void borrarPelicula(String nombreArchivo) {
		int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la pel�cula a borrar"));
		if (catalogo[id]!=null) {
			AccesoDatosImpl acceso=new AccesoDatosImpl();
			acceso.borrarLinea(nombreArchivo, catalogo, id);
			catalogo[id]=null;
			System.out.println("Se borro la pel�cula correctamente.");
		} else {
			System.out.println("No se encontro la pel�cula.");
		}
	}

}
