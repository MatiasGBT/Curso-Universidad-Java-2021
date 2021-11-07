package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
	private final int idRaton;
	private static int contadorRatones;
	
	//Constructor
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = ++Raton.contadorRatones;
	}

	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raton [idRaton=");
		builder.append(idRaton);
		builder.append(", marca=");
		builder.append(this.getMarca());
		builder.append("]");
		return builder.toString();
	}
}
