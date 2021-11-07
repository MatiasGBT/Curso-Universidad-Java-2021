
public class Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			if (i%2!=0) {
				continue; //Continue hace que se vaya a la siguiente iteración del bloque de repeticion.
				//En este caso, si un número es impar, el for sigue y no lo imprime.
			}
			System.out.println(i);
		}

	}

}
