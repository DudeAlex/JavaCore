package collections.Playlist;

public class Playlist {

    private int counter = 0;

    public Song[] songs = new Song[10];

    public void addSong(String titel, String interpret, double dauer){
        if(dauer > 0){
            songs[counter] = new Song(titel, interpret, dauer);
            counter++;
        }
    }

    public Song[] getSongs(){
        return songs;
    }
}
