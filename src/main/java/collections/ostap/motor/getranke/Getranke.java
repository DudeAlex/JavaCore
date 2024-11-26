package collections.ostap.motor.getranke;

public abstract class Getranke implements InterfacePfand{

    private String herkunft;
    private String sorte;
    private double alkoholgehalt;
    private int flaschengroesse;

    int pfand;

    public Getranke(String herkunft, String sorte, double alkoholgehalt, int flaschengroesse) {
        this.herkunft = herkunft;
        this.sorte = sorte;
        this.alkoholgehalt = alkoholgehalt;
        this.flaschengroesse = flaschengroesse;
    }

    @Override
    public int flaschenpfand(){
        if(istAlkoholfrei())  return pfand;
        return 0;
    }

    public String getHerkunft() {
        return herkunft;
    }

    public String getSorte() {
        return sorte;
    }

    public double getAlkoholgehalt() {
        return alkoholgehalt;
    }

    public int getFlaschengroesse() {
        return flaschengroesse;
    }

    public boolean istAlkoholfrei() {
        return alkoholgehalt < 0.5;
    }

    @Override
    public String toString() {
        return "Herkunft: " + herkunft +
                "Sorte: " + sorte +
                "Alkoholgehalt: " + alkoholgehalt + "%" +
                "Flaschengröße: " + flaschengroesse + " ml";
    }
}
