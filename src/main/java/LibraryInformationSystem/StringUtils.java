package LibraryInformationSystem;

public class StringUtils {
    public static boolean included(String word, String searched) {
        // If either of the strings is null, return false
        if (word == null || searched == null) {
            return false;
        }

        // Trim and convert both strings to uppercase for case-insensitive comparison
        String trimmedWord = word.trim().toUpperCase();
        String trimmedSearched = searched.trim().toUpperCase();

        // Check if the trimmedWord contains the trimmedSearched
        return trimmedWord.contains(trimmedSearched);
    }
}
