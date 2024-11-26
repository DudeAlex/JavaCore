package collections.ostap.motor.getranke;

public class Weisswein extends Getranke implements InterfacePfand {

    private int jahrgang;

    public Weisswein(String herkunft, String sorte, double alkoholgehalt, int flaschengroesse, int jahrgang) {
            super(herkunft, sorte, alkoholgehalt, flaschengroesse);
            this.jahrgang = jahrgang;
    }

    public int getJahrgang() {
        return jahrgang;
    }

    @Override
    public int flaschenpfand(){
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJahrgang: " + jahrgang;
    }
}
