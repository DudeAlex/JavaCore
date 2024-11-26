package collections.ostap.motor.getranke;

public class Rotwein extends Getranke implements InterfacePfand{

    private int jahrgang;

    public Rotwein(String herkunft, String sorte, double alkoholgehalt, int flaschengroesse, int jahrgang) {
        super(herkunft, sorte, alkoholgehalt, flaschengroesse);
        this.jahrgang = jahrgang;
    }

    @Override
    public int flaschenpfand(){
        return 0;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJahrgang: " + jahrgang;
    }
}
