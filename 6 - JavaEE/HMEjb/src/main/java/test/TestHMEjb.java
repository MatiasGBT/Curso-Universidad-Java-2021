package test;

import beans.HMEjbRemote;
import javax.naming.*;

public class TestHMEjb {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            HMEjbRemote holaMundoEjb = (HMEjbRemote) jndi.lookup("java:global/HMEjb/HMEjbImpl!beans.HMEjbRemote");
            int resultado = holaMundoEjb.sumar(5, 3);
            System.out.println("Resultado de la suma: " + resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
