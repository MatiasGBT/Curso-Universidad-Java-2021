package peliculas.datos;

import java.io.*;
import java.util.*;

import peliculas.domain.Pelicula;
import peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos{

	@Override
	public boolean existe(String nombreArchivo) {
		File archivo=new File(nombreArchivo);
		return archivo.exists(); //Esto pregunta si existe el resurso en nuestro disco duro.
	}

	@Override
	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
		File archivo=new File(nombreArchivo);
		List<Pelicula> peliculas=new ArrayList<>();
		try {
			BufferedReader entrada=new BufferedReader(new FileReader(nombreArchivo));
			String linea; //definimos una variable para leer cada una de las líneas.
			linea=entrada.readLine();
			while (linea!=null) {
				Pelicula pelicula=new Pelicula(linea);
				peliculas.add(pelicula);
				linea=entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//Propagamos la excepción:
			throw new LecturaDatosEx("Excepcion al listar películas: " + e.getMessage());
		} catch (IOException e) { //Catch de readLine()
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion al listar películas: " + e.getMessage());
		}
		return peliculas;
	}

	@Override
	public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
		File archivo=new File(nombreArchivo);
		try {
			PrintWriter salida=new PrintWriter(new FileWriter(archivo, anexar));
			salida.println(pelicula.toString());
			salida.close();
			System.out.println("Se ha escrito información al archivo: " + pelicula);
		} catch (IOException e) {
			e.printStackTrace();
			throw new EscrituraDatosEx("Excepcion al escribir películas: " + e.getMessage());
		}
	}

	@Override
	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
		File archivo=new File(nombreArchivo);
		String resultado=null;
		try {
			BufferedReader entrada=new BufferedReader(new FileReader(archivo));
			String linea=null;
			linea=entrada.readLine();
			int indice=1;
			while (linea!=null) {
				if (buscar!=null && buscar.equalsIgnoreCase(linea)) {
					resultado="Pelicula " + linea + " encontrada en el índice " + indice;
					break; //Rompe el ciclo
				}
				linea=entrada.readLine();
				indice++;
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion buscar película: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			throw new LecturaDatosEx("Excepcion buscar película: " + e.getMessage());
		}
		
		return resultado;
	}

	@Override
	public void crear(String nombreArchivo) throws AccesoDatosEx {
		File archivo=new File(nombreArchivo);
		try {
			PrintWriter salida=new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("Se ha creado el archivo.");
		} catch (IOException e) {
			e.printStackTrace();
			throw new AccesoDatosEx("Excepcion al crear archivo: " + e.getMessage());
		}
	}

	//Como este método no regresa una excepcion borramos el throw, aunque lo tenga la interface
	@Override
	public void borrar(String nombreArchivo) {
		File archivo=new File(nombreArchivo);
		if (archivo.exists()) {
			archivo.delete();
			System.out.println("Se ha borrado el archivo.");
		}
		
	}

}
