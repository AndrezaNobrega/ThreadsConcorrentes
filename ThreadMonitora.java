package geladeiraThreads;

public class ThreadMonitora extends Thread {

    private String nome;
    private Geladeira geladeira;

    public ThreadMonitora(String nome, Geladeira g) {
        this.nome = nome;
        this.geladeira = g;
        this.start();
    }
    
    public void compraLeite(int quantidade){
        this.geladeira.leite += quantidade;
        System.out.println(this.nome + " comprou " + quantidade + " de leite.");
    }

    @Override
    public void run() {
        while (true) {          
            if (this.geladeira.leite < 10) {
                compraLeite(10-this.geladeira.leite);
            }
        }
    }
}
