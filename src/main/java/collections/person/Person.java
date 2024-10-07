package collections.person;

public class Person {
    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, Adresse adresse) {
        if (!Character.isUpperCase(vorname.charAt(0)))
            throw new RuntimeException("Name muss mit Großbuchstabe starten");

        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }
}
