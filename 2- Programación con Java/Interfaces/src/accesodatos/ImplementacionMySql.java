package accesodatos;

//Se usa la palabra reservada implements, obligamos a las clases que quieran implementar la interface
//a agregar el comportamiento definido en sus metodos.
public class ImplementacionMySql implements IAccesoDatos{
	//Si no implementamos los metodos marca error, si le damos al error podemos implementar
	//todos los metodos automaticamente.
	
	@Override
	public void insertar() {
		System.out.println("Insertar desde MySql");
	}

	@Override
	public void listar() {
		System.out.println("Listar desde MySql");
	}

	@Override
	public void actualizar() {
		System.out.println("Actualizar desde MySql");
	}

	@Override
	public void eliminar() {
		System.out.println("Eliminar desde MySql");
	}

}
