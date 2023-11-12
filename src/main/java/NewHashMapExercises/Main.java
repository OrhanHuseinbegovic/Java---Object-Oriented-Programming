package NewHashMapExercises;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);
        mattisNote.setLoan("Arto", 1);


        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
    }
}
