package geladeiraThreads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Geladeira {
    private int leite;
    private Semaforo cheio;
    private Semaforo vazio;
    private Semaforo mutex;
    public Geladeira () {
        this.cheio = new Semaforo(0);
        this.vazio = new Semaforo(10);
        this.mutex = new Semaforo(1);
    }
    
    public int beberLeite (String nome) {
        
        cheio.obter();
        mutex.obter();
        
        this.leite--;
        System.out.println(nome + "\t bebeu leite. \t" + this.leite);
        
        mutex.liberar();
        vazio.liberar();
        return this.leite;
    }
    public synchronized void comprarLeite(String nome) {
        while (this.leite >= 10) {
            cheio.obter();
            mutex.obter();
        }
        vazio.obter();
        mutex.obter();

        this.leite++;
        System.out.println("Produtor\t" + nome + "\t comprou leite \t" + this.leite);

        mutex.liberar();
        cheio.liberar();
    }
}
