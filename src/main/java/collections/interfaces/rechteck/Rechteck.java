package collections.interfaces.rechteck;

public class Rechteck {
    double laenge;
    double breite;
    public Rechteck(double laenge, double breite)
    { this.laenge = laenge;
        this.breite = breite;
    }
    public double berechneFlaeche() {
        return laenge*breite;
    }
    public double berechneUmfang() {
        return 2*laenge + 2*breite;
    }
}
