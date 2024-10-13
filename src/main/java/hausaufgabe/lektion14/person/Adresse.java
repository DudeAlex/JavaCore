package hausaufgabe.lektion14.person;

public class Adresse {
    String strasse;
    String hausnummer;
    int postleitzahl;
    String ort;

    public Adresse(String strasse, String hausnummer, int postleitzahl, String ort){
        if(!Character.isUpperCase(strasse.charAt(0)))
            throw new RuntimeException("Strasse muss mit Großbuchstabe starten");
        if(!Character.isDigit(hausnummer.charAt(0)))
            throw new RuntimeException("Hausnummer muss mit Ziffer starten");
        if(!Character.isUpperCase(ort.charAt(0)))
            throw new RuntimeException("Ort muss mit Großbuchstabe starten");

        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
    }
}
