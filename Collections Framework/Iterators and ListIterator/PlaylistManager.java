import java.util.*;

public class PlaylistManager {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("Kesariya");
        playlist.add("Pasoori");
        playlist.add("Raataan Lambiyan");
        playlist.add("Tera Ban Jaunga");

        ListIterator<String> listIterator = playlist.listIterator();

        System.out.println("Forward traversal of playlist:");
        while (listIterator.hasNext()) {
            String song = listIterator.next();
            System.out.println("Playing: " + song);

            if (song.equals("Pasoori")) {
                listIterator.set("Galliyan");
                System.out.println("Replaced 'Pasoori' with 'Galliyan'.");
            }
        }

        System.out.println("\nBackward traversal of playlist:");
        while (listIterator.hasPrevious()) {
            String song = listIterator.previous();
            System.out.println("Replaying: " + song);

            if (song.equals("Tera Ban Jaunga")) {
                listIterator.add("Tum Hi Ho");
                System.out.println("Added 'Tum Hi Ho' before 'Tera Ban Jaunga'.");
            }
        }

        System.out.println("\nFinal Playlist: " + playlist);
    }
}
