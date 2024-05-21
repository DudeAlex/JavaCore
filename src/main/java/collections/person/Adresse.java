package collections.person;

public class Adresse {
    String strasse;
    String hausnummer;
    String postiezahl;
    String ort;

    public Adresse(String strasse, String hausnummer, String postiezahl, String ort){
        if(!Character.isUpperCase(strasse.charAt(0)))
            throw new RuntimeException("Улица должна начинаться с большой буквы");
        if(!Character.isDigit(hausnummer.charAt(0)))
            throw new RuntimeException("Номер дома должен начинаться с цифры");
        if(Character.isUpperCase(ort.charAt(0)))
            throw new RuntimeException("Место должно начинаться с большой буквы");

        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postiezahl = postiezahl;
        this.ort = ort;
    }
}
