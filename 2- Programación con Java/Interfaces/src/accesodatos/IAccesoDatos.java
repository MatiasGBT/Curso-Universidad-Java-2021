package accesodatos;

//Para marcar que es una interface, se le suele poner I adelante.
public interface IAccesoDatos {
	int MAX_REGISTROS=10;
	
	//Cualquier metodo que agreguemos sera public y abstract
	public abstract void insertar();
	//el public abstract se agrega en automatico aunque no lo pongamos, por lo que puede ser
	//solo void nombreMetodo();
	
	void listar();
	
	void actualizar();
	
	void eliminar();
}
