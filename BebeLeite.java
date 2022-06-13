package geladeiraThreads;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BebeLeite extends Thread {
    private Geladeira geladeira;
    public BebeLeite (Geladeira g) {
        this.geladeira = g;
        this.start();
    }
    
    public void beberLeite(){
        this.geladeira.leite--;
        System.out.println("Bebeu leite.");
    }
    
    @Override
    public void run () {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(1000));
                beberLeite();
            } catch (InterruptedException ex) {
                Logger.getLogger(BebeLeite.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
}
