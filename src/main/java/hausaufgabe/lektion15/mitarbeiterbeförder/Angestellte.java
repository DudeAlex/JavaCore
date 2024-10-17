/*
Schreiben Sie ein Programm, das die Struktur eines Unternehmens abbildet. In dem Unternehmen
gibt es mehrere Abteilungen. In jeder Abteilung arbeiten mehrere Angestellte und ein
Abteilungsleiter.
Ein Angestellter soll einen Nachnamen, Vornamen, einen Identifikator, ein Grundgehalt, einen
Gehaltsfaktor sowie ein Geburtsdatum haben. Der Gehaltsfaktor für einen Angestellten ist 1. Das
Gehalt errechnet sich aus dem Gehaltsfaktor multipliziert mit dem Grundgehalt.
Ein Abteilungsleiter soll ein Angestellter sein und ebenfalls einen Nachnamen, Vornamen, einen
Identifikator, ein Grundgehalt, einen Gehaltsfaktor sowie ein Geburtsdatum haben. Der
Gehaltsfaktor beträgt bei einem Abteilungsleiter 2. Ferner soll ein Abteilungsleiter eine Methode
befördern haben, in der ein Angestellter befördert werden kann. Dieser Angestellte soll dann
seinen Gehaltsfaktor um 10% erhöht bekommen.
Schreiben Sie einen geeigneten JUnit-Test, um ihr Programm zu testen.
 */

package hausaufgabe.lektion15.mitarbeiterbeförder;


public class Angestellte {

    String nachname;
    String vorname;
    int id;
    double grundgehalt;
    double gehaltsfaktor = 1.0;
    String geburtsdatum;


    public Angestellte (String nachname, String vorname, int id, double grundgehalt, String geburtsdatum){
        this.nachname = nachname;
        this.vorname = vorname;
        this.id = id;
        this.grundgehalt = grundgehalt;
        this.geburtsdatum = geburtsdatum;
    }

    public double berechneGehalt() {
        return grundgehalt * gehaltsfaktor;
    }


}
