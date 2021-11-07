package com.gm.mundopc;

public class Monitor {
	private final int idMonitor;
	private String marca;
	private double tamaño;
	private static int contadorMonitores;
	
	//Constructores
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	
	public Monitor(String marca, double tamaño) {
		this();
		this.marca = marca;
		this.tamaño = tamaño;
	}

	//Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public int getIdMonitor() {
		return idMonitor;
	}

	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Monitor [idMonitor=");
		builder.append(idMonitor);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", tamaño=");
		builder.append(tamaño);
		builder.append("]");
		return builder.toString();
	}
}
