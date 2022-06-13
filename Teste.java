package geladeiraThreads;

public class Teste {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira();
        BebeLeite beber = new BebeLeite(geladeira);
        ThreadMonitora pai = new ThreadMonitora("Pai", geladeira);
        ThreadMonitora mae = new ThreadMonitora("Mãe", geladeira);
        ThreadMonitora tio = new ThreadMonitora("Tio", geladeira);
    }
}
