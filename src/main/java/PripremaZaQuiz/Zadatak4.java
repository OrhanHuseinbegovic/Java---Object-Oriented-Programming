package PripremaZaQuiz;

public class Zadatak4 {
    public static void main(String[] args){
        System.out.println(baseRaisedToPower(2,8));
    }
    public static int baseRaisedToPower(int base, int power){
        int total = 1;
        for (int i=0; i<power; i++){
            total = total * base;
        }
        return total;
    }
}
