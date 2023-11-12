package BirdwatchersDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirdwatchersDatabase {
    /*
    Note 1: Your program should use only one Scanner object, i.e.,
    it is allowed to call new Scanner only once.
    Note 2: Do not save anything in static variables. The
    main method is executed by the tests multiple times so
     the use of static variables might cause problems.
    In this assignment you are supposed to design and implement an
     observation database for a bird watcher. The database contains birds,
     each of which have a name and a Latin name, both Strings. Database
     also tracks how many times each bird has been observed.
    The program should implement the following commands:
    Add - adds a bird
    Observation - adds an observation
    Statistics - prints all the birds
    Show - prints one bird
    Quit - terminates the program
    The program should also handle the invalid inputs (see Turing below).
    The following is an example how the program is supposed to work
     */
    private List<Bird> birds;

    public BirdwatchersDatabase() {
        birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public void observeBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.observe();
                return;
            }
        }
        System.out.println("It is not a bird!");
    }

    public void printStatistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void showBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Bird not found!");
    }
}

