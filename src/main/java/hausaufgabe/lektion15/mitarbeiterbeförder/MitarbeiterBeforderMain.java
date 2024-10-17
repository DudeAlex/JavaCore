package hausaufgabe.lektion15.mitarbeiterbeförder;

public class MitarbeiterBeforderMain {
    public static void main(String[] args) {

        Angestellte angestellte = new Angestellte("Potter", "Harry", 123, 1000.0, "31 July");
        Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Dumbledore", "Albus", 111, 1500.0, "1 July");

        System.out.println("Angestellte Gehalt: " + angestellte.berechneGehalt());
        System.out.println("Abteilungsleiter Gehalt: " + abteilungsleiter.berechneGehalt());

        abteilungsleiter.befordern(angestellte);

        System.out.println("Neue Gehalt von Angestellte: " + angestellte.berechneGehalt());


    }
}
