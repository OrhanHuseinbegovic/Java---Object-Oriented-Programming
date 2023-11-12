package GenericsExercises;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Example usage:
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> reversedNumbers = reverseList(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("Reversed list: " + reversedNumbers);

        List<String> words = List.of("apple", "banana", "orange");
        List<String> reversedWords = reverseList(words);

        System.out.println("Original list: " + words);
        System.out.println("Reversed list: " + reversedWords);
    }

    public static <T> List<T> reverseList(List<T> originalList) {
        List<T> reversedList = new ArrayList<>(originalList);
        int size = originalList.size();

        for (int i = 0; i < size / 2; i++) {
            T temp = reversedList.get(i);
            reversedList.set(i, reversedList.get(size - 1 - i));
            reversedList.set(size - 1 - i, temp);
        }

        return reversedList;
    }
}