package com.gm.mundopc;

public class Monitor {
	private final int idMonitor;
	private String marca;
	private double tama�o;
	private static int contadorMonitores;
	
	//Constructores
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	
	public Monitor(String marca, double tama�o) {
		this();
		this.marca = marca;
		this.tama�o = tama�o;
	}

	//Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
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
		builder.append(", tama�o=");
		builder.append(tama�o);
		builder.append("]");
		return builder.toString();
	}
}
