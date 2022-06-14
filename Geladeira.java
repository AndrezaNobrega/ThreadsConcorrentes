package geladeiraThreads;

public class Geladeira {
    private int leite;
    private Semaforo cheio;
    private Semaforo vazio;
    private Semaforo mutex;
    public Geladeira () {
        this.cheio = new Semaforo(0);       // nº de espaços cheios (inicia vazio)
        this.vazio = new Semaforo(10);      // nº de espaços no buffer
        this.mutex = new Semaforo(1);       // nº de acessos permitidos por vez
    }
    
    public int beberLeite (String nome) {
        // suspende produtor
        cheio.obter();
        mutex.obter();
        
        // consome
        this.leite--;
        System.out.println(nome + "\t bebeu leite. \t" + this.leite);
        
        // acorda produtor
        mutex.liberar();
        vazio.liberar();
        return this.leite;
    }
    public synchronized void comprarLeite(String nome) {
        while (this.leite >= 10) {      // se o buffer está cheio
            // suspende produtor
            cheio.obter();
            mutex.obter();
        }
        // suspende consumidor
        vazio.obter();
        mutex.obter();

        // produz
        this.leite++;
        System.out.println("Produtor\t" + nome + "\t comprou leite \t" + this.leite);

        // acorda consumidor
        mutex.liberar();
        cheio.liberar();
    }
}
