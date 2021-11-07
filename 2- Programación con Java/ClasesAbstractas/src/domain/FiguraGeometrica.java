package domain;

/*
 Una clase abstracta se usa para definir métodos que no tienen ninguna implementación.
 Se usa un método abstracto en dibujar debido a que la clase FiguraGeometrica es muy
 generica como para saber que clase de figura geometrica va a dibujar.
 Las clases hijas estan obligadas a definir el comportamiento de un método de la clase
 padre si es abstracto.
*/

//Si hay al menos un metodo abstracto en la clase, esta también tiene que serlo.
public abstract class FiguraGeometrica {
	protected String tipoFigura;
	
	protected FiguraGeometrica(String tipoFigura) {
		this.tipoFigura=tipoFigura;
	}
	
	//En los metodos abstractos no se ponen los corchetes, sino ;
	public abstract void dibujar();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
	}
}
