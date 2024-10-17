package hausaufgabe.lektion15.mitarbeiterbeförder;

public class Abteilungsleiter extends Angestellte{
    public Abteilungsleiter(String nachname, String vorname, int id, double grundgehalt, String geburtsdatum){
        super(nachname, vorname, id, grundgehalt, geburtsdatum);
        this.gehaltsfaktor = 2.0;
    }

    public void befordern (Angestellte angestellte){
         angestellte.gehaltsfaktor *= 1.1;
    }
}
