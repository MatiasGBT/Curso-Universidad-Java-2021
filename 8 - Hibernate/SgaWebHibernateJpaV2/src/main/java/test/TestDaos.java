package test;

import dao.*;
import java.util.List;

public class TestDaos {
    public static void main(String[] args) {
        AlumnoDao alumnoDao = new AlumnoDao();
        System.out.println("Alumnos:");
        imprimir(alumnoDao.listar());
        
        DomicilioDao domicilioDao = new DomicilioDao();
        System.out.println("Domicilios:");
        imprimir(domicilioDao.listar());
                
        ContactoDao contactoDao = new ContactoDao();
        System.out.println("Contactos:");
        imprimir(contactoDao.listar());
        
        CursoDao cursosDao = new CursoDao();
        System.out.println("Cursos:");
        imprimir(cursosDao.listar());
        
        AsignacionDao asignacionDao = new AsignacionDao();
        System.out.println("Asignaciones:");
        imprimir(asignacionDao.listar());
    }
    
    private static void imprimir(List coleccion) {
        for (Object o : coleccion) {
            System.out.println(o);
        }
    }
}
