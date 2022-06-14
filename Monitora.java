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
        for(;;) {
            geladeira.comprarLeite(this.nome);
        }
    }
}
