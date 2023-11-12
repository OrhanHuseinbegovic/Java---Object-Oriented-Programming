package HashMapExercises;

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        HashMap<String, Book> bookCollection = new HashMap<String, Book>();
        bookCollection.put(senseAndSensibility.getName(), senseAndSensibility);
        bookCollection.put(prideAndPrejudice.getName(), prideAndPrejudice);


        System.out.println(bookCollection.get("Sense and Sensibility"));
        System.out.println();
        System.out.println(bookCollection.get("Pride and Prejudice"));

    }
}
