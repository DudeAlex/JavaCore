package collections.viertesemester.buchverwaltung;


public class Lehrbuch extends Buch {

    String fachgebiet;

    public Lehrbuch(String fachgebiet, String titel, String author){
        super(titel,author);
        this.fachgebiet = fachgebiet;
    }

    @Override
    public void zeigeInfo(){
        System.out.println(titel + " " + author + " " + fachgebiet);
    }
}
