package geladeiraThreads;
import java.util.Random;

public class BebeLeite extends Thread{
    Geladeira geladeira;

    BebeLeite(Geladeira geladeira) {
        this.geladeira = geladeira;
    }

    @Override
    public void run() {
        int valor = 0;
        for(;;) {
            valor = this.geladeira.beberLeite("Bebe-leite");	
            try {
                // dorme por tempo aleatório entre 0ms e 1 segundo
                sleep(new Random().nextInt(1000));      
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
