package collections.viertesemester.buchverwaltung;

public class Roman extends Buch {
    String genre;

    public Roman(String genre, String titel, String author){
        super(titel, author);
        this.genre = genre;
    }

    @Override
    public void zeigeInfo(){
        System.out.println(titel + " " + author + " " + genre);
    }
}
