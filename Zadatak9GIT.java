package PripremaZaQuiz;

public class Zadatak9GIT {
    public static void main(String[] args){
        drawStarsPiramid(5);
        System.out.println("");
        drawRevertedStarsPiramid(5);
        System.out.println("");
        drawNumberStarsPiramid(5);
        System.out.println("");
        drawSameNumbersPiramid(5);
        System.out.println("");

    }
    public static void drawStarsPiramid(int rows){
        for (int i=0; i<rows+1; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void drawRevertedStarsPiramid(int rows){
        for(int i=rows; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void drawNumberStarsPiramid(int rows){
        for (int i=0; i<rows+1; i++){
            for(int j=1; j<i+1; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void drawSameNumbersPiramid(int rows){
        for(int i=1; i<rows+1; i++){
            for(int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
