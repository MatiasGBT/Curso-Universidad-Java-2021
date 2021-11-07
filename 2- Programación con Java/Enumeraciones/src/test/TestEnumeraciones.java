package test;

import enumeraci�n.*;

public class TestEnumeraciones {
	public static void main(String[] args) {
		System.out.println(Dias.LUNES);
		indicarDiaSemana(Dias.LUNES);
		
		System.out.println("Continente no. 4: " + Continentes.AMERICA);
		System.out.println("N�mero de pa�ses del 4to continente: " + Continentes.AMERICA.getPaises());
	}
	
	//Si el m�todo no se define static salta error al usar enumeraciones
	private static void indicarDiaSemana(Dias dias) {
		switch (dias) {
		case LUNES:
			System.out.println("Primer d�a de la semana");
			break;
		case MARTES:
			System.out.println("Segundo d�a de la semana");
			break;
		case MIERCOLES:
			System.out.println("Tercer d�a de la semana");
			break;
		case JUEVES:
			System.out.println("Cuarto d�a de la semana");
			break;
		case VIERNES:
			System.out.println("Quinto d�a de la semana");
			break;
		case SABADO:
			System.out.println("Sexto d�a de la semana");
			break;
		case DOMINGO:
			System.out.println("Septimo d�a de la semana");
			break;
		default:
			break;
		}
	}
}
