package hausaufgabe.lektion14.person;

public class Person {
    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, Adresse adresse) {
        if (!Character.isUpperCase(vorname.charAt(0)))
            throw new RuntimeException("Vorname muss mit Großbuchstabe starten");

        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }
}
