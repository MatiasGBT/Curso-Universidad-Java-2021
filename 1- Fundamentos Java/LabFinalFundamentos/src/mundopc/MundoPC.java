package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
	public static void main(String[] args) {
		//Creo monitores, ratones y teclados
		Monitor monitorSamsung=new Monitor("Samsung", 19.5);
		Monitor monitorAOC=new Monitor("AOC", 24);
		Monitor monitorROG=new Monitor("ROG", 27);
		
		Teclado tecladoGenius=new Teclado("USB", "Genius");
		Teclado tecladoMSI=new Teclado("USB", "MSI");
		Teclado tecladoRedragon=new Teclado("Bluetooth", "Redragon");
		Teclado tecladoROG=new Teclado("Bluetooth", "ROG");
		
		Raton ratonGenius=new Raton("Bluetooth", "Genius");
		Raton ratonMSI=new Raton("USB", "MSI");
		Raton ratonLogitech=new Raton("Bluetooth", "Logitech");
		Raton ratonROG=new Raton("USB", "ROG");
		
		//Creo computadoras
		Computadora c1=new Computadora("HP Pavilon", monitorSamsung, 
				tecladoGenius, ratonGenius);
		Computadora c2=new Computadora("MSI GT Titan series", monitorAOC, 
				tecladoMSI, ratonMSI);
		
		Computadora c3=new Computadora("Asus TUF", monitorROG, 
				tecladoRedragon, ratonLogitech);
		Computadora c4=new Computadora("Asus Premium", monitorROG, 
				tecladoROG, ratonROG);
		
		//También se pueden crear nuevos objetos directamente en el objeto Computadora:
		Computadora c5=new Computadora("Asus TUF", new Monitor("ROG", 27), 
				new Teclado("Bluetooth", "Redragon"), new Raton("Bluetooth", "Logitech"));
		Computadora c6=new Computadora("Asus Premium", new Monitor("ROG", 27.5), 
				new Teclado("Bluetooth", "ROG"), new Raton("USB", "ROG"));
		
		//Creo ordenes
		Orden o1=new Orden();
		Orden o2=new Orden();
		
		o1.agregarComputadora(c1);
		o1.agregarComputadora(c2);
		o2.agregarComputadora(c3);
		o2.agregarComputadora(c4);
		
		o1.agregarComputadora(c5);
		o2.agregarComputadora(c6);
		
		o1.mostrarOrden();
		o2.mostrarOrden();
		
	}
}
