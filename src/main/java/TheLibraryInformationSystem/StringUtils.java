package TheLibraryInformationSystem;

public class StringUtils {
    public static boolean included(String word, String searched){
        if(word==null){
            return false;
        }
        else if(searched==null){
            return false;
        }
        searched = searched.toLowerCase();
        searched=searched.trim();
        return word.contains(searched);
    }
}
