package peliculas.presentacion;

import java.util.Scanner;
import peliculas.negocio.*;

public class CatalogoPeliculasPresentacion {

	public static void main(String[] args) {
		var opcion=-1;
		Scanner scanner=new Scanner(System.in);
		ICatalogoPeliculas catalogo=new CatalogoPeliculasImpl();
		
		while (opcion!=0) {
			System.out.println("Elige una opci�n: \n"
					+ "1.Iniciar catalogo de pel�culas. \n"
					+ "2.Agregar pel�cula. \n"
					+ "3.Lista pel�culas. \n"
					+ "4.Buscar pel�cula. \n"
					+ "0.Salir.");
			opcion=Integer.parseInt(scanner.nextLine());
			
			switch (opcion) {
			case 1:
				catalogo.iniciarCatalogoPeliculas();
				break;
			case 2:
				System.out.println("Introduce el nombre de la pel�cula:");
				var nombrePelicula=scanner.nextLine();
				catalogo.agregarPelicula(nombrePelicula);
				break;
			case 3:
				catalogo.listarPeliculas();
				break;
			case 4:
				System.out.println("Introduce el nombre de la pel�cula a buscar:");
				var buscar=scanner.nextLine();
				catalogo.buscarPelicula(buscar);
				break;
			case 0:
				System.out.println("�Hasta pronto!");
				break;
			default:
				System.out.println("Opci�n no reconocida.");
				break;
			}
		}

	}

}
