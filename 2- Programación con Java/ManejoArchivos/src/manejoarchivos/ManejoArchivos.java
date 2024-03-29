package manejoarchivos;

import java.io.*;

public class ManejoArchivos {
	//En esta clase se manejan varios m�todos tales como: crear el archivo, guardar informaci�n en
	//el archivo, eliminar informaci�n y eliminar por completo el archivo, entre otras.
	
	public static void crearArchivo(String nombreArchivo) {
		//Vamos a crear un archivo en el disco duro con el nombre que utilicemos.
		
		//Primero, creamos un objeto del tipo File en memoria.
		File archivo = new File(nombreArchivo);
		
		//Para que se guarde en el disco duro tenemos que, primero, crear un objeto de tipo
		//PrintWriter
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close(); //Cuando llamamos a este m�todo es cuando finalmente se crea el archivo en el disco
			System.out.println("Se a creado el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
		//Cuando creamos un objeto de esta clase, el constructor puede tirar una excepci�n,
		//por ende, podemos hacer dos cosas; agregar un bloque try y catch, o reportar
		//esta excepcion en la firma del metodo. En este caso lo hago con try/catch.
	}
	
	//Como escribir informaci�n
	//Es similar al metodo crear, sin embargo antes de cerrar la salida hay que escribir la info.
	public static void escribirArchivo(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(contenido); //escribimos la info.
			salida.close();
			System.out.println("Se a escrito al archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		}
	}
	
	//Metodo para agregar info
	public static void anexarArchivo(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);
		//Ya no mandaremos la informaci�n directamente al PrintWriter, sino que utilizaremos
		//una clase intermedia para indicar que queremos indexar info al archivo.
		try {
			//La creaci�n de este objeto puede generar una nueva excepcion que hay que controlar.
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			//El valor booleano indica si se utiliza el m�todo append o no
			//(si se indexa informacion o no).
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha anexado informaci�n al archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) { //Control de la nueva excepcion.
			e.printStackTrace(System.out);
		}
	}
	
	//Metodo para leer archivo
	public static void leerArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		//Creamos una variable del tipo BufferedReader para leer informaci�n de un archivo.
		//Utilizar Buffered permite leer lineas completas del archivo.
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			//Ahora tenemos que leer lineas completas de nuestro archivo.
			var lectura=entrada.readLine();
			//El metodo readLine tambi�n puede generar una excepcion, por lo que tenemos
			//que crear un nuevo catch.
			
			//Utilizano un ciclo while para leer todas las lineas y no solo la primera:
			while (lectura!=null) {
				System.out.println("Lectura: " + lectura); //Imprimimos lo que ya se leyo.
				lectura=entrada.readLine(); //Repetimos el ciclo
			}
			entrada.close(); //Cerramos el flujo.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.out);
		} catch (IOException e) { //Catch generado por readLine()
			e.printStackTrace();
		}
	}
	
	//Metodo para borrar archivo (proveniente de StackOverflow)
	public static void borrarArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);

        try{
            boolean estado = archivo.delete();
            
            if (!estado) {
                System.out.println("Error no se ha podido eliminar el  archivo");

           }else{
                System.out.println("Se ha eliminado el archivo exitosamente");
           }
        }catch(Exception e){
        	e.printStackTrace(System.out);
        }
	}
}
