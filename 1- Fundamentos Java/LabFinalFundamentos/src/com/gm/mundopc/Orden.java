package com.gm.mundopc;

public class Orden {
	private final int idOrden;
	private Computadora computadoras[]=new Computadora[10];
	private static int contadorComputadoras;
	
	//Constructor
	public Orden() {
		this.idOrden=++Orden.contadorComputadoras;
	}
	
	//Metodos
	public void agregarComputadora(Computadora computadora) {
		int i=0;
		for (i = 0; i < computadoras.length && computadoras[i]!=null; i++) {}
		if (i<computadoras.length) {
			this.computadoras[i]=computadora;
		}
	}
	
	public void mostrarOrden() {
		for (int i = 0; i < computadoras.length; i++) {
			if (computadoras[i]!=null) {
				System.out.println("idOrden=" + idOrden + " " +
				this.computadoras[i].toString());
			}
		}
		System.out.println();
	}
}
