package collections.examtasks;

public class Playlist {

    private int counter = 0;
    private Song[] songs = new Song[10];

    public void addSong(String titel, String interpret, double dauer){
        if(dauer > 0){
            songs[counter] = new Song(titel, interpret, dauer);
            counter++;
        }
    }

    public void printPlaylist(){
        for(int i = 0; i < counter; i++){
            System.out.println(songs[i].getTitel() + " " + songs[i].getInterpret() + " " + songs[i].getDauer());
        }
    }

    public Song[] getSongs(){
        return songs;
    }
}
