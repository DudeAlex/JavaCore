package collections.viertesemester.aufgabefahrzeuge;

import java.util.ArrayList;
import java.util.List;

public abstract class Fahrzeug {
    protected List<Fahrt> fahrten = new ArrayList<>();

    public abstract double rechneFahrt(Fahrt fahrt);

    public abstract String schreibeFahrt();

    public void fuegeFahrtHinzu(Fahrt fahrt) {
        fahrten.add(fahrt);
    }

    public List<Fahrt> getFahrten() {
        return fahrten;
    }


}
