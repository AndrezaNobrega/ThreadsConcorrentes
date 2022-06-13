package geladeiraThreads;

public class Monitora extends Thread {
    Geladeira geladeira;
    String nome;

    Monitora(String nome, Geladeira geladeira) {
        this.geladeira = geladeira;
        this.nome = nome;
    }

    @Override
    public void run() {
        for(;;) {          // CORRIGIR: deve ser while true
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            geladeira.comprarLeite(this.nome);
        }
    }
}
