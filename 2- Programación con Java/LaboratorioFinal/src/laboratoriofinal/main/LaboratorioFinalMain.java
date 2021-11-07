package laboratoriofinal.main;

import javax.swing.JOptionPane;
import peliculas.datos.AccesoDatosImpl;
import peliculas.negocio.CatalogoPeliculasImpl;
import peliculas.excepciones.*;

public class LaboratorioFinalMain {

	public static void main(String[] args) {
		int menu;
		String res="";
		CatalogoPeliculasImpl catalogo=new CatalogoPeliculasImpl();
		
		do {
			menu=0;
			try {
				menu=EscrituraDatosEx.ingresoInt(Integer.parseInt(JOptionPane.showInputDialog("Ingresa lo que queres hacer:"
						+ "\n1-Iniciar archivo (lo crea si no esta creado y lo abre)."
						+ "\n2-Agregar pel�cula."
						+ "\n3-Listar pel�culas (las muestra en consola)."
						+ "\n4-Buscar pel�cula (por nombre)."
						+ "\n5-Borrar una pel�cula del catalogo.")));
			} catch (Exception e) {
				e.printStackTrace(System.out);
			}

			
			switch (menu) {
			case 1:
				catalogo.iniciarArchivo("Catalogo.txt");
				break;
			case 2:
				catalogo.agregarPelicula("Catalogo.txt");
				break;
			case 3:
				catalogo.listarPeliculas("Catalogo.txt");
				break;
			case 4:
				catalogo.buscarPelicula("Catalogo.txt");
				break;
			case 5:
				catalogo.borrarPelicula("Catalogo.txt");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Acci�n inv�lida");
				break;
			}
			
			try {
				res=EscrituraDatosEx.ingresoString(JOptionPane.showInputDialog("�Desea hacer algo m�s?"));
			} catch (Exception e) {
				e.printStackTrace(System.out);
			}
			
		} while (res.equalsIgnoreCase("si"));
		AccesoDatosImpl acceso=new AccesoDatosImpl();
		acceso.borrar("Catalogo.txt");
	}
}
