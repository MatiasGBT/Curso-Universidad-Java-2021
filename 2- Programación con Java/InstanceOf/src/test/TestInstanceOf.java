package test;

import domain.*;

public class TestInstanceOf {

	public static void main(String[] args) {
		/*
		 InstanceOF nos permite definir el tipo en tiempos de ejecucion. 
		*/
		
		Empleado empleado=new Empleado("Juan", 5000);
		determinarTipo(empleado);
		System.out.println();
		empleado=new Gerente("Carla", 10000, "Contabilidad");
		determinarTipo(empleado);
	}

	//instanceOf usualmente se usa para preguntar
	public static void determinarTipo(Empleado empleado) { 
		//Preguntamos si la variable empleado esta apuntando a un objeto en la memoria del tipo Gerente
		//Se pregunta desde las clases menos genericas hacia las más genericas.
		if (empleado instanceof Gerente) {
			System.out.println("Es de tipo Gerente");
			//Si queremos utilizar métodos, primero hay que convertir la variable de empleado
			//a una de Gerente.
			System.out.println(((Gerente)empleado).getDepartamento());
			//((Gerente)empleado).getDepartamento();
			
		} else if (empleado instanceof Empleado) {
			System.out.println("Es de tipo Empleado");
			System.out.println(empleado.getNombre());
			
		} else if (empleado instanceof Object) {
			System.out.println("Es de tipo Object");
		}
	}
}
