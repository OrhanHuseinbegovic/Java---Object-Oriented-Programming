package Week7LabAgain;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue){
        int l = 0;
        int r = array.length-1;
        int m;
        while(l<=r){
            m = l+(r-l)/2;
            if(array[m]==searchedValue){
                return true;
            }
            else if(array[m]<searchedValue){
                l = m + 1;
            }
            else{
                r = m-1;
            }
        }
        return false;
    }
}
