package paquete1;

//No se permite una clase privada, por lo que la dejare default.
class Clase4 {
	//El modificador de acceso private NO afecta a clases,
	//pero si a variables, métodos y constructores.
	
	//No se podrá modificar este atributo desde otra clase, independientemente si es hija o no.
	//Para ello se usa el encapsulamiento (get y set).
	private String atributoPrivado="Valor atributo privado";
	
	//No se podra crear objetos de este tipo utilizando el constructor vacío.
	//Este constructor solo se podra usar en esta misma clase.
	private Clase4() {
		System.out.println("Constructor privado (se usa por el this)");
	}
	
	public Clase4(String arg) {
		this();
		System.out.println("Constructor publico");
	}
	
	//Se puede utilizar desde cualquier clase.
	private void metodoPrivado() {
		System.out.println("Metodo privado");
	}

	//Genero los get y set del atributo
	public String getAtributoPrivado() {
		return atributoPrivado;
	}

	public void setAtributoPrivado(String atributoPrivado) {
		this.atributoPrivado = atributoPrivado;
	}
	
	
}
