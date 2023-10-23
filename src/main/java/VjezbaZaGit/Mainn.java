package VjezbaZaGit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Mainn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        ArrayList<Integer> sortedList = sortUsingSorted(list);
        System.out.println("Sorted List: " + sortedList);

        ArrayList<Integer> customSorted = sortUsingCustomComparator(list);
        System.out.println("Custom Sorted List: " + customSorted);

        inPlaceSort(list);
        System.out.println("In-Place Sorted List: " + list);

        reverseList(list);
        System.out.println("Reversed List: " + list);
    }

    public static ArrayList<Integer> sortUsingSorted(ArrayList<Integer> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> sortUsingCustomComparator(ArrayList<Integer> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder()) // Reverse order sorting
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void inPlaceSort(ArrayList<Integer> list) {
        list.sort(Comparator.naturalOrder()); // Sorts in natural order
    }

    public static void reverseList(ArrayList<Integer> list) {
        Collections.reverse(list);
    }
}
