package NewBirdWatcherDatabase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = "";
        BirdWatcherDatabase birdWatcherDatabase= new BirdWatcherDatabase();
        while(!input.equals("quit")){
            System.out.print("? ");
            input = reader.nextLine();
            System.out.println();
            if(input.equals("add")){
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin name: ");
                String latinName = reader.nextLine();
                Bird bird = new Bird(name,latinName);
                birdWatcherDatabase.addBird(bird);
            }
            else if(input.equals("observation")){
                System.out.println("Who was observed: (?)  ");
                String observed = reader.nextLine();
                if(birdWatcherDatabase.searchByName(observed)){
                    birdWatcherDatabase.returnBird(observed).observe();
                }
                else{
                    System.out.println("Is not a bird!");
                }
            }
            else if(input.equals("statistics")){
                birdWatcherDatabase.printAllBirds();
            }
            else if(input.equals("show")){
                System.out.print("What? ");
                String show = reader.nextLine();
                if(birdWatcherDatabase.searchByName(show)){
                    Bird bird = birdWatcherDatabase.returnBird(show);
                    System.out.println(bird);
                }
            }
        }
    }
}
