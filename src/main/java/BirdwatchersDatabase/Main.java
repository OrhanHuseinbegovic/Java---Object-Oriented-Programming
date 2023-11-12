package BirdwatchersDatabase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdwatchersDatabase db = new BirdwatchersDatabase();

        /* tring input = "";
        while(!input.equals("quit")){
            System.out.print("? ");
            input = scanner.nextLine();
            switch (input){
                case "add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Latin Name: ");
                    String latinName = scanner.nextLine();
                    db.addBird(name, latinName);
                    break;
                case "observation":
                    System.out.print("What was observed:? ");
                    name = scanner.nextLine();
                    db.observeBird(name);
                    break;
                case "statistics":
                    break;
                case "show":
                    break;
                case "quit":
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }

         */
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("Quit")) {
                break;
            } else if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                db.addBird(name, latinName);
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("What was observed:? ");
                String name = scanner.nextLine();
                db.observeBird(name);
            } else if (command.equalsIgnoreCase("Statistics")) {
                db.printStatistics();
            } else if (command.equalsIgnoreCase("Show")) {
                System.out.print("What? ");
                String name = scanner.nextLine();
                db.showBird(name);
            }
        }
        scanner.close();

    }
}
