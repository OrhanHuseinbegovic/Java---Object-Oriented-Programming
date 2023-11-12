package Dictionary;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Scanner;

class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quits the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            }
            else if(command.equals("add")){
                System.out.print("\nIn Finnish: ");
                String finnish = reader.nextLine();
                System.out.print("\nTranslation: ");
                String translation = reader.nextLine();
                this.dictionary.put(finnish,translation);
            }
            else if(command.equals("translate")){
                System.out.print("\nGive a word: ");
                String word = reader.nextLine();
                System.out.print("\nTranslation: ");
                this.dictionary.get(word);
            }
            else{
                System.out.println("Unknown statement");
            }
        }
    }
}
