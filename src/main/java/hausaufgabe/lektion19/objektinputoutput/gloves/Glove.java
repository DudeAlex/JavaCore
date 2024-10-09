package hausaufgabe.lektion19.objektinputoutput.gloves;

public class Glove {
    boolean fingerless;
    public Glove(boolean fingerless)
    {
        this.fingerless = fingerless;
    }
    public String toString() {
        if (fingerless)
            return "fingerloser Handschuh";
        else return "Handschuh";
    }
}
