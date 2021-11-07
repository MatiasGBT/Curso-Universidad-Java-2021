package peliculas.datos;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import peliculas.domain.Pelicula;

public class AccesoDatosImpl implements AccesoDatos{

	//Verificar si el archivo existe.
	public void existe(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		if (archivo.exists()) {
			System.out.println("El archivo existe y se encuentra en la carpeta Catalogo"
					+ "\ndentro del directorio raíz de la aplicación.");
			abrir(nombreArchivo);
		} else {
			crear(nombreArchivo);
			abrir(nombreArchivo);
		}
	}

	//Crear una lista con los nombres de las películas.
	public void listar(Pelicula catalogo[]) {
		List<Pelicula> miLista = new ArrayList<>();
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i]!=null) {
				miLista.add(catalogo[i]);
			}
		}
		imprimir(miLista);
	}

	//Escribir/anexar peliculas en el archivo.txt
	public void escribir(Pelicula pelicula, String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(pelicula);
			salida.close();
			System.out.println("Se ha anexado información al archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	}

	//Busca las peliculas que contengan cierta palabra en su nombre y las guarda en un array.
	public void buscar(String nombreArchivo, Pelicula catalogo[]) {
		Pelicula subCatalogo[]=new Pelicula[catalogo.length];
		String buscar=JOptionPane.showInputDialog("Ingresa el nombre de la peli que buscas");
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i]!=null && catalogo[i].getNombre().contains(buscar)) {
				subCatalogo[i]=catalogo[i];
			}
		}
		listar(subCatalogo);
	}

	//Creamos el archivo.txt (este método no se usa, es parte de otro método).
	private void crear(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("Se a creado el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
	}

	//Borrar el archivo.
	public void borrar(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
        try{
            boolean estado=archivo.delete();
            if (!estado) {
                System.out.println("Error, no se ha podido eliminar el archivo");
           }else{
                System.out.println("Se ha eliminado el archivo exitosamente");
           }
        }catch(Exception e){
        	e.printStackTrace(System.out);
        }
	}
	
	//Abrir el archivo.
	public void abrir(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			Desktop.getDesktop().open(archivo); //Metodo para abrir el archivo, incluye excepcion IO
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	//Borrar una línea del archivo (Una película).
	public void borrarLinea(String nombreArchivo, Pelicula catalogo[], int id) {
		String lineToRemove=catalogo[id].toString();
		
		File inputFile = new File(nombreArchivo);
		File outputFile = new File("CatalogoNuevo.txt");

		 try {
			 BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			 BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

		 String currentLine;

		 while((currentLine = reader.readLine()) != null) {                        
		     if(currentLine.trim().equals(lineToRemove)){ 
		         continue;
		     }
		     writer.write(currentLine + System.getProperty("line.separator"));
		 }       

		 writer.close();
		 reader.close();
		 
		 sobreescribirArchivo("Catalogo.txt","CatalogoNuevo.txt");
		 
		 } catch (IOException e) {
		     e.printStackTrace(System.out);
		 }
		 
		 borrar("CatalogoNuevo.txt");
	}

	//Metodo casero, lee el contenido del archivo CatalogoNuevo y sobreescribe
	//el contenido de Catalogo con el contenido leído.
	private void sobreescribirArchivo(String nombreArchivo, String nombreArchivo2) {
		File archivo = new File(nombreArchivo);
		File archivo2 = new File(nombreArchivo2);
		
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo2));
			PrintWriter salida = new PrintWriter(archivo);
			var lectura=entrada.readLine();
			if (lectura!=null) {
				salida.println(lectura);
			}
			while (lectura!=null) {
				lectura=entrada.readLine();
				if (lectura!=null) {
					salida.println(lectura);
				}
			}
			
			entrada.close();
			salida.close();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	
	private static void imprimir(Collection<Pelicula> coleccion) {
		for(Pelicula elemento: coleccion) {
			System.out.println(elemento.toString());
		}
	}
}
