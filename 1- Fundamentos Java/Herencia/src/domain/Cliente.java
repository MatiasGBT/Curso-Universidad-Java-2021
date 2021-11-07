package domain;

import java.util.Date;

public class Cliente extends Persona {
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;
	
	public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
		super(nombre, genero, edad, direccion);
		this.idCliente=++Cliente.contadorCliente;
		this.fechaRegistro=fechaRegistro;
		this.vip=vip;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append(", vip=");
		builder.append(vip);
		builder.append("]");
		builder.append(" ");
		builder.append(super.toString());
		return builder.toString();
	}
	
}
