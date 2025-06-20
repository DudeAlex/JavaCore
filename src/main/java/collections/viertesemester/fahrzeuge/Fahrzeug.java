package collections.viertesemester.fahrzeuge;

import java.util.ArrayList;
import java.util.List;

public abstract class Fahrzeug {

    List<Fahrt> fahrtList = new ArrayList<>();

    public abstract double berechnen(Fahrt fahrt);

    public abstract void hinzufugen(Fahrt fahrt);

}
