package geladeiraThreads;

public class Main {
    public static void main(String[] args) {
        Geladeira g = new Geladeira();
        BebeLeite b = new BebeLeite(g);
        Monitora pai = new Monitora("Pai", g);
        Monitora mae = new Monitora("Mãe", g);
        Monitora tio = new Monitora("Tio", g);
        
        b.start();
        pai.start();
        mae.start();
        tio.start();
    }
}
