package PripremaZaQuiz;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(perfectNumber(6));
    }

    public static boolean perfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }


}