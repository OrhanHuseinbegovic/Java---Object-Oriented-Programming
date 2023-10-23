package PripremaZaQuiz;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int suma = 0;

        while(true){
            System.out.println("Enter umber: ");
            int n = Integer.parseInt(reader.nextLine());
            if(n!=0) suma+=n;
            else break;
        }

        System.out.println("Sum is: "+suma);

    }

}
