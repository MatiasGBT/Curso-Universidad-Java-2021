package beans;

import javax.ejb.Stateless;

@Stateless //Para convertirla en un EJB
public class HMEjbImpl implements HMEjbRemote {

    @Override
    public int sumar(int a, int b) {
        System.out.println("Ejecutando método suma en el servidor.");
        return a + b;
    }
    
}
