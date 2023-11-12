package HashMapExercises;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loans;

    public PromissoryNote() {
        this.loans = new HashMap<>();
    }

    public void setLoan(String toWhom, double value) {
        loans.put(toWhom, value); // This will overwrite any existing debt for the same person.
    }

    public double howMuchIsTheDebt(String whose) {
        if (loans.containsKey(whose)) {
            return loans.get(whose);
        } else {
            return 0.0; // If no debt information is found, return 0.0 as the default value.
        }
    }

    public static void main(String[] args) {
        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto")); // Should print 10.5
    }
}