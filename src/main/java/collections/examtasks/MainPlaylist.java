package collections.examtasks;

public class MainPlaylist {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("Bailando", "Enrique", 3.12);
        playlist.addSong("Another love", "Tom Odel", 2.28);

        playlist.printPlaylist();
    }
}
