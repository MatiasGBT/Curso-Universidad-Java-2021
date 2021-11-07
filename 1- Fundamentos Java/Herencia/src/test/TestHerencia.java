package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {

	public static void main(String[] args) {
		Empleado e1=new Empleado("Juan",5000.0);
		System.out.println("Empleado 1: " + e1);
		
		//Date d1=new Date();
		Cliente c1=new Cliente(new Date(), true, "José", 'M', 28, "Saturno 15"); //En vez de new Date() se puede poner d1
		System.out.println("Cliente 1: " + c1);
	}

}
