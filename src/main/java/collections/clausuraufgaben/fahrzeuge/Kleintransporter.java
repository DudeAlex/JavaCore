package collections.clausuraufgaben.fahrzeuge;

public class Kleintransporter extends Fahrzeug {

    @Override
    public double berechnen(Fahrt fahrt) {
        if (fahrt.min < 59) return fahrt.km * 30;
        else return 25 * (fahrt.min - 60) + 30 * fahrt.km;
    }
}
