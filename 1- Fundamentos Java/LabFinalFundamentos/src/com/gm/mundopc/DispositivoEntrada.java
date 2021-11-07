package com.gm.mundopc;

public class DispositivoEntrada {
	private String tipoEntrada;
	private String marca;
	
	//Constructor
	public DispositivoEntrada(String tipoEntrada, String marca) {
		this.tipoEntrada=tipoEntrada;
		this.marca=marca;
	}

	//Getters y Setters
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DispositivoEntrada [tipoEntrada=");
		builder.append(tipoEntrada);
		builder.append(", marca=");
		builder.append(marca);
		builder.append("]");
		return builder.toString();
	}
}
