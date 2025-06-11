package collections.viertesemester.aufgabefahrzeuge;

import java.util.List;

public class Umsatzberechner {


    public double berechneGesamtumsatz(List<Fahrzeug> fahrzeuge) {
        double gesamt = 0;

        for (Fahrzeug f : fahrzeuge) {
            for (Fahrt fahrt : f.getFahrten()) {
                gesamt += f.rechneFahrt(fahrt);
            }
        }

        return gesamt;
    }

    public double berechneElektroumsatz(List<Fahrzeug> fahrzeuge, List<Fahrt> fahrten) {
        return berechneUmsatzNachTyp(fahrzeuge, fahrten, true);
    }
    private double berechneUmsatzNachTyp(List<Fahrzeug> fahrzeuge, List<Fahrt> fahrten, boolean nurElektro) {
        double summe = 0.0;
        for (int i = 0; i < fahrzeuge.size(); i++) {
            Fahrzeug fzg = fahrzeuge.get(i);
            if (nurElektro && !(fzg instanceof Elektrisch)) {
                continue;
            }
            summe += fzg.rechneFahrt(fahrten.get(i));
        }
        return summe;
    }
}
