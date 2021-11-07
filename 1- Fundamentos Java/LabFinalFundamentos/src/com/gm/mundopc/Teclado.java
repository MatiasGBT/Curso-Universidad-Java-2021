package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
	private final int idTeclado;
	private static int contadorTeclados;
	
	//Constructor
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++Teclado.contadorTeclados;
	}

	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado [idTeclado=");
		builder.append(idTeclado);
		builder.append(", marca=");
		builder.append(this.getMarca());
		builder.append("]");
		return builder.toString();
	}
}
