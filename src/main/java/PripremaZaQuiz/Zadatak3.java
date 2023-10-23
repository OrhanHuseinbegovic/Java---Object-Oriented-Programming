package PripremaZaQuiz;

public class Zadatak3 {
    public static void main(String[] args){
        invertedHalfPyramid(5);
    }
    public static void invertedHalfPyramid(int rows){
        for(int i=0; i<rows; i++){
            for(int j=i; j<rows; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
