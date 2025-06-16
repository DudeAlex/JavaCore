package collections.viertesemester.fahrzeugabstract;

public class FahrzeugAbstractMain {
    public static void main(String[] args) {
        Fahrzeug[] fahrzeuge = {new Auto(), new Fahrrad(), new Auto(), new Fahrrad()};

        for (Fahrzeug f : fahrzeuge) {
            f.beschleunige(10);
            System.out.println(f);
        }
    }



}
