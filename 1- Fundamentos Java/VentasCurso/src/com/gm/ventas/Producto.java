package com.gm.ventas;

public class Producto{
	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	//Constructores
	private Producto() {
		this.idProducto=++Producto.contadorProductos;
	}
	
	public Producto(String nombre, double precio) {
		this(); //llamada al constructor vacío para que incremente el id
		this.nombre = nombre;
		this.precio = precio;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getIdProducto() {
		return idProducto;
	}

	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Productos [idProducto=");
		builder.append(idProducto);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}
	
}
