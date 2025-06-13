package collections.viertesemester.buchverwaltung;

public abstract class Buch {
    String titel;
    String author;

    public Buch(String titel, String author){
        this.titel = titel;
        this.author = author;
    }

    public void zeigeInfo(){}
}
