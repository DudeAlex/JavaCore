package collections.ostap.motor.getranke;

public class Bier extends Getranke implements InterfacePfand{

    public Bier(String herkunft, String sorte, double alkoholgehalt, int flaschengroesse) {
        super(herkunft, sorte, alkoholgehalt, flaschengroesse);
    }

    @Override
    public int flaschenpfand() {
        return 0;
    }
}
