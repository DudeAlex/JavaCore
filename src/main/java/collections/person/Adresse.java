package collections.person;

public class Adresse {
    String strasse;
    String hausnummer;
    String postiezahl;
    String ort;

    public Adresse(String strasse, String hausnummer, String postiezahl, String ort){
        if(!Character.isUpperCase(strasse.charAt(0)))
            throw new RuntimeException("Strasse muss mit Großbuchstabe starten");
        if(!Character.isDigit(hausnummer.charAt(0)))
            throw new RuntimeException("Hausnummer muss mit Ziffer anfangen");
        if(!Character.isUpperCase(ort.charAt(0)))
            throw new RuntimeException("Ort muss mit Großbuchstabe starten");

        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postiezahl = postiezahl;
        this.ort = ort;
    }
}
