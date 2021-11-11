package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        imprimir(personaDao);

        //Creamos un nuevo objeto Persona para insertarla en la base de datos.
        //Conviene usar el constructor que inicializamos todo menos el id.
//        Persona personaNueva=new Persona("Carlos", "Esparza", "cesparza@mail.com", "234234234");
//        personaDao.insertar(personaNueva);

        //Modificar un objeto de persona existente.
//        Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "234234234");
//        personaDao.actualizar(personaModificar);

        //Eliminar un registro.
        Persona personaEliminar=new Persona(4);
        personaDao.eliminar(personaEliminar);

        System.out.println("");

        imprimir(personaDao);
    }

    private static void imprimir(PersonaDAO personaDao) {
        //Mostramos los objetos de la base de datos con el método seleccionar.
        List<Persona> personas = personaDao.seleccionar();
        //Función lambda. También se puede usar un forEach normal pero el IDE aconseja esto.
        personas.forEach(persona -> {
            System.out.println("Persona: " + persona);
        });
    }
}
