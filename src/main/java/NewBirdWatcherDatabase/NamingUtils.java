package NewBirdWatcherDatabase;

public class NamingUtils {
    public static boolean included(String name, String searchedName){
        searchedName=searchedName.toLowerCase();
        searchedName=searchedName.trim();
        return name.equals(searchedName);
    }
}
