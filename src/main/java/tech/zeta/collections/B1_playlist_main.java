package tech.zeta.collections;

public class B1_playlist_main {
    public static void main(String[] args) {
        B1_playlist playlist=new B1_playlist();

        playlist.addSongAtLast("Shape of You");
        playlist.addSongAtLast("Believer");
        playlist.addSongAtLast("Perfect");
        playlist.addSongAtLast("Faded");
        playlist.addSongAtLast("Cheap Thrills");

        playlist.addSongAtLast("Believer");

        playlist.displayPlaylist();

        playlist.removeSong("Believer");

        playlist.displayPlaylist();

    }
}
