package geladeiraThreads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Semaforo {
    private int contador = 0;
    public Semaforo (int n) {
        contador = n;
    }
    /**
     * Método obter para aguardar até que possa consumir
     */
    public synchronized void obter(){
        if (contador <= 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
            contador--;
        }
    }
    /**
     * Método liberar para que possa produzir
     */
    public synchronized void liberar(){
        contador++;
        notifyAll();       // acorda as threads em espera
    }
}
