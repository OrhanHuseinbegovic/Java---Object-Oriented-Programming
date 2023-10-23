package PripremaZaQuiz;

public class Zadatak5 {
    public static void main(String[] args){
        printTablesNumber(1,10,3);
    }
    public static void printTablesNumber(int start, int end, int number){
        for(int i=start; i<=end; i++){
            System.out.println(i+" * "+number+" = "+i*number);
        }
    }
}
