package Week3Lecture;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        /*Task1
        String passright = "Orhan22";
        while(true){
            System.out.println("Enter password: ");
            String pass = reader.nextLine();
            if(pass.equals(passright)){
                System.out.println("Right!");
                break;
            }
            System.out.println("Wrong!");
        }
        */

        /*Task2
        int sum = 0;
        int read;
        System.out.println("Enter first number: ");
        int n1 = reader.nextInt();
        System.out.println("Enter second number: ");
        int n2 = reader.nextInt();
        System.out.println("Enter third number: ");
        int n3 = reader.nextInt();
        sum = n1 + n2 + n3;
        System.out.println("Sum: "+sum);
        */

        /*Task3
        int sum = 0;
        while(true){
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0){
                break;
            }
            sum += read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
        */

        /*Task4
        System.out.println("Enter first number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Enter last number: ");
        int last = Integer.parseInt(reader.nextLine());
        if (last>first){
            while(first<=last){
                System.out.println(first++);
            }
        }
        */

        /*Task5
        System.out.println("Enter n: ");
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;
        for (int i=0; i<=n; i++){
            sum += (int)Math.pow(2,i);
        }
        System.out.println("Result is: "+sum);
         */

        /*Task6
        printText();
        */

        /*Task7
        printStars(5);
        */

    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java");
    }
    public static void printStars(int amount){
        for(int i=0; i<amount; i++){
            System.out.print("*");
        }
    }
}