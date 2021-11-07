package ventas;

import com.gm.ventas.*;

public class Ventas {

	public static void main(String[] args) {
		Producto p1=new Producto("Leche", 5.5);
		Producto p2=new Producto("Pan", 15.5);
		Producto p3=new Producto("Carne",300.0);
		Producto p4=new Producto("Lechuga",30.4);
		Producto p5=new Producto("Jamon", 66.7);
		
		Producto p6=new Producto("Tomate", 45.6);
		Producto p7=new Producto("Queso", 500.15);
		Producto p8=new Producto("Jamon", 66.7);
		Producto p9=new Producto("Pizza", 799.9);
		Producto p10=new Producto("Sandía", 37.8);

		Orden o1=new Orden();
		Orden o2=new Orden();
		
		o1.agregarProducto(p1);
		o1.agregarProducto(p2);
		o1.agregarProducto(p3);
		o1.agregarProducto(p4);
		o1.agregarProducto(p5);
		
		o2.agregarProducto(p6);
		o2.agregarProducto(p7);
		o2.agregarProducto(p8);
		o2.agregarProducto(p9);
		o2.agregarProducto(p10);
		
		o1.mostrarOrden();
		o2.mostrarOrden();
	}

}
