package Week10.Lab.Task4;

import java.util.List;
import java.util.NoSuchElementException;

public class GenreFilterIterator {
    private List<Song> playlist;
    private String targetGenre;
    private int currentIndex;

    public GenreFilterIterator(List<Song> playlist, String targetGenre) {
        this.playlist = playlist;
        this.targetGenre = targetGenre;
        this.currentIndex = 0;
    }


    public boolean hasNext() {
        while (currentIndex < playlist.size()) {
            if (playlist.get(currentIndex).getGenre().equals(targetGenre)) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more songs with the target genre");
        }
        Song song = playlist.get(currentIndex);
        currentIndex++;
        return song;
    }

}
