package PripremaZaQuiz;

public class Zadatak1 {
    public static void main(String[] args){
        int[] lista = {11,22,0,47,28,2,0,0,1,1};
        countEvenOddZeroOccurrences(lista);
    }
    public static void countEvenOddZeroOccurrences(int[] numbers){
        int even=0, odd=0, zeros=0;
        for(int number : numbers){
            if( number%2==0 && number!=0){
                even++;
            }
            else if (number==0){
                zeros++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Count of even numbers is: "+even);
        System.out.println("Count of odd numbers is: "+odd);
        System.out.println("Count of zeros is: "+zeros);
    }
}
