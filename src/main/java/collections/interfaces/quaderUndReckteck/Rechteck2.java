package collections.interfaces.quaderUndReckteck;

public class Rechteck2 {
    double laenge;
    double breite;

    public Rechteck2(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double berechneFlaeche() {
        return laenge * breite;
    }

    public double berechneUmfang() {
        return 2 * laenge + 2 * breite;
    }
}
