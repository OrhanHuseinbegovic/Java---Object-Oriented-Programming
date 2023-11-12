package GenericsExercises;

import java.util.List;

public class NumberSumCalculator {
    public static void main(String[] args) {
        // Example usage:
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int[] result = sumEvenOddNumbers(numbers);

        System.out.println("Sum of even numbers: " + result[0]);
        System.out.println("Sum of odd numbers: " + result[1]);
    }

    public static <T extends Number> int[] sumEvenOddNumbers(List<T> numbers) {
        int sumEven = 0;
        int sumOdd = 0;

        for (T number : numbers) {
            int value = number.intValue();

            if (value % 2 == 0) {
                sumEven += value;
            } else {
                sumOdd += value;
            }
        }

        return new int[]{sumEven, sumOdd};
    }
}
