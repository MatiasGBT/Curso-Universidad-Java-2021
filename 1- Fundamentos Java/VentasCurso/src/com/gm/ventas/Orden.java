package com.gm.ventas;

public class Orden {
	private final int idOrden;
	private static int contadorOrden;
	public Producto productos[]=new Producto[10];
	
	//Constructor
	public Orden() {
		this.idOrden=++Orden.contadorOrden;
	}

	//Metodos
	public boolean agregarProducto(Producto producto) {		
		int i=0;
		for (i = 0; i < productos.length && productos[i]!=null; i++) {}
		if (i<productos.length) {
			this.productos[i]=producto;
		}
		return true;
	}
	
	public double calcularTotal() {
		double tot=0;
		for (int i = 0; i < productos.length; i++) {
			if (productos[i]!=null) {
				tot=tot+this.productos[i].getPrecio();
			}
		}
		return tot;
	}
	
	public void mostrarOrden() {
		for (int i = 0; i < productos.length; i++) {
			if (productos[i]!=null) {
				System.out.println("idOrden=" + idOrden + " "
				+ this.productos[i].toString());
			}
		}
		System.out.println("Total=" + calcularTotal());
		System.out.println();
	}
}
