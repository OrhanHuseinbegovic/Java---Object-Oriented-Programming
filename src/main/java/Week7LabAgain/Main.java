package Week7LabAgain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        int[] values = {6,5,8,7,11};
        System.out.println("Smallest: "+smallest(values));
        System.out.println("\nIndex of the smallest: "+indexOfTheSmallest(values));
        int[] values1 = {-1,6,9,8,12};
        System.out.println(indexOfTheSmallestStartingFrom(values1,1)+"\n");
        System.out.println(indexOfTheSmallestStartingFrom(values1,2)+"\n");
        System.out.println(indexOfTheSmallestStartingFrom(values1,4));

        int[] values2 = {3,2,5,4,8};
        System.out.println(Arrays.toString(values2));
        swap(values2,1,0);
        System.out.println(Arrays.toString(values2));
        swap(values2,0,3);
        System.out.println(Arrays.toString(values2));



        int[] array = {-3,2,3,4,7,8,12};
        Scanner reader = new Scanner(System.in);



        System.out.println("Values of the array: "+ Arrays.toString(array));
        System.out.println();
        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array,Integer.parseInt(searchedValue));
        System.out.println(result);

         */
        int[] array = {5,1,3,4,2};
        printElegantly(array);
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        int size = array.length;
        for(int i=0; i<size; i++){
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array){
        int smallest = array[0];
        int size = array.length;
        int indexOfTheSmallest=0;
        for(int i=0; i<size; i++){
            if(array[i]<smallest){
                smallest = array[i];
                indexOfTheSmallest=i;
            }
        }
        return indexOfTheSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[index];
        int size = array.length;
        int indexOfTheSmallest=index;
        for(int i=index; i<size; i++){
            if(array[i]<smallest){
                smallest = array[i];
                indexOfTheSmallest=i;
            }
        }
        return indexOfTheSmallest;
    }

    public static void swap(int[] array, int index1, int index2){
        int emptycup = array[index1];//IZ KOLE U PRAZNU CASU, SAD JE KOLA PRAZNA
        array[index1]= array[index2];
        array[index2] = emptycup;
    }

    public static void printElegantly(int[] array){
        for(int i=0; i<array.length-1; i++){
            System.out.print(array[i]+", ");
        }
        System.out.print(array[array.length-1]);
    }
}