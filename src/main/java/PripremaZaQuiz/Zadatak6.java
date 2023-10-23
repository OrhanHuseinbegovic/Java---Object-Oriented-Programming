package PripremaZaQuiz;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Zadatak6 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String test1="Orhan";
        String test2="Emina";
        boolean istina = !(test2.equals(test1));
        System.out.println("It is not "+istina+" that word 1: "+test1+" is same as word 2: "+test2);
        while(true){
            System.out.println("Enter password: ");
            String pass = reader.nextLine();
            if(pass.equals(test1)){
                System.out.println("Password is correct!");
                break;
            }
            else{
                System.out.println("WRONG!");
            }
        }

        }
    }

