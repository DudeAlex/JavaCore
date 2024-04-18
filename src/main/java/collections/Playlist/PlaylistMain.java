package collections.Playlist;

public class PlaylistMain {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("Gangnam Style", "PSY", 3.23);
        playlist.addSong("Believer", "Imagine Dragons", 4.14);
        playlist.addSong("Shape of you", "Ed Sheeran", 3.45);

        System.out.println(playlist.songs[0].titel + " " + playlist.songs[0].interpret + " " + playlist.songs[0].dauer);
        System.out.println(playlist.songs[1].titel + " " + playlist.songs[2].interpret + " " + playlist.songs[3].dauer);
    }
}
