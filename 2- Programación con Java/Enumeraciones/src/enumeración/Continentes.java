package enumeración;

public enum Continentes {
	//Las enumeraciones pueden tener atributos
	AFRICA(53, "1.2 billones"),
	EUROPA(46),
	ASIA(44),
	AMERICA(34),
	OCEANIA(14);
	
	//Defino los atributos
	private final int paises;
	private String habitantes;
	
	//Constructores
	Continentes(int paises, String habitantes) {
		this.paises=paises;
		this.habitantes=habitantes;
	}
	
	Continentes(int paises) {
		this.paises=paises;
	}
	
	//Como los atributos son privados, estan encapsulados y necesitamos un método para obtenerlos
	public int getPaises() {
		return this.paises;
	}
	
	public String getHabitantes() {
		return this.habitantes;
	}
}
