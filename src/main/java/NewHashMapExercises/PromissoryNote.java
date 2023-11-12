package NewHashMapExercises;

import java.util.HashMap;

public class PromissoryNote {
    HashMap<String, Double> promissoryNote;
    PromissoryNote(){
        this.promissoryNote=new HashMap<String, Double>();
    }
    public void setLoan(String toWhom, double value){
        this.promissoryNote.put(toWhom,value);
    }
    public double howMuchIsTheDebt(String whose){
        if(this.promissoryNote.containsKey(whose)){
            return this.promissoryNote.get(whose);
        }
        else{
            return 0.0;
        }
    }
}
