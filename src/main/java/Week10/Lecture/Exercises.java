package Week10.Lecture;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercises {
    public static void main(String[] args) throws IOException {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Obtain an iterator for the ArrayList
        Iterator<String> iterator = fruits.iterator();

        // Iterate over the elements using the iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
    public static void simpleWrite(String text) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("output.txt")
        );
        bufferedWriter.write("Our first line \n");
        bufferedWriter.close();
    }
    public static void arrayFileWrite(String[] data) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("output.txt")
        );
        for (String name : data)
            bufferedWriter.write("\n" + name);

        bufferedWriter.close();
    }

}
