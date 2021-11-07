package domain;

public class Rectangulo extends FiguraGeometrica {

	//Primero implementamos el constructor
	public Rectangulo(String tipoFigura) {
		super(tipoFigura);
	}
	
	//Definir el comportamiento de una clase abstracta es similar a sobreescribir, pero
	//no es lo mismo, ya que no se sobreescribe un comportamiento, sino que se implementa.
	@Override
	public void dibujar() {
		//En java se puede utilizar el this.getClass() para hacer referencia a la clase en
		//la que estamos y con el metodo getSimpleName() obtenemos el nombre de la calse.
		System.out.println("Se imprime un " + this.getClass().getSimpleName());
	}
}
