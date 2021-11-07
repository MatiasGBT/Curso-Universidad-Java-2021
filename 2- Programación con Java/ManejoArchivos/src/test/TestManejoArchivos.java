package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

	public static void main(String[] args) {
		//Primero creamos una variable del tipo manejo archivos.
		var nombreArchivo="prueba.txt";
		crearArchivo(nombreArchivo);
		//Si nos fijamos en los archivos del proyecto, se habra creado el archivo.
		
		//También se le puede pasar una ruta.
		var nombreArchivo2="\\C:\\Users\\BELTARiT\\Desktop\\carpeta\\prueba.txt";
		crearArchivo(nombreArchivo2);
		//Tenemos que asegurarnos de que la carpeta tenga permisos para escribirse.
		//(La carpeta tiene que estar creada).
		
		//Escribimos el archivo.
		escribirArchivo(nombreArchivo, "Hola desde Java");
		//Podemos escribir más información poniendo de nuevo el método, sin embargo, esto
		//sobreescribe la información, por eso tenemos que tener un método que agregue info.
		escribirArchivo(nombreArchivo, "Hola");
		
		//Agregamos una linea de texto al archivo sin sobreescribir
		anexarArchivo(nombreArchivo, "Adios");
		
		//Leemos el archivo
		leerArchivo(nombreArchivo);
		
		//Borrar archivo
		borrarArchivo(nombreArchivo);
		
		/*
		 Primero se crea el archivo, luego se le escribe Hola desde Java, esto se sobreescribe
		 con un Hola y se agrega un Adios, por lo que queda Hola y en el siguiente renglon Adios.
		 Con el metodo leerArchivo se coloca en la consola las lineas que contiene y, finalmente
		 se borra el archivo.
		*/
		
	}

}
