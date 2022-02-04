package beans;

import javax.ejb.Remote;

@Remote //Para que el cliente la pueda llamar de manera remota.
public interface HMEjbRemote {
    public int sumar(int a, int b);
}
