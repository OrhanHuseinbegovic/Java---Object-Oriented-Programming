package HashMapExercises;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*
        HashMap<String, String> nicknameMap = new HashMap<>();

        nicknameMap.put("matti", "mage");
        nicknameMap.put("mikael", "mixu");
        nicknameMap.put("arto", "arppa");

        String mikaelNickname = nicknameMap.get("mikael");
        System.out.println("Mikael's nickname is: " + mikaelNickname);
         */


        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);


        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));

        /*
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);


        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));

         */

    }
}
