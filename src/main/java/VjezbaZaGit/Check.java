package VjezbaZaGit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Check {

    public static void main(String[] args){
        List <Integer> listOfStudents = new ArrayList<Integer>();
        listOfStudents.add(1);
        listOfStudents.add(2);
        listOfStudents.add(213);
        listOfStudents.add(12);
        listOfStudents.add(442);
        listOfStudents.add(4);
        listOfStudents.add(88);

        sortedList((ArrayList<Integer>) listOfStudents);


    }
    public static void sortedList(ArrayList<Integer> list){
        list = (ArrayList<Integer>) list.stream()
                .sorted()
                .collect(Collectors.toList());
        for (int number : list){
            System.out.println(number);
        }
    }
}
