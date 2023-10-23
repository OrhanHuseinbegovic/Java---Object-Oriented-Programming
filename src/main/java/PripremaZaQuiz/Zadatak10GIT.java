package PripremaZaQuiz;

import java.util.Scanner;

public class Zadatak10GIT {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int drawNumber = 76;
        int counter = 0;
        while(true){
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            if(guess>drawNumber){
                counter++;
                System.out.println("The number is lesser, guess made: "+counter);
            }
            else if (guess<drawNumber) {
                counter++;
                System.out.println("The number is greater, guess made: "+counter);
            }
            else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

    }
}
