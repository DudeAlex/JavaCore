package collections.interfaces.rechteck;

public class Quader {
    double tiefe;
    Rechteck rechteck;
    public Quader(Rechteck rechteck, double tiefe) {
        this.tiefe = tiefe;
        this.rechteck = rechteck;
    }

    public Quader(double laenge, double breite, double tiefe){
        rechteck = new Rechteck(laenge, breite);
        this.tiefe = tiefe;

    }
    public double berechneVolumen() {
        return rechteck.berechneFlaeche() * tiefe;
    }
}
