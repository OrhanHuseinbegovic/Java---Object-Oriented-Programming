package Week7Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int[] values = {6,5,8,7,11};
        System.out.println("Smallest: "+smallest(values));
        System.out.println("-----");
        int[] values2 = {6,5,8,7,11};
        System.out.println("Index of the smallest: "+indexOfTheSmallest(values2));
        int[] values3 = {-1,6,9,8,12};
        System.out.println(indexOfTheSmallestStartingFrom(values3,1));
        System.out.println(indexOfTheSmallestStartingFrom(values3,2));
        System.out.println(indexOfTheSmallestStartingFrom(values3,4));
        System.out.println("-----");
        int[] values4 = {3,2,5,4,8};
        System.out.println(Arrays.toString(values4));
        swap(values4,1,0);
        System.out.println(Arrays.toString(values4));
        swap(values4,0,3);
        System.out.println(Arrays.toString(values4));
         */

        /*
        int[] values5 = {-3,2,3,4,7,8,12};
        Scanner reader = new Scanner(System.in);
        System.out.println("Values of the array: "+Arrays.toString(values5));
        System.out.println();
        System.out.println("Enter searcher number: ");
        String searchedValues = reader.nextLine();
        System.out.println();

        boolean result = search(values5, Integer.parseInt(searchedValues));

        if (result){
            System.out.println("Value "+searchedValues+" is in the array");
        }
        else{
            System.out.println("Value "+searchedValues+" is not in the array");
        }

         */

        /*
        int[] values6 = {5,1,3,4,2};
        printElegantly(values6);

         */


    }



    public static void printElegantly(int[] array){
        for(int i=0; i<array.length-1;i++){
            System.out.print(array[i]+", ");
        }
        int last = array.length;
        System.out.print(array[last-1]);
        System.out.println();
    }

    public static boolean search(int[] array, int searchedValue){
        for(int i=0; i<array.length; i++){
            if(array[i]==searchedValue){
                return true;
            }
        }
        return false;
    }

    public static int smallest(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    public static int indexOfTheSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]<smallest){
                smallest=array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[index];
        for(int i=index; i<array.length; i++){
            if(array[i]<smallest){
                smallest=array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int emptyCup=array[index1];
        array[index1]=array[index2];
        array[index2]=emptyCup;
    }
}
