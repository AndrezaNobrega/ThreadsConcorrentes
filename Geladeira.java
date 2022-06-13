package geladeiraThreads;

public class Geladeira {
    private int leite;
    private Semaforo cheio;
    private Semaforo vazio;
    private Semaforo mutex;
    public Geladeira (int n) {
        this.cheio = new Semaforo(0);
        this.vazio = new Semaforo(1);
        this.mutex = new Semaforo(n);
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
    public void comprarLeite(String nome) {

        vazio.obter();
        mutex.obter();

        this.leite++;
        System.out.println("Produtor\t" + nome + "\t comprou leite \t" + this.leite);

        mutex.liberar();
        cheio.liberar();
    }
}
