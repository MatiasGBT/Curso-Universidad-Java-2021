package test;

import domain.PersonaBean;

public class TestJavaBean {

	public static void main(String[] args) {
		//Lo comun en JavaBeans es que el objeto se cree con el constructor vacío
		PersonaBean persona=new PersonaBean();
		persona.setNombre("Juan");
		persona.setApellido("Perez");
		
		System.out.println(persona);
	}

}
