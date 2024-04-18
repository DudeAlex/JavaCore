package collections.Playlist;

public class Song {
    String titel;
    String interpret;
    double dauer;

    public Song(String titel, String interpret, double dauer){
        this.titel = titel;
        this.interpret = interpret;
        if(dauer < 0){
            throw new RuntimeException();
        } else this.dauer = dauer;
    }
}
