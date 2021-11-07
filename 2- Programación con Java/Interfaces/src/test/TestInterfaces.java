package test;

import accesodatos.*;

public class TestInterfaces {

	public static void main(String[] args) {
		//Tenemos que definir una variable de la clase Interface.
		//No se pueden crear objetos de tipo interfaces, tiene que ser de sus implementaciones.
		
		IAccesoDatos datos=new ImplementacionMySql();
		datos.listar();
		
		datos=new ImplementacionOracle();
		datos.listar();
	}

}
