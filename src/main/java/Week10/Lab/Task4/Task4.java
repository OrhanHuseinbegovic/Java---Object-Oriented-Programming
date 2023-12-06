package Week10.Lab.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        // Create a playlist of songs
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Song1", "Artist1", "Pop"));
        playlist.add(new Song("Song2", "Artist2", "Rock"));
        playlist.add(new Song("Song3", "Artist3", "Pop"));
        playlist.add(new Song("Song4", "Artist4", "Hip Hop"));

        // Create an instance of GenreFilterIterator
        String targetGenre = "Pop";
        GenreFilterIterator iterator = new GenreFilterIterator(playlist, targetGenre);

        // Use the iterator to print details of songs with the target genre
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Genre: " + song.getGenre());
        }
    }
}
