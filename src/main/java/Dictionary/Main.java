package Dictionary;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Dictionary;

public class Main {
    public static void main(String[] args) {
        /*
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        System.out.println(dictionary.amountOfWords());


        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());


        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");


        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
         */
        Scanner reader = new Scanner(System.in);
        Dictionary dictionary = new Dictionary() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public Enumeration keys() {
                return null;
            }

            @Override
            public Enumeration elements() {
                return null;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }
        };

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();



    }
}
